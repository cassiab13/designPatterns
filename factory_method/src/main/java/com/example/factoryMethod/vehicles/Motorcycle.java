package com.example.factoryMethod.vehicles;

public class Motorcycle implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Entrega iniciada");
    }

    @Override
    public void getCargo() {
        System.out.println("Peguei a encomenda");
    }
}
