package com.tmpslab2.proxy;

public class DSLRCameraProxy extends DSLRCameraImpl {

    @Override
    public void description() {
        System.out.println("DSLR Camera has file format: ");
        super.description();
    }
}
