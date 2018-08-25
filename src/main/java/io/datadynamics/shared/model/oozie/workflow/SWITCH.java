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
 * <p>SWITCH complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="SWITCH"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="case" type="{uri:oozie:workflow:0.5}CASE" maxOccurs="unbounded"/&gt;
 *           &lt;element name="default" type="{uri:oozie:workflow:0.5}DEFAULT"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWITCH", propOrder = {
    "_case",
    "_default"
})
public class SWITCH {

    @XmlElement(name = "case", required = true)
    protected List<CASE> _case;
    @XmlElement(name = "default", required = true)
    protected DEFAULT _default;

    /**
     * Gets the value of the case property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the case property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CASE }
     * 
     * 
     */
    public List<CASE> getCase() {
        if (_case == null) {
            _case = new ArrayList<CASE>();
        }
        return this._case;
    }

    /**
     * default 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DEFAULT }
     *     
     */
    public DEFAULT getDefault() {
        return _default;
    }

    /**
     * default 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DEFAULT }
     *     
     */
    public void setDefault(DEFAULT value) {
        this._default = value;
    }

}
