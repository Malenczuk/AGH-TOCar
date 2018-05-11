package agh.iisg.lab;

import java.util.HashMap;

public class Component {
    private String name;
    private HashMap<String, String> additionalInfo = new HashMap<>();
    private HashMap<String, Measurement> measurements = new HashMap<>();


    public Component(String name) {
        this.name = name;
    }

    public HashMap<String, Measurement> getMeasurements() {
        return measurements;
    }

    public String getName() {
        return name;
    }

    public HashMap<String, String> getAdditionalInfo() {
        return additionalInfo;
    }

    public void addAdditionalInfo(String infoKey, String infoValue ) {
        additionalInfo.put(infoKey, infoValue);
    }

    public Measurement getMeasurement(String type){
        return measurements.get(type);
    }

    public void addMeasurement(Measurement measurement){
        measurements.put(measurement.getName(), measurement);
    }
}
