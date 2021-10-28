//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.10.28 at 08:15:14 PM IST 
//


package com.java.wsdl.java;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Insertion" type="{http://schemas.cordys.com/General/1.0/}NestedMessage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageCode",
    "insertion"
})
@XmlRootElement(name = "LocalizableMessage", namespace = "http://schemas.cordys.com/General/1.0/")
public class LocalizableMessage {

    @XmlElement(name = "MessageCode", namespace = "http://schemas.cordys.com/General/1.0/", required = true)
    protected String messageCode;
    @XmlElement(name = "Insertion", namespace = "http://schemas.cordys.com/General/1.0/")
    protected List<NestedMessage> insertion;

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the insertion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insertion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NestedMessage }
     * 
     * 
     */
    public List<NestedMessage> getInsertion() {
        if (insertion == null) {
            insertion = new ArrayList<NestedMessage>();
        }
        return this.insertion;
    }

}
