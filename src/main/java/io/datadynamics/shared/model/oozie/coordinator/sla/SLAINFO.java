//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.09.30 시간 10:51:08 PM KST 
//


package io.datadynamics.shared.model.oozie.coordinator.sla;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SLA-INFO complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SLA-INFO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nominal-time" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="should-start" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="should-end" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="max-duration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alert-events" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="alert-contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="notification-msg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="upstream-apps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SLA-INFO", propOrder = {
    "nominalTime",
    "shouldStart",
    "shouldEnd",
    "maxDuration",
    "alertEvents",
    "alertContact",
    "notificationMsg",
    "upstreamApps"
})
public class SLAINFO {

    @XmlElement(name = "nominal-time", required = true)
    protected String nominalTime;
    @XmlElement(name = "should-start")
    protected String shouldStart;
    @XmlElement(name = "should-end", required = true)
    protected String shouldEnd;
    @XmlElement(name = "max-duration")
    protected String maxDuration;
    @XmlElement(name = "alert-events")
    protected String alertEvents;
    @XmlElement(name = "alert-contact")
    protected String alertContact;
    @XmlElement(name = "notification-msg")
    protected String notificationMsg;
    @XmlElement(name = "upstream-apps")
    protected String upstreamApps;

    /**
     * nominalTime 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNominalTime() {
        return nominalTime;
    }

    /**
     * nominalTime 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNominalTime(String value) {
        this.nominalTime = value;
    }

    /**
     * shouldStart 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShouldStart() {
        return shouldStart;
    }

    /**
     * shouldStart 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShouldStart(String value) {
        this.shouldStart = value;
    }

    /**
     * shouldEnd 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShouldEnd() {
        return shouldEnd;
    }

    /**
     * shouldEnd 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShouldEnd(String value) {
        this.shouldEnd = value;
    }

    /**
     * maxDuration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxDuration() {
        return maxDuration;
    }

    /**
     * maxDuration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxDuration(String value) {
        this.maxDuration = value;
    }

    /**
     * alertEvents 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertEvents() {
        return alertEvents;
    }

    /**
     * alertEvents 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertEvents(String value) {
        this.alertEvents = value;
    }

    /**
     * alertContact 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertContact() {
        return alertContact;
    }

    /**
     * alertContact 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertContact(String value) {
        this.alertContact = value;
    }

    /**
     * notificationMsg 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationMsg() {
        return notificationMsg;
    }

    /**
     * notificationMsg 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationMsg(String value) {
        this.notificationMsg = value;
    }

    /**
     * upstreamApps 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpstreamApps() {
        return upstreamApps;
    }

    /**
     * upstreamApps 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpstreamApps(String value) {
        this.upstreamApps = value;
    }

}
