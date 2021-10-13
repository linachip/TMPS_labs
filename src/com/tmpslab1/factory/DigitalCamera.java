package com.tmpslab1.factory;

public class DigitalCamera implements Camera {
    @Override
    public void construct() {
        System.out.println("Digital Camera");
    }
}
