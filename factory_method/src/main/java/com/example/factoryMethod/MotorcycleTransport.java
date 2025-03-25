package com.example.factoryMethod;

import com.example.factoryMethod.vehicles.IVehicle;
import com.example.factoryMethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
