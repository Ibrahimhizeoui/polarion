//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.11.13 at 10:54:13 AM CET 
//


package se.ib92.produceSoap.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Build complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Build"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="author" type="{http://ws.polarion.com/ProjectWebService-types}User" minOccurs="0"/&gt;
 *         &lt;element name="birLocation" type="{http://ws.polarion.com/types}Location" minOccurs="0"/&gt;
 *         &lt;element name="buildDescriptorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildTag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="buildTestResults" type="{http://ws.polarion.com/BuilderWebService-types}BuildTestResults" minOccurs="0"/&gt;
 *         &lt;element name="calculationDescriptorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="creationTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="finishTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="linkedWorkItems" type="{http://ws.polarion.com/BuilderWebService-types}ArrayOfBuildLinkedWorkItem" minOccurs="0"/&gt;
 *         &lt;element name="localDeploymentSpaceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="logFiles" type="{http://ws.polarion.com/types}ArrayOfLocation" minOccurs="0"/&gt;
 *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="uri" type="{http://ws.polarion.com/types}SubterraURI" /&gt;
 *       &lt;attribute name="unresolvable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Build", namespace = "http://ws.polarion.com/BuilderWebService-types", propOrder = {
    "author",
    "birLocation",
    "buildDescriptorName",
    "buildStamp",
    "buildStatus",
    "buildTag",
    "buildTestResults",
    "calculationDescriptorName",
    "creationTime",
    "finishTime",
    "id",
    "jobId",
    "linkedWorkItems",
    "localDeploymentSpaceName",
    "logFiles",
    "startTime"
})
public class Build {

    protected User author;
    protected String birLocation;
    protected String buildDescriptorName;
    protected String buildStamp;
    protected String buildStatus;
    protected String buildTag;
    protected BuildTestResults buildTestResults;
    protected String calculationDescriptorName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationTime;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar finishTime;
    protected String id;
    protected String jobId;
    protected ArrayOfBuildLinkedWorkItem linkedWorkItems;
    protected String localDeploymentSpaceName;
    protected ArrayOfLocation logFiles;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startTime;
    @XmlAttribute(name = "uri")
    protected String uri;
    @XmlAttribute(name = "unresolvable")
    protected Boolean unresolvable;

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setAuthor(User value) {
        this.author = value;
    }

    /**
     * Gets the value of the birLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirLocation() {
        return birLocation;
    }

    /**
     * Sets the value of the birLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirLocation(String value) {
        this.birLocation = value;
    }

    /**
     * Gets the value of the buildDescriptorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildDescriptorName() {
        return buildDescriptorName;
    }

    /**
     * Sets the value of the buildDescriptorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildDescriptorName(String value) {
        this.buildDescriptorName = value;
    }

    /**
     * Gets the value of the buildStamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildStamp() {
        return buildStamp;
    }

    /**
     * Sets the value of the buildStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildStamp(String value) {
        this.buildStamp = value;
    }

    /**
     * Gets the value of the buildStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildStatus() {
        return buildStatus;
    }

    /**
     * Sets the value of the buildStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildStatus(String value) {
        this.buildStatus = value;
    }

    /**
     * Gets the value of the buildTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildTag() {
        return buildTag;
    }

    /**
     * Sets the value of the buildTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildTag(String value) {
        this.buildTag = value;
    }

    /**
     * Gets the value of the buildTestResults property.
     * 
     * @return
     *     possible object is
     *     {@link BuildTestResults }
     *     
     */
    public BuildTestResults getBuildTestResults() {
        return buildTestResults;
    }

    /**
     * Sets the value of the buildTestResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuildTestResults }
     *     
     */
    public void setBuildTestResults(BuildTestResults value) {
        this.buildTestResults = value;
    }

    /**
     * Gets the value of the calculationDescriptorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculationDescriptorName() {
        return calculationDescriptorName;
    }

    /**
     * Sets the value of the calculationDescriptorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculationDescriptorName(String value) {
        this.calculationDescriptorName = value;
    }

    /**
     * Gets the value of the creationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationTime() {
        return creationTime;
    }

    /**
     * Sets the value of the creationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationTime(XMLGregorianCalendar value) {
        this.creationTime = value;
    }

    /**
     * Gets the value of the finishTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFinishTime() {
        return finishTime;
    }

    /**
     * Sets the value of the finishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFinishTime(XMLGregorianCalendar value) {
        this.finishTime = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the linkedWorkItems property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBuildLinkedWorkItem }
     *     
     */
    public ArrayOfBuildLinkedWorkItem getLinkedWorkItems() {
        return linkedWorkItems;
    }

    /**
     * Sets the value of the linkedWorkItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBuildLinkedWorkItem }
     *     
     */
    public void setLinkedWorkItems(ArrayOfBuildLinkedWorkItem value) {
        this.linkedWorkItems = value;
    }

    /**
     * Gets the value of the localDeploymentSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDeploymentSpaceName() {
        return localDeploymentSpaceName;
    }

    /**
     * Sets the value of the localDeploymentSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDeploymentSpaceName(String value) {
        this.localDeploymentSpaceName = value;
    }

    /**
     * Gets the value of the logFiles property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLocation }
     *     
     */
    public ArrayOfLocation getLogFiles() {
        return logFiles;
    }

    /**
     * Sets the value of the logFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLocation }
     *     
     */
    public void setLogFiles(ArrayOfLocation value) {
        this.logFiles = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
    }

    /**
     * Gets the value of the unresolvable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnresolvable() {
        return unresolvable;
    }

    /**
     * Sets the value of the unresolvable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnresolvable(Boolean value) {
        this.unresolvable = value;
    }

}
