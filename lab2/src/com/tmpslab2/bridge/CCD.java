package com.tmpslab2.bridge;

public class CCD implements ISensorType {

    @Override
    public void description() {
        System.out.println("Charge-coupled device (CCD)");
    }
}
