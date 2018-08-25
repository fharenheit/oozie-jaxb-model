package io.datadynamics.shared.model.oozie;

import io.datadynamics.shared.model.oozie.workflow.ObjectFactory;
import io.datadynamics.shared.model.oozie.workflow.WORKFLOWAPP;
import org.junit.Test;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class JaxbUtilsTest {

    @Test
    public void workflow() throws JAXBException {
        Marshaller marshaller = JaxbUtils.createMarshaller("io.datadynamics.shared.model.oozie.workflow");
        StringWriter stringWriter = new StringWriter();

        WorkflowBuilder builder = new WorkflowBuilder();
        ActionBuilder actionBuilder = new ActionBuilder();
        builder
            .name("Hello World")
            .jobTracker("10.0.0.2")
            .nameNode("hdfs://10.0.0.1:8000")
            .startNext("action1")
            .params()
            .property("name", "Hello World Workflow")
            .property("timezone", "Asia/Seoul");

        builder.actions().mapreduce("action1");

        WORKFLOWAPP workflow = builder.build();

        ObjectFactory factory = new ObjectFactory();

        JAXBElement<WORKFLOWAPP> workflowApp = factory.createWorkflowApp(workflow);
        marshaller.marshal(workflowApp, stringWriter);
        System.out.println(XmlFormatter.format(stringWriter.toString()));
    }
}
