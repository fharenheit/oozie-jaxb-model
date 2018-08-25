//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.09.30 시간 10:51:08 PM KST 
//


package io.datadynamics.shared.model.oozie.coordinator.sla;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.datadynamics.shared.model.oozie.coordinator.sla package. 
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

    private final static QName _Info_QNAME = new QName("uri:oozie:sla:0.2", "info");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.datadynamics.shared.model.oozie.coordinator.sla
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SLAINFO }
     * 
     */
    public SLAINFO createSLAINFO() {
        return new SLAINFO();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SLAINFO }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:sla:0.2", name = "info")
    public JAXBElement<SLAINFO> createInfo(SLAINFO value) {
        return new JAXBElement<SLAINFO>(_Info_QNAME, SLAINFO.class, null, value);
    }

}
