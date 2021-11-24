package com.tmpslab2.composite;

import java.util.ArrayList;
import java.util.List;

public class MirrorlessCamera extends Camera {

    private final List<Camera> cameras = new ArrayList<>();

    @Override
    public void add(Camera camera) {
        cameras.add(camera);
    }

    public MirrorlessCamera (String brand, String model, String level, String price){
        super(brand, model, level, price);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Mirrorless Camera: ");
        builder.append("    Brand: ").append(brand);
        builder.append("    Model: ").append(model);
        builder.append("    Skill level: ").append(level);
        builder.append("    Price: ").append(price);
        return builder.toString();
    }
}
