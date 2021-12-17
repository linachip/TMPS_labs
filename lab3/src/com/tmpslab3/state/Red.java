package com.tmpslab3.state;

public class Red implements CameraFlashState {

    @Override
    public void handle(FlashStateContext context) {
        System.out.println("The flash is fully ready to work");
        context.setFlashState(this);
    }

    public String toString(){
        return "Red state";
    }
}
