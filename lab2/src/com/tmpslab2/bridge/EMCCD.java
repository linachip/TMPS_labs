package com.tmpslab2.bridge;

public class EMCCD implements ISensorType {

    @Override
    public void description() {
        System.out.println("Electron-multiplying charge-coupled device (EMCCD)");
    }
}
