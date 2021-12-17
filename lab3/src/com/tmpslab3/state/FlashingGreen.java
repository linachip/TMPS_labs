package com.tmpslab3.state;

public class FlashingGreen implements CameraFlashState {

    @Override
    public void handle(FlashStateContext context) {
        System.out.println("The flash is in the sleep state");
        context.setFlashState(this);
    }

    @Override
    public String toString() {
        return "Flashing green state";
    }
}