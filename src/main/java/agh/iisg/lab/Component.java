package agh.iisg.lab;

import java.util.HashMap;

public class Component {
    private String name;
    private String informations;

    private HashMap<String, Measurement> measurements = new HashMap<>();

    public HashMap<String, Measurement> getMeasurements() {
        return measurements;
    }

    public String getName() {
        return name;
    }

    public String getInformations() {
        return informations;
    }

    public Measurement getMeasurement(String type){
        return measurements.get(type);
    }

    public void addMeasurement(Measurement measurement){
        measurements.put(measurement.getType(), measurement);
    }
}
