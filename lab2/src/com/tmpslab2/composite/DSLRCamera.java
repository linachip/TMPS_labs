package com.tmpslab2.composite;

public class DSLRCamera extends Camera {
    public DSLRCamera(String brand, String model, String level, String price){
        super(brand, model, level, price);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("DSLR Camera: ");
        builder.append("    Brand: ").append(brand);
        builder.append("    Model: ").append(model);
        builder.append("    Skill level: ").append(level);
        builder.append("    Price: ").append(price);
        return builder.toString();
    }

}
