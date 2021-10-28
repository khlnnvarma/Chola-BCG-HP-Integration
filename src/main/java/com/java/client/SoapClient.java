package com.java.client;

import javax.net.ssl.TrustManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.java.request.ProposalDocumentRequest;
import com.java.soapconfig.HttpsUrlConnectionMessageSender;
import com.java.soapconfig.UnTrustworthyTrustManager;
import com.java.wsdl.java.ProposalDocumentPush;
import com.java.wsdl.java.ProposalDocumentPushResponse;



@Service
public class SoapClient {
	
	@Autowired
	private Jaxb2Marshaller marshaller;

	private WebServiceTemplate template;

	public ProposalDocumentPushResponse getdetails(ProposalDocumentRequest request) {
		ProposalDocumentPush proposalDocumentrequest = new ProposalDocumentPush();
		proposalDocumentrequest.setData(request);
		template = new WebServiceTemplate(marshaller);
		
		HttpsUrlConnectionMessageSender sender = new HttpsUrlConnectionMessageSender();
		sender.setTrustManagers(new TrustManager[] { new UnTrustworthyTrustManager() });
		template.setMessageSender(sender);
		ProposalDocumentPushResponse acknowledgement = (ProposalDocumentPushResponse) template.marshalSendAndReceive("https://workflow.cholainsurance.com/cordys/com.eibus.web.soap.Gateway.wcp?organization=o=cholams,cn=cordys,cn=uatInst,o=cholamandalamins.com",
				proposalDocumentrequest);
		return acknowledgement;
	}

}
