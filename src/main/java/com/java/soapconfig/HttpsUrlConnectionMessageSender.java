package com.java.soapconfig;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;
import org.springframework.ws.transport.http.HttpTransportException;

public class HttpsUrlConnectionMessageSender extends HttpUrlConnectionMessageSender implements InitializingBean{
	
	 public static final String DEFAULT_SSL_PROTOCOL = "ssl";
	  
     private String sslProtocol = DEFAULT_SSL_PROTOCOL;
 
     private String sslProvider;

     private KeyManager[] keyManagers;
 
     private TrustManager[] trustManagers;
 
     private HostnameVerifier hostnameVerifier;
 
     private SecureRandom rnd;
 
     private SSLSocketFactory sslSocketFactory;
 
     /**
      * Sets the SSL protocol to use. Default is {@code ssl}.
      *
      * @see SSLContext#getInstance(String, String)
      */
     public void setSslProtocol(String sslProtocol) {
         Assert.hasLength(sslProtocol, "'sslProtocol' must not be empty");
         this.sslProtocol = sslProtocol;
     }
 
     /**
      * Sets the SSL provider to use. Default is empty, to use the default provider.
      *
      * @see SSLContext#getInstance(String, String)
      */
     public void setSslProvider(String sslProvider) {
         this.sslProvider = sslProvider;
     }
 
     /**
      * Specifies the key managers to use for this message sender.
      * <p/>
      * Setting either this property or {@link #setTrustManagers(TrustManager[]) trustManagers}  is required.
      *
      * @see SSLContext#init(KeyManager[], TrustManager[], SecureRandom)
      */
     public void setKeyManagers(KeyManager[] keyManagers) {
         this.keyManagers = keyManagers;
     }
 
     /**
      * Specifies the trust managers to use for this message sender.
      * <p/>
      * Setting either this property or {@link #setKeyManagers(KeyManager[]) keyManagers}  is required.
      *
      * @see SSLContext#init(KeyManager[], TrustManager[], SecureRandom)
      */
    public void setTrustManagers(TrustManager[] trustManagers) {
        this.trustManagers = trustManagers;
    }

    /**
     * Specifies the host name verifier to use for this message sender.
     *
     * @see HttpsURLConnection#setHostnameVerifier(HostnameVerifier)
     */
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    /**
     * Specifies the secure random to use for this message sender.
     *
     * @see SSLContext#init(KeyManager[], TrustManager[], SecureRandom)
     */
    public void setSecureRandom(SecureRandom rnd) {
        this.rnd = rnd;
    }

    /**
     * Specifies the SSLSocketFactory to use for this message sender.
     *
     * @see HttpsURLConnection#setSSLSocketFactory(SSLSocketFactory sf)
     */
    public void setSslSocketFactory(SSLSocketFactory sslSocketFactory) {
        this.sslSocketFactory = sslSocketFactory;
    }

    public void afterPropertiesSet() throws Exception {
        Assert.isTrue(
                !(ObjectUtils.isEmpty(keyManagers) && ObjectUtils.isEmpty(trustManagers) && (sslSocketFactory == null)),
                "Setting either 'keyManagers', 'trustManagers' or 'sslSocketFactory' is required");
    }

    @Override
    protected void prepareConnection(HttpURLConnection connection) throws IOException {
        super.prepareConnection(connection);
        if (connection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsConnection = (HttpsURLConnection) connection;
            httpsConnection.setSSLSocketFactory(createSslSocketFactory());

            if (hostnameVerifier != null) {
                httpsConnection.setHostnameVerifier(hostnameVerifier);
            }
        }
    }

    private SSLSocketFactory createSslSocketFactory() throws HttpTransportException {
        if (this.sslSocketFactory != null) {
            return this.sslSocketFactory;
        }
        try {
            SSLContext sslContext =
                    StringUtils.hasLength(sslProvider) ? SSLContext.getInstance(sslProtocol, sslProvider) :
                            SSLContext.getInstance(sslProtocol);
            sslContext.init(keyManagers, trustManagers, rnd);
           if (logger.isDebugEnabled()) {
                logger.debug("Initialized SSL Context with key managers [" +
                        StringUtils.arrayToCommaDelimitedString(keyManagers) + "] trust managers [" +
                        StringUtils.arrayToCommaDelimitedString(trustManagers) + "] secure random [" + rnd +
                        "]");
            }
            return sslContext.getSocketFactory();
        }
        catch (NoSuchAlgorithmException ex) {
            throw new HttpTransportException("Could not create SSLContext: " + ex.getMessage());
        }
        catch (NoSuchProviderException ex) {
            throw new HttpTransportException("Could not create SSLContext: " + ex.getMessage());
        }
        catch (KeyManagementException ex) {
            throw new HttpTransportException("Could not initialize SSLContext: " + ex.getMessage());
        }

    }

}

