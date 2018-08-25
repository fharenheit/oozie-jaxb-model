//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.09.30 시간 10:51:07 PM KST 
//


package io.datadynamics.shared.model.oozie.workflow;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>WORKFLOW-APP complex type에 대한 Java 클래스입니다.
 * <p>
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * <p>
 * <pre>
 * &lt;complexType name="WORKFLOW-APP"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parameters" type="{uri:oozie:workflow:0.5}PARAMETERS" minOccurs="0"/&gt;
 *         &lt;element name="global" type="{uri:oozie:workflow:0.5}GLOBAL" minOccurs="0"/&gt;
 *         &lt;element name="credentials" type="{uri:oozie:workflow:0.5}CREDENTIALS" minOccurs="0"/&gt;
 *         &lt;element name="start" type="{uri:oozie:workflow:0.5}START"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element name="decision" type="{uri:oozie:workflow:0.5}DECISION"/&gt;
 *           &lt;element name="fork" type="{uri:oozie:workflow:0.5}FORK"/&gt;
 *           &lt;element name="join" type="{uri:oozie:workflow:0.5}JOIN"/&gt;
 *           &lt;element name="kill" type="{uri:oozie:workflow:0.5}KILL"/&gt;
 *           &lt;element name="action" type="{uri:oozie:workflow:0.5}ACTION"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="end" type="{uri:oozie:workflow:0.5}END"/&gt;
 *         &lt;any namespace='uri:oozie:sla:0.2 uri:oozie:sla:0.1' minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WORKFLOW-APP", propOrder = {
    "parameters",
    "global",
    "credentials",
    "start",
    "decisionOrForkOrJoin",
    "end",
    "any"
})
public class WORKFLOWAPP {

    protected PARAMETERS parameters;
    protected GLOBAL global;
    protected CREDENTIALS credentials;
    @XmlElement(required = true)
    protected START start;
    @XmlElements({
        @XmlElement(name = "decision", type = DECISION.class),
        @XmlElement(name = "fork", type = FORK.class),
        @XmlElement(name = "join", type = JOIN.class),
        @XmlElement(name = "kill", type = KILL.class),
        @XmlElement(name = "action", type = ACTION.class)
    })
    protected List<Object> decisionOrForkOrJoin;
    @XmlElement(required = true)
    protected END end;
    @XmlAnyElement(lax = true)
    protected Object any;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * parameters 속성의 값을 가져옵니다.
     *
     * @return possible object is
     * {@link PARAMETERS }
     */
    public PARAMETERS getParameters() {
        return parameters;
    }

    /**
     * parameters 속성의 값을 설정합니다.
     *
     * @param value allowed object is
     *              {@link PARAMETERS }
     */
    public void setParameters(PARAMETERS value) {
        this.parameters = value;
    }

    /**
     * global 속성의 값을 가져옵니다.
     *
     * @return possible object is
     * {@link GLOBAL }
     */
    public GLOBAL getGlobal() {
        if (this.global == null) {
            this.global = new GLOBAL();
        }
        return global;
    }

    /**
     * global 속성의 값을 설정합니다.
     *
     * @param value allowed object is
     *              {@link GLOBAL }
     */
    public void setGlobal(GLOBAL value) {
        this.global = value;
    }

    /**
     * credentials 속성의 값을 가져옵니다.
     *
     * @return possible object is
     * {@link CREDENTIALS }
     */
    public CREDENTIALS getCredentials() {
        return credentials;
    }

    /**
     * credentials 속성의 값을 설정합니다.
     *
     * @param value allowed object is
     *              {@link CREDENTIALS }
     */
    public void setCredentials(CREDENTIALS value) {
        this.credentials = value;
    }

    /**
     * start 속성의 값을 가져옵니다.
     *
     * @return possible object is
     * {@link START }
     */
    public START getStart() {
        if (start == null) {
            this.start = new START();
        }
        return start;
    }

    /**
     * start 속성의 값을 설정합니다.
     *
     * @param value allowed object is
     *              {@link START }
     */
    public void setStart(START value) {
        this.start = value;
    }

    /**
     * Gets the value of the decisionOrForkOrJoin property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decisionOrForkOrJoin property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecisionOrForkOrJoin().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DECISION }
     * {@link FORK }
     * {@link JOIN }
     * {@link KILL }
     * {@link ACTION }
     */
    public List<Object> getDecisionOrForkOrJoin() {
        if (decisionOrForkOrJoin == null) {
            decisionOrForkOrJoin = new ArrayList<Object>();
        }
        return this.decisionOrForkOrJoin;
    }

    /**
     * end 속성의 값을 가져옵니다.
     *
     * @return possible object is
     * {@link END }
     */
    public END getEnd() {
        if (end == null) {
            this.end = new END();
        }
        return end;
    }

    /**
     * end 속성의 값을 설정합니다.
     *
     * @param value allowed object is
     *              {@link END }
     */
    public void setEnd(END value) {
        this.end = value;
    }

    /**
     * any 속성의 값을 가져옵니다.
     *
     * @return possible object is
     * {@link Object }
     */
    public Object getAny() {
        return any;
    }

    /**
     * any 속성의 값을 설정합니다.
     *
     * @param value allowed object is
     *              {@link Object }
     */
    public void setAny(Object value) {
        this.any = value;
    }

    /**
     * name 속성의 값을 가져옵니다.
     *
     * @return possible object is
     * {@link String }
     */
    public String getName() {
        return name;
    }

    /**
     * name 속성의 값을 설정합니다.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setName(String value) {
        this.name = value;
    }

}
