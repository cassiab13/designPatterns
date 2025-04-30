package br.com.builder.cars;

import br.com.builder.components.CarType;
import br.com.builder.components.Color;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class Truck {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;

    public Truck(CarType carType, int seats, Engine engine, Transmission transmission, Color color){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public String result(){
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += "Transmission: " + transmission;

        return truck;
    }
}
