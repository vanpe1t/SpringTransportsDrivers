package com.example.springtransportsdrivers.models;


public class Bus extends Transport {



    public Bus(String model) {
        super(model);
    }

    @Override
    public void gas() {
        System.out.println(this + " готова к работе!");
    }

    @Override
    public void brake() {

    }

}
