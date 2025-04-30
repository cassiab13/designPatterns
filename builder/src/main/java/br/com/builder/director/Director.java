package br.com.builder.director;

import br.com.builder.builders.IBuilder;
import br.com.builder.components.CarType;
import br.com.builder.components.Color;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public class Director {

    public void constructSedanCar(IBuilder builder){
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(2);
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
        builder.setEngine(new Engine(13000));
    }

    public void constructSportCar(IBuilder builder){
        builder.setCarType(CarType.SPORTCAR);
        builder.setSeats(2);
        builder.setTransmission(Transmission.MANUAL);
        builder.setEngine(new Engine(4000));
        builder.setColor(Color.AMARELO);
    }
}
