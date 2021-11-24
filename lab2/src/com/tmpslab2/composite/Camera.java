package com.tmpslab2.composite;

public abstract class Camera {
    protected String brand;
    protected String model;
    protected String level;
    protected String price;

    public Camera(String brand, String model, String level, String price){
        super();
        this.brand = brand;
        this.model = model;
        this.level = level;
        this.price = price;
    }

    public void add (Camera camera){
    }

    public abstract String toString();

}
