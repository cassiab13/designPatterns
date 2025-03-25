package com.example.factoryMethod;

import com.example.factoryMethod.vehicles.Car;
import com.example.factoryMethod.vehicles.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
