package com.tmpslab1.builder;

public class CameraBuilder {
    private String brand;
    private String color;
    private String sensorType;
    private int maximumResolution;

    public CameraBuilder(){}

    public CameraBuilder brand(String brand){
        this.brand = brand;
        return this;
    }

    public CameraBuilder color(String color){
        this.color = color;
        return this;
    }

    public CameraBuilder sensorType(String sensorType){
        this.sensorType = sensorType;
        return this;
    }

    public CameraBuilder maximumResolution(int maximumResolution){
        this.maximumResolution = maximumResolution;
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DSLR Camera characteristics: ").append('\n');
        sb.append("Brand: ").append(brand).append('\n');
        sb.append("Color: ").append(color).append('\n');
        sb.append("Sensor Type: ").append(sensorType).append('\n');
        sb.append("Maximum Resolution: ").append(maximumResolution);
        return sb.toString();
    }
}
