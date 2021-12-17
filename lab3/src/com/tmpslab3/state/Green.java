package com.tmpslab3.state;

public class Green implements CameraFlashState {

    @Override
    public void handle(FlashStateContext context) {
        System.out.println("The flash isn't charged");
        context.setFlashState(this);
    }

    @Override
    public String toString() {
        return "Green state";
    }
}