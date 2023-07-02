package com.example.springtransportsdrivers.models;

import lombok.Data;


@Data
public abstract class Transport {

    private int weight;
    private int maxSpeed;
    private String color;
    private String model;


    public Transport(String model) {
        this.model = model;
    }

    public abstract void gas();

    public abstract void brake();

    @Override
    public String toString() {
        return "Transport{" +
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
