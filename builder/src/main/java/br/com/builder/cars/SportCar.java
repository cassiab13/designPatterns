package br.com.builder.cars;

import br.com.builder.components.CarType;
import br.com.builder.components.Color;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class SportCar{
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;

    public SportCar(CarType carType, int seats, Engine engine, Transmission transmission, Color color){
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Color getColor() {
        return color;
    }

    public String result(){
        String sportCar = "Sport Car: " + engine.getPower() + "\n";
        sportCar += "Transmission: " + transmission + "\n";
        sportCar += "Cor: " + color;


        return sportCar;
    }
}
