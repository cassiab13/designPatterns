package com.example.factoryMethod;

import com.example.factoryMethod.vehicles.Bike;
import com.example.factoryMethod.vehicles.IVehicle;

public class BikeTransport extends Transport{
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
