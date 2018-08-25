package io.datadynamics.shared.model.oozie;

import io.datadynamics.shared.model.oozie.workflow.PARAMETERS;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class ParameterBuilder {

    PARAMETERS parameters = new PARAMETERS();

    public ParameterBuilder property(String name, String value, String description) {
        PARAMETERS.Property e = new PARAMETERS.Property();
        if (description != null) e.setDescription(description);
        e.setName(name);
        e.setValue(value);
        parameters.getProperty().add(e);
        return this;
    }

    public ParameterBuilder property(String name, String value) {
        return property(name, value, null);
    }

    public ParameterBuilder clear() {
        parameters.getProperty().clear();
        return this;
    }

    public ParameterBuilder properties(Properties properties) {
        Set<String> names = properties.stringPropertyNames();
        for (String name : names) {
            property(name, properties.getProperty(name));
        }
        return this;
    }

    public ParameterBuilder properties(Map properties) {
        Set<String> names = properties.keySet();
        for (String name : names) {
            property(name, (String) properties.get(name));
        }
        return this;
    }
}
