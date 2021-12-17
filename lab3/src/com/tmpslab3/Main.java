package com.tmpslab3;

import com.tmpslab3.state.*;

public class Main {

    public static void main(String[] args) {
        FlashStateContext flashStateContext = new FlashStateContext();

        System.out.println("The first camera has a flash state:");
        Red redState = new Red();
        redState.handle(flashStateContext);
        System.out.println(flashStateContext.getState().toString());

        System.out.println("\n");
        System.out.println("The second camera has a flash state:");
        Green greenState = new Green();
        greenState.handle(flashStateContext);
        System.out.println(flashStateContext.getState().toString());


        System.out.println("\n");
        System.out.println("The third camera has a flash state:");
        FlashingGreen flashingGreenState = new FlashingGreen();
        flashingGreenState.handle(flashStateContext);
        System.out.println(flashStateContext.getState().toString());
    }
}
