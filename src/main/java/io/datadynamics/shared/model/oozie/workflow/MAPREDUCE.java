//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.09.30 시간 10:51:07 PM KST 
//


package io.datadynamics.shared.model.oozie.workflow;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MAP-REDUCE complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="MAP-REDUCE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="job-tracker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name-node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prepare" type="{uri:oozie:workflow:0.5}PREPARE" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="streaming" type="{uri:oozie:workflow:0.5}STREAMING" minOccurs="0"/&gt;
 *           &lt;element name="pipes" type="{uri:oozie:workflow:0.5}PIPES" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="job-xml" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="configuration" type="{uri:oozie:workflow:0.5}CONFIGURATION" minOccurs="0"/&gt;
 *         &lt;element name="config-class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="file" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="archive" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAP-REDUCE", propOrder = {
    "jobTracker",
    "nameNode",
    "prepare",
    "streaming",
    "pipes",
    "jobXml",
    "configuration",
    "configClass",
    "file",
    "archive"
})
public class MAPREDUCE {

    @XmlElement(name = "job-tracker")
    protected String jobTracker;
    @XmlElement(name = "name-node")
    protected String nameNode;
    protected PREPARE prepare;
    protected STREAMING streaming;
    protected PIPES pipes;
    @XmlElement(name = "job-xml")
    protected List<String> jobXml;
    protected CONFIGURATION configuration;
    @XmlElement(name = "config-class")
    protected String configClass;
    protected List<String> file;
    protected List<String> archive;

    /**
     * jobTracker 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTracker() {
        return jobTracker;
    }

    /**
     * jobTracker 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTracker(String value) {
        this.jobTracker = value;
    }

    /**
     * nameNode 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameNode() {
        return nameNode;
    }

    /**
     * nameNode 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameNode(String value) {
        this.nameNode = value;
    }

    /**
     * prepare 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PREPARE }
     *     
     */
    public PREPARE getPrepare() {
        return prepare;
    }

    /**
     * prepare 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PREPARE }
     *     
     */
    public void setPrepare(PREPARE value) {
        this.prepare = value;
    }

    /**
     * streaming 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link STREAMING }
     *     
     */
    public STREAMING getStreaming() {
        return streaming;
    }

    /**
     * streaming 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link STREAMING }
     *     
     */
    public void setStreaming(STREAMING value) {
        this.streaming = value;
    }

    /**
     * pipes 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PIPES }
     *     
     */
    public PIPES getPipes() {
        return pipes;
    }

    /**
     * pipes 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PIPES }
     *     
     */
    public void setPipes(PIPES value) {
        this.pipes = value;
    }

    /**
     * Gets the value of the jobXml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobXml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobXml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJobXml() {
        if (jobXml == null) {
            jobXml = new ArrayList<String>();
        }
        return this.jobXml;
    }

    /**
     * configuration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CONFIGURATION }
     *     
     */
    public CONFIGURATION getConfiguration() {
        return configuration;
    }

    /**
     * configuration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CONFIGURATION }
     *     
     */
    public void setConfiguration(CONFIGURATION value) {
        this.configuration = value;
    }

    /**
     * configClass 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigClass() {
        return configClass;
    }

    /**
     * configClass 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigClass(String value) {
        this.configClass = value;
    }

    /**
     * Gets the value of the file property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the file property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFile() {
        if (file == null) {
            file = new ArrayList<String>();
        }
        return this.file;
    }

    /**
     * Gets the value of the archive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the archive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArchive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getArchive() {
        if (archive == null) {
            archive = new ArrayList<String>();
        }
        return this.archive;
    }

}
