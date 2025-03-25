package com.example.factoryMethod.vehicles;

public class Car implements IVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Rota iniciada");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros embarcados");
    }
}
