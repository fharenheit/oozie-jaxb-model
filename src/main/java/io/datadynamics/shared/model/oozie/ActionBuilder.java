package io.datadynamics.shared.model.oozie;

import io.datadynamics.shared.model.oozie.workflow.ACTION;
import io.datadynamics.shared.model.oozie.workflow.MAPREDUCE;

import java.util.ArrayList;
import java.util.List;

public class ActionBuilder {

    public List<Object> actions = new ArrayList();

    public ActionBuilder mapreduce(String name) {
        ACTION action = new ACTION();
        action.setName(name);
        MAPREDUCE mr = new MAPREDUCE();
        action.setMapReduce(mr);
        actions.add(action);
        return this;
    }

}
