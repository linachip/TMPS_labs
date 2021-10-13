package com.tmpslab1.builder;

public class Camera {
    public String brand;
    public String color;
    public String sensorType;
    public int maximumResolution;

    public Camera(String brand, String color, String sensorType, int maximumResolution){
        this.brand = brand;
        this.color = color;
        this.sensorType = sensorType;
        this.maximumResolution = maximumResolution;
    }
}
