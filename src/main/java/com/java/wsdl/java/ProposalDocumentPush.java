//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.11.09 at 02:08:27 PM IST 
//


package com.java.wsdl.java;

import java.util.HashMap;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;


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
 *         &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://schemas.cordys.com/BCGHPWSApp}GetMethodAttributes"/&gt;
 *       &lt;anyAttribute namespace='http://schemas.cordys.com/General/ClientAttributes/'/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "data"
})
@XmlRootElement(name = "ProposalDocumentPush")
public class ProposalDocumentPush {

    @XmlElement(required = true)
    protected Object data;
    @XmlAttribute(name = "preserveSpace")
    protected String preserveSpace;
    @XmlAttribute(name = "qAccess")
    protected String qAccess;
    @XmlAttribute(name = "qValues")
    protected String qValues;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setData(Object value) {
        this.data = value;
    }

    /**
     * Gets the value of the preserveSpace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreserveSpace() {
        if (preserveSpace == null) {
            return "no";
        } else {
            return preserveSpace;
        }
    }

    /**
     * Sets the value of the preserveSpace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreserveSpace(String value) {
        this.preserveSpace = value;
    }

    /**
     * Gets the value of the qAccess property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQAccess() {
        if (qAccess == null) {
            return "0";
        } else {
            return qAccess;
        }
    }

    /**
     * Sets the value of the qAccess property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQAccess(String value) {
        this.qAccess = value;
    }

    /**
     * Gets the value of the qValues property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQValues() {
        if (qValues == null) {
            return "";
        } else {
            return qValues;
        }
    }

    /**
     * Sets the value of the qValues property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQValues(String value) {
        this.qValues = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
