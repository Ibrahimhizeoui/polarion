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
 * <p>Java class for BuildTestResults complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildTestResults"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="errorCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="failureCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="skippedCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="testCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuildTestResults", namespace = "http://ws.polarion.com/BuilderWebService-types", propOrder = {
    "errorCount",
    "failureCount",
    "skippedCount",
    "testCount"
})
public class BuildTestResults {

    protected Integer errorCount;
    protected Integer failureCount;
    protected Integer skippedCount;
    protected Integer testCount;

    /**
     * Gets the value of the errorCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * Sets the value of the errorCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setErrorCount(Integer value) {
        this.errorCount = value;
    }

    /**
     * Gets the value of the failureCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFailureCount() {
        return failureCount;
    }

    /**
     * Sets the value of the failureCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFailureCount(Integer value) {
        this.failureCount = value;
    }

    /**
     * Gets the value of the skippedCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSkippedCount() {
        return skippedCount;
    }

    /**
     * Sets the value of the skippedCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSkippedCount(Integer value) {
        this.skippedCount = value;
    }

    /**
     * Gets the value of the testCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTestCount() {
        return testCount;
    }

    /**
     * Sets the value of the testCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTestCount(Integer value) {
        this.testCount = value;
    }

}
