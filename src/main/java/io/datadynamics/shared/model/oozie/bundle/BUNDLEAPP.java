//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.09.30 시간 10:51:08 PM KST 
//


package io.datadynamics.shared.model.oozie.bundle;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BUNDLE-APP complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="BUNDLE-APP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameters" type="{uri:oozie:bundle:0.2}PARAMETERS" minOccurs="0"/&gt;
 *         &lt;element name="controls" type="{uri:oozie:bundle:0.2}CONTROLS" minOccurs="0"/&gt;
 *         &lt;element name="coordinator" type="{uri:oozie:bundle:0.2}COORDINATOR" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BUNDLE-APP", propOrder = {
    "parameters",
    "controls",
    "coordinator"
})
public class BUNDLEAPP {

    protected PARAMETERS parameters;
    protected CONTROLS controls;
    @XmlElement(required = true)
    protected List<COORDINATOR> coordinator;
    @XmlAttribute(name = "name", required = true)
    protected String name;

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
     * Gets the value of the coordinator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coordinator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoordinator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COORDINATOR }
     * 
     * 
     */
    public List<COORDINATOR> getCoordinator() {
        if (coordinator == null) {
            coordinator = new ArrayList<COORDINATOR>();
        }
        return this.coordinator;
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

}
