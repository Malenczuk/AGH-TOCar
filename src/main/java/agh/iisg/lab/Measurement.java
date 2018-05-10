package agh.iisg.lab;

import java.util.Date;

public class Measurement {
    private final String type;
    private final Date date;
    private final Double value;
    private final String unit;

    public Measurement(String type, Date date, Double value, String unit) {
        this.type = type;
        this.date = date;
        this.value = value;
        this.unit = unit;
    }

    public String getType() {
        return type;
    }

    public Date getDate() {
        return date;
    }

    public Double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return "Measurement{" +
                "type='" + type + '\'' +
                ", date=" + date +
                ", value=" + value +
                ", unit='" + unit + '\'' +
                '}';
    }

    public String valueWithUnit(){
        return value + " " + unit;
    }
}
