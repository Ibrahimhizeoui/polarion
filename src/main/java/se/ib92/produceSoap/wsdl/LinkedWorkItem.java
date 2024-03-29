//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 10:54:13 AM CET 
//


package se.ib92.produceSoap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkedWorkItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinkedWorkItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="role" type="{http://ws.polarion.com/TrackerWebService-types}EnumOptionId" minOccurs="0"/&gt;
 *         &lt;element name="suspect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="workItemURI" type="{http://ws.polarion.com/types}SubterraURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinkedWorkItem", propOrder = {
    "revision",
    "role",
    "suspect",
    "workItemURI"
})
public class LinkedWorkItem {

    protected String revision;
    protected EnumOptionId role;
    protected Boolean suspect;
    protected String workItemURI;

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link EnumOptionId }
     *     
     */
    public EnumOptionId getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnumOptionId }
     *     
     */
    public void setRole(EnumOptionId value) {
        this.role = value;
    }

    /**
     * Gets the value of the suspect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuspect() {
        return suspect;
    }

    /**
     * Sets the value of the suspect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuspect(Boolean value) {
        this.suspect = value;
    }

    /**
     * Gets the value of the workItemURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkItemURI() {
        return workItemURI;
    }

    /**
     * Sets the value of the workItemURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkItemURI(String value) {
        this.workItemURI = value;
    }

}
