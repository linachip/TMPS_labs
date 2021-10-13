package com.tmpslab1.singleton;

public class CameraManager {
    private static CameraManager cameraManager;
    private String name = "Professional camera";
    private String name2 = "Amateur camera";

    public static CameraManager getInstance(){
        if(cameraManager == null){
            cameraManager = new CameraManager();
        }
        return cameraManager;
    }

    public String getName(){
        return name;
    }

    public String getName2(){
        return name2;
    }
}
