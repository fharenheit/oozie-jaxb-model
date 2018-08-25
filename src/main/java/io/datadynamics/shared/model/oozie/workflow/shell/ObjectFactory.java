//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.09.30 시간 10:51:08 PM KST 
//


package io.datadynamics.shared.model.oozie.workflow.shell;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.datadynamics.shared.model.oozie.workflow.shell package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Shell_QNAME = new QName("uri:oozie:shell-action:0.3", "shell");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.datadynamics.shared.model.oozie.workflow.shell
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CONFIGURATION }
     * 
     */
    public CONFIGURATION createCONFIGURATION() {
        return new CONFIGURATION();
    }

    /**
     * Create an instance of {@link ACTION }
     * 
     */
    public ACTION createACTION() {
        return new ACTION();
    }

    /**
     * Create an instance of {@link FLAG }
     * 
     */
    public FLAG createFLAG() {
        return new FLAG();
    }

    /**
     * Create an instance of {@link PREPARE }
     * 
     */
    public PREPARE createPREPARE() {
        return new PREPARE();
    }

    /**
     * Create an instance of {@link DELETE }
     * 
     */
    public DELETE createDELETE() {
        return new DELETE();
    }

    /**
     * Create an instance of {@link MKDIR }
     * 
     */
    public MKDIR createMKDIR() {
        return new MKDIR();
    }

    /**
     * Create an instance of {@link CONFIGURATION.Property }
     * 
     */
    public CONFIGURATION.Property createCONFIGURATIONProperty() {
        return new CONFIGURATION.Property();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACTION }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:shell-action:0.3", name = "shell")
    public JAXBElement<ACTION> createShell(ACTION value) {
        return new JAXBElement<ACTION>(_Shell_QNAME, ACTION.class, null, value);
    }

}
