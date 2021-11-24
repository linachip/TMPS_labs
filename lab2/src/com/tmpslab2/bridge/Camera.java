package com.tmpslab2.bridge;

public abstract class Camera {

    protected ISensorType sensorType;

    public Camera(ISensorType sensorType){
        this.sensorType = sensorType;
    }

    abstract public void characteristics();
}
