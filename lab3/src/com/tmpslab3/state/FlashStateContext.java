package com.tmpslab3.state;

public class FlashStateContext {

    CameraFlashState flashState;

    public FlashStateContext(){
        flashState = null;
    }

    public void setFlashState(CameraFlashState flashState) {
        this.flashState = flashState;
    }

    public CameraFlashState getState(){
        return flashState;
    }
}
