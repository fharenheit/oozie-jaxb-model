package io.datadynamics.shared.model.oozie;

import io.datadynamics.shared.model.oozie.workflow.WORKFLOWAPP;

/**
 * Oozie Workflow를 생성하는 Builder.
 */
public class WorkflowBuilder {

    WORKFLOWAPP workflow = new WORKFLOWAPP();

    ParameterBuilder parameterBuilder = new ParameterBuilder();

    ActionBuilder actionBuilder = new ActionBuilder();

    public WorkflowBuilder name(String name) {
        workflow.setName(name);
        workflow.getEnd().setName("end");
        return this;
    }

    public WorkflowBuilder startNext(String name) {
        workflow.getStart().setTo(name);
        return this;
    }

    public WorkflowBuilder nameNode(String nameNode) {
        workflow.getGlobal().setNameNode(nameNode);
        return this;
    }

    public WorkflowBuilder jobTracker(String jobTracker) {
        workflow.getGlobal().setJobTracker(jobTracker);
        return this;
    }

    public WORKFLOWAPP build() {
        workflow.setParameters(parameterBuilder.parameters);
        workflow.getDecisionOrForkOrJoin().addAll(actionBuilder.actions);
        return this.workflow;
    }

    public ParameterBuilder params() {
        return parameterBuilder;
    }

    public ActionBuilder actions() {
        return this.actionBuilder;
    }
}
