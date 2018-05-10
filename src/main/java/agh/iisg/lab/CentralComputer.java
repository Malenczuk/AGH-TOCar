package agh.iisg.lab;

import java.awt.image.ComponentColorModel;
import java.util.LinkedList;
import java.util.List;

public class CentralComputer {
    private List<Component> components = new LinkedList<>();

    public void addComponent(Component component){
        components.add(component);
    }

    public void removeComponent(Component component){
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    public List<String> getComponentMeasurementTypes(String componentName){
        return components;
    }
}
