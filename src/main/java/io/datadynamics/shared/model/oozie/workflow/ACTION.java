//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.09.30 시간 10:51:07 PM KST 
//


package io.datadynamics.shared.model.oozie.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ACTION complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="ACTION"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="map-reduce" type="{uri:oozie:workflow:0.5}MAP-REDUCE"/&gt;
 *           &lt;element name="pig" type="{uri:oozie:workflow:0.5}PIG"/&gt;
 *           &lt;element name="sub-workflow" type="{uri:oozie:workflow:0.5}SUB-WORKFLOW"/&gt;
 *           &lt;element name="fs" type="{uri:oozie:workflow:0.5}FS"/&gt;
 *           &lt;element name="java" type="{uri:oozie:workflow:0.5}JAVA"/&gt;
 *           &lt;any namespace='##other'/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ok" type="{uri:oozie:workflow:0.5}ACTION_TRANSITION"/&gt;
 *         &lt;element name="error" type="{uri:oozie:workflow:0.5}ACTION_TRANSITION"/&gt;
 *         &lt;any namespace='uri:oozie:sla:0.2 uri:oozie:sla:0.1' minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{uri:oozie:workflow:0.5}IDENTIFIER" /&gt;
 *       &lt;attribute name="cred" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="retry-max" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="retry-interval" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACTION", propOrder = {
    "mapReduce",
    "pig",
    "subWorkflow",
    "fs",
    "java",
    "any",
    "ok",
    "error",
    "anySLA"
})
public class ACTION {

    @XmlElement(name = "map-reduce")
    protected MAPREDUCE mapReduce;
    protected PIG pig;
    @XmlElement(name = "sub-workflow")
    protected SUBWORKFLOW subWorkflow;
    protected FS fs;
    protected JAVA java;
    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlElement(required = true)
    protected ACTIONTRANSITION ok;
    @XmlElement(required = true)
    protected ACTIONTRANSITION error;
    @XmlAnyElement(lax = true)
    protected Object anySLA;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "cred")
    protected String cred;
    @XmlAttribute(name = "retry-max")
    protected String retryMax;
    @XmlAttribute(name = "retry-interval")
    protected String retryInterval;

    /**
     * mapReduce 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link MAPREDUCE }
     *     
     */
    public MAPREDUCE getMapReduce() {
        return mapReduce;
    }

    /**
     * mapReduce 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link MAPREDUCE }
     *     
     */
    public void setMapReduce(MAPREDUCE value) {
        this.mapReduce = value;
    }

    /**
     * pig 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PIG }
     *     
     */
    public PIG getPig() {
        return pig;
    }

    /**
     * pig 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PIG }
     *     
     */
    public void setPig(PIG value) {
        this.pig = value;
    }

    /**
     * subWorkflow 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link SUBWORKFLOW }
     *     
     */
    public SUBWORKFLOW getSubWorkflow() {
        return subWorkflow;
    }

    /**
     * subWorkflow 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link SUBWORKFLOW }
     *     
     */
    public void setSubWorkflow(SUBWORKFLOW value) {
        this.subWorkflow = value;
    }

    /**
     * fs 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FS }
     *     
     */
    public FS getFs() {
        return fs;
    }

    /**
     * fs 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FS }
     *     
     */
    public void setFs(FS value) {
        this.fs = value;
    }

    /**
     * java 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link JAVA }
     *     
     */
    public JAVA getJava() {
        return java;
    }

    /**
     * java 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link JAVA }
     *     
     */
    public void setJava(JAVA value) {
        this.java = value;
    }

    /**
     * any 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * any 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * ok 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ACTIONTRANSITION }
     *     
     */
    public ACTIONTRANSITION getOk() {
        return ok;
    }

    /**
     * ok 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ACTIONTRANSITION }
     *     
     */
    public void setOk(ACTIONTRANSITION value) {
        this.ok = value;
    }

    /**
     * error 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ACTIONTRANSITION }
     *     
     */
    public ACTIONTRANSITION getError() {
        return error;
    }

    /**
     * error 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ACTIONTRANSITION }
     *     
     */
    public void setError(ACTIONTRANSITION value) {
        this.error = value;
    }

    /**
     * anySLA 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAnySLA() {
        return anySLA;
    }

    /**
     * anySLA 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAnySLA(Object value) {
        this.anySLA = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * cred 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCred() {
        return cred;
    }

    /**
     * cred 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCred(String value) {
        this.cred = value;
    }

    /**
     * retryMax 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryMax() {
        return retryMax;
    }

    /**
     * retryMax 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryMax(String value) {
        this.retryMax = value;
    }

    /**
     * retryInterval 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetryInterval() {
        return retryInterval;
    }

    /**
     * retryInterval 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetryInterval(String value) {
        this.retryInterval = value;
    }

}
