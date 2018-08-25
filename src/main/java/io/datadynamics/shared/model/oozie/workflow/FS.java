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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FS complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="FS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name-node" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="job-xml" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="configuration" type="{uri:oozie:workflow:0.5}CONFIGURATION" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="delete" type="{uri:oozie:workflow:0.5}DELETE"/&gt;
 *           &lt;element name="mkdir" type="{uri:oozie:workflow:0.5}MKDIR"/&gt;
 *           &lt;element name="move" type="{uri:oozie:workflow:0.5}MOVE"/&gt;
 *           &lt;element name="chmod" type="{uri:oozie:workflow:0.5}CHMOD"/&gt;
 *           &lt;element name="touchz" type="{uri:oozie:workflow:0.5}TOUCHZ"/&gt;
 *           &lt;element name="chgrp" type="{uri:oozie:workflow:0.5}CHGRP"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FS", propOrder = {
    "nameNode",
    "jobXml",
    "configuration",
    "deleteOrMkdirOrMove"
})
public class FS {

    @XmlElement(name = "name-node")
    protected String nameNode;
    @XmlElement(name = "job-xml")
    protected List<String> jobXml;
    protected CONFIGURATION configuration;
    @XmlElements({
        @XmlElement(name = "delete", type = DELETE.class),
        @XmlElement(name = "mkdir", type = MKDIR.class),
        @XmlElement(name = "move", type = MOVE.class),
        @XmlElement(name = "chmod", type = CHMOD.class),
        @XmlElement(name = "touchz", type = TOUCHZ.class),
        @XmlElement(name = "chgrp", type = CHGRP.class)
    })
    protected List<Object> deleteOrMkdirOrMove;

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
     * Gets the value of the deleteOrMkdirOrMove property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteOrMkdirOrMove property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteOrMkdirOrMove().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DELETE }
     * {@link MKDIR }
     * {@link MOVE }
     * {@link CHMOD }
     * {@link TOUCHZ }
     * {@link CHGRP }
     * 
     * 
     */
    public List<Object> getDeleteOrMkdirOrMove() {
        if (deleteOrMkdirOrMove == null) {
            deleteOrMkdirOrMove = new ArrayList<Object>();
        }
        return this.deleteOrMkdirOrMove;
    }

}
