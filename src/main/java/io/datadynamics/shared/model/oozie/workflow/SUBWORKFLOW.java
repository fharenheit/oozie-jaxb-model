//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.09.30 시간 10:51:07 PM KST 
//


package io.datadynamics.shared.model.oozie.workflow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SUB-WORKFLOW complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SUB-WORKFLOW"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="app-path" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="propagate-configuration" type="{uri:oozie:workflow:0.5}FLAG" minOccurs="0"/&gt;
 *         &lt;element name="configuration" type="{uri:oozie:workflow:0.5}CONFIGURATION" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SUB-WORKFLOW", propOrder = {
    "appPath",
    "propagateConfiguration",
    "configuration"
})
public class SUBWORKFLOW {

    @XmlElement(name = "app-path", required = true)
    protected String appPath;
    @XmlElement(name = "propagate-configuration")
    protected FLAG propagateConfiguration;
    protected CONFIGURATION configuration;

    /**
     * appPath 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppPath() {
        return appPath;
    }

    /**
     * appPath 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPath(String value) {
        this.appPath = value;
    }

    /**
     * propagateConfiguration 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link FLAG }
     *     
     */
    public FLAG getPropagateConfiguration() {
        return propagateConfiguration;
    }

    /**
     * propagateConfiguration 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link FLAG }
     *     
     */
    public void setPropagateConfiguration(FLAG value) {
        this.propagateConfiguration = value;
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

}
