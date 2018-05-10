package agh.iisg.lab;

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

    public LinkedList<String> getComponentMeasurementsTypes(String componentName){
        LinkedList<String> types = new LinkedList<>();
        Component searchedComponent = getSingleComponent(componentName);
        if (searchedComponent == null) return null;
        for (Measurement measurement: searchedComponent.getMeasurements().values()){
            types.add(measurement.getType());
        }
        return types;
    }

    public Measurement getComponentMeasurement(String componentName, String type){
        Component component = getSingleComponent(componentName);
        return component.getMeasurements().get(type);
    }

    public LinkedList<Measurement> getComponentMeasurements(String componentName){
        LinkedList<Measurement> measurements = new LinkedList<>();
        Component component = getSingleComponent(componentName);
        measurements.addAll(component.getMeasurements().values());
        return measurements;
    }

    private Component getSingleComponent(String componentName) {
        Component searchedComponent = null;
        for (Component component: components){
            if (component.getName().equals(componentName)){
                searchedComponent = component;
                break;
            }
        }
        return searchedComponent;
    }
}
