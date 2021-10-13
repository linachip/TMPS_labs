package com.tmpslab1.factory;

public class DSLRCamera implements Camera {
    @Override
    public void construct() {
        System.out.println("Digital single-lens reflex Camera");
    }
}
