package agh.iisg.lab;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        CentralComputer centralComputer = new CentralComputer();

        Component engine = new Component("Engine");
        Component fuelSystem = new Component("Fuel System");
        Component wheels = new Component("Wheels");
        Component gearbox = new Component("Gearbox");

        fuelSystem.addMeasurement(new Measurement("fuel usage", new Date(), 4.5, "l/100km"));
        engine.addMeasurement(new Measurement("oil temperature", new Date(), 80.0, "℃"));
        wheels.addMeasurement(new Measurement("front left wheel pressure", new Date(), 235.0, "kPa"));
        wheels.addMeasurement(new Measurement("front right wheel pressure", new Date(), 240.0, "kPa"));
        wheels.addMeasurement(new Measurement("back left wheel pressure", new Date(), 220.0, "kPa"));
        wheels.addMeasurement(new Measurement("back right wheel pressure", new Date(), 230.0, "kPa"));
        gearbox.addMeasurement(new Measurement("current gear", null, 2, "gear"));

        centralComputer.addComponent(engine);
        centralComputer.addComponent(fuelSystem);
        centralComputer.addComponent(wheels);
        centralComputer.addComponent(gearbox);


        System.out.println("Car Components: ");
        for (Component component : centralComputer.getComponents())
            System.out.println(component.getName());

        for (Component component : centralComputer.getComponents()) {
            System.out.println();
            System.out.println(component.getName() + " measurements: ");
            for (Measurement measurement : centralComputer.getComponentMeasurements(component.getName())) {
                System.out.println(measurement.toString());
            }
        }
    }
}