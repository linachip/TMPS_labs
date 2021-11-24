package com.tmpslab2.bridge;

public class MirrorlessCamera extends Camera {

    public MirrorlessCamera(ISensorType sensorType){
        super(sensorType);
    }

    @Override
    public void characteristics() {
        System.out.println("Mirrorless Camera - Sony Alpha 7 has a sensor type: ");
        sensorType.description();
    }
}
