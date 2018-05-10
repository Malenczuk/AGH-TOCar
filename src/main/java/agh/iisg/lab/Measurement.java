package agh.iisg.lab;

import java.util.Date;

public class Measurement {
    private final String name;
    private final Date date;
    private final Number value;
    private final String unit;

    public Measurement(String name, Date date, Number value, String unit) {
        this.name = name;
        this.date = date;
        this.value = value;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public Number getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return (date == null ? "" : date + " ") + name + ": " + value + " " + unit;
    }

}
