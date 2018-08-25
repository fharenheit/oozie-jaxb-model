//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.09.30 시간 10:51:07 PM KST 
//


package io.datadynamics.shared.model.oozie.coordinator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>COORDINATOR-APP complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="COORDINATOR-APP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameters" type="{uri:oozie:coordinator:0.4}PARAMETERS" minOccurs="0"/&gt;
 *         &lt;element name="controls" type="{uri:oozie:coordinator:0.4}CONTROLS" minOccurs="0"/&gt;
 *         &lt;element name="datasets" type="{uri:oozie:coordinator:0.4}DATASETS" minOccurs="0"/&gt;
 *         &lt;element name="input-events" type="{uri:oozie:coordinator:0.4}INPUTEVENTS" minOccurs="0"/&gt;
 *         &lt;element name="output-events" type="{uri:oozie:coordinator:0.4}OUTPUTEVENTS" minOccurs="0"/&gt;
 *         &lt;element name="action" type="{uri:oozie:coordinator:0.4}ACTION"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="frequency" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="start" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="end" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timezone" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "COORDINATOR-APP", propOrder = {
    "parameters",
    "controls",
    "datasets",
    "inputEvents",
    "outputEvents",
    "action"
})
public class COORDINATORAPP {

    protected PARAMETERS parameters;
    protected CONTROLS controls;
    protected DATASETS datasets;
    @XmlElement(name = "input-events")
    protected INPUTEVENTS inputEvents;
    @XmlElement(name = "output-events")
    protected OUTPUTEVENTS outputEvents;
    @XmlElement(required = true)
    protected ACTION action;
    @XmlAttribute(name = "name", required = true)
    protected String name;
    @XmlAttribute(name = "frequency", required = true)
    protected String frequency;
    @XmlAttribute(name = "start", required = true)
    protected String start;
    @XmlAttribute(name = "end", required = true)
    protected String end;
    @XmlAttribute(name = "timezone", required = true)
    protected String timezone;

    /**
     * parameters 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link PARAMETERS }
     *     
     */
    public PARAMETERS getParameters() {
        return parameters;
    }

    /**
     * parameters 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMETERS }
     *     
     */
    public void setParameters(PARAMETERS value) {
        this.parameters = value;
    }

    /**
     * controls 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link CONTROLS }
     *     
     */
    public CONTROLS getControls() {
        return controls;
    }

    /**
     * controls 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link CONTROLS }
     *     
     */
    public void setControls(CONTROLS value) {
        this.controls = value;
    }

    /**
     * datasets 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DATASETS }
     *     
     */
    public DATASETS getDatasets() {
        return datasets;
    }

    /**
     * datasets 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DATASETS }
     *     
     */
    public void setDatasets(DATASETS value) {
        this.datasets = value;
    }

    /**
     * inputEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link INPUTEVENTS }
     *     
     */
    public INPUTEVENTS getInputEvents() {
        return inputEvents;
    }

    /**
     * inputEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link INPUTEVENTS }
     *     
     */
    public void setInputEvents(INPUTEVENTS value) {
        this.inputEvents = value;
    }

    /**
     * outputEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link OUTPUTEVENTS }
     *     
     */
    public OUTPUTEVENTS getOutputEvents() {
        return outputEvents;
    }

    /**
     * outputEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link OUTPUTEVENTS }
     *     
     */
    public void setOutputEvents(OUTPUTEVENTS value) {
        this.outputEvents = value;
    }

    /**
     * action 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link ACTION }
     *     
     */
    public ACTION getAction() {
        return action;
    }

    /**
     * action 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link ACTION }
     *     
     */
    public void setAction(ACTION value) {
        this.action = value;
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
     * frequency 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * frequency 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * start 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * start 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * end 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * end 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * timezone 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * timezone 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

}
