//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.29 at 10:55:53 AM IST 
//


package com.java.wsdl.java;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.java.wsdl.java package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FaultRelatedException_QNAME = new QName("http://schemas.cordys.com/General/1.0/", "FaultRelatedException");
    private final static QName _NestedMessageLocalizableMessage_QNAME = new QName("http://schemas.cordys.com/General/1.0/", "LocalizableMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.java.wsdl.java
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Values }
     * 
     */
    public Values createValues() {
        return new Values();
    }

    /**
     * Create an instance of {@link NestedMessage }
     * 
     */
    public NestedMessage createNestedMessage() {
        return new NestedMessage();
    }

    /**
     * Create an instance of {@link Values.Item }
     * 
     */
    public Values.Item createValuesItem() {
        return new Values.Item();
    }

    /**
     * Create an instance of {@link Cursor }
     * 
     */
    public Cursor createCursor() {
        return new Cursor();
    }

    /**
     * Create an instance of {@link ProposalDocumentPush }
     * 
     */
    public ProposalDocumentPush createProposalDocumentPush() {
        return new ProposalDocumentPush();
    }

    /**
     * Create an instance of {@link ProposalDocumentPushResponse }
     * 
     */
    public ProposalDocumentPushResponse createProposalDocumentPushResponse() {
        return new ProposalDocumentPushResponse();
    }

    /**
     * Create an instance of {@link com.java.wsdl.java.LocalizableMessage }
     * 
     */
    public com.java.wsdl.java.LocalizableMessage createLocalizableMessage() {
        return new com.java.wsdl.java.LocalizableMessage();
    }

    /**
     * Create an instance of {@link FaultDetails }
     * 
     */
    public FaultDetails createFaultDetails() {
        return new FaultDetails();
    }

    /**
     * Create an instance of {@link NestedMessage.LocalizableMessage }
     * 
     */
    public NestedMessage.LocalizableMessage createNestedMessageLocalizableMessage() {
        return new NestedMessage.LocalizableMessage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.cordys.com/General/1.0/", name = "FaultRelatedException")
    public JAXBElement<String> createFaultRelatedException(String value) {
        return new JAXBElement<String>(_FaultRelatedException_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NestedMessage.LocalizableMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.cordys.com/General/1.0/", name = "LocalizableMessage", scope = NestedMessage.class)
    public JAXBElement<NestedMessage.LocalizableMessage> createNestedMessageLocalizableMessage(NestedMessage.LocalizableMessage value) {
        return new JAXBElement<NestedMessage.LocalizableMessage>(_NestedMessageLocalizableMessage_QNAME, NestedMessage.LocalizableMessage.class, NestedMessage.class, value);
    }

}
