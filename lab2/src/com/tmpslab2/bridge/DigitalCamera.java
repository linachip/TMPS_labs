package com.tmpslab2.bridge;

public class DigitalCamera extends Camera {

    public DigitalCamera(ISensorType sensorType){
        super(sensorType);
    }

    @Override
    public void characteristics() {
        System.out.println("Digital Camera - Olympus XZ-1 has a sensor type: ");
        sensorType.description();
    }
}
