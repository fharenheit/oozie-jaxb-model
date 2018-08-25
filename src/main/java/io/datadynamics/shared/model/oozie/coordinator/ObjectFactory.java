//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.11 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2017.09.30 시간 10:51:07 PM KST 
//


package io.datadynamics.shared.model.oozie.coordinator;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.datadynamics.shared.model.oozie.coordinator package. 
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

    private final static QName _CoordinatorApp_QNAME = new QName("uri:oozie:coordinator:0.4", "coordinator-app");
    private final static QName _Datasets_QNAME = new QName("uri:oozie:coordinator:0.4", "datasets");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.datadynamics.shared.model.oozie.coordinator
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
     * Create an instance of {@link PARAMETERS }
     * 
     */
    public PARAMETERS createPARAMETERS() {
        return new PARAMETERS();
    }

    /**
     * Create an instance of {@link COORDINATORAPP }
     * 
     */
    public COORDINATORAPP createCOORDINATORAPP() {
        return new COORDINATORAPP();
    }

    /**
     * Create an instance of {@link DATASETS }
     * 
     */
    public DATASETS createDATASETS() {
        return new DATASETS();
    }

    /**
     * Create an instance of {@link CONTROLS }
     * 
     */
    public CONTROLS createCONTROLS() {
        return new CONTROLS();
    }

    /**
     * Create an instance of {@link SYNCDATASET }
     * 
     */
    public SYNCDATASET createSYNCDATASET() {
        return new SYNCDATASET();
    }

    /**
     * Create an instance of {@link ASYNCDATASET }
     * 
     */
    public ASYNCDATASET createASYNCDATASET() {
        return new ASYNCDATASET();
    }

    /**
     * Create an instance of {@link INPUTEVENTS }
     * 
     */
    public INPUTEVENTS createINPUTEVENTS() {
        return new INPUTEVENTS();
    }

    /**
     * Create an instance of {@link DATAIN }
     * 
     */
    public DATAIN createDATAIN() {
        return new DATAIN();
    }

    /**
     * Create an instance of {@link OUTPUTEVENTS }
     * 
     */
    public OUTPUTEVENTS createOUTPUTEVENTS() {
        return new OUTPUTEVENTS();
    }

    /**
     * Create an instance of {@link DATAOUT }
     * 
     */
    public DATAOUT createDATAOUT() {
        return new DATAOUT();
    }

    /**
     * Create an instance of {@link ACTION }
     * 
     */
    public ACTION createACTION() {
        return new ACTION();
    }

    /**
     * Create an instance of {@link WORKFLOW }
     * 
     */
    public WORKFLOW createWORKFLOW() {
        return new WORKFLOW();
    }

    /**
     * Create an instance of {@link FLAG }
     * 
     */
    public FLAG createFLAG() {
        return new FLAG();
    }

    /**
     * Create an instance of {@link CONFIGURATION.Property }
     * 
     */
    public CONFIGURATION.Property createCONFIGURATIONProperty() {
        return new CONFIGURATION.Property();
    }

    /**
     * Create an instance of {@link PARAMETERS.Property }
     * 
     */
    public PARAMETERS.Property createPARAMETERSProperty() {
        return new PARAMETERS.Property();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link COORDINATORAPP }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:coordinator:0.4", name = "coordinator-app")
    public JAXBElement<COORDINATORAPP> createCoordinatorApp(COORDINATORAPP value) {
        return new JAXBElement<COORDINATORAPP>(_CoordinatorApp_QNAME, COORDINATORAPP.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DATASETS }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "uri:oozie:coordinator:0.4", name = "datasets")
    public JAXBElement<DATASETS> createDatasets(DATASETS value) {
        return new JAXBElement<DATASETS>(_Datasets_QNAME, DATASETS.class, null, value);
    }

}
