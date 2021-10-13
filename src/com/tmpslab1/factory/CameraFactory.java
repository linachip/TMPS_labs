package com.tmpslab1.factory;

public class CameraFactory {
    public static DSLRCamera buildCamera(String types){

        if (types == null){
            return null;
        }

        if (types.equalsIgnoreCase("DSLRCamera")){
            return new DSLRCamera();
        }
        return null;
    }

    public static DigitalCamera buildCamera2(String types2){
        if (types2 == null){
            return null;
        }

        if (types2.equalsIgnoreCase("DigitalCamera")){
            return new DigitalCamera();
        }
        return null;
    }
}
