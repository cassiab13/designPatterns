package com.example.factoryMethod.vehicles;

public class Bike implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Eats iniciado");
    }

    @Override
    public void getCargo() {
        System.out.println("Coletei a entrega");
    }
}
