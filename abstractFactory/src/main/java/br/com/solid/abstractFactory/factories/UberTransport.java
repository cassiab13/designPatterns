package br.com.solid.abstractFactory.factories;

import br.com.solid.abstractFactory.aircrafts.Airplane;
import br.com.solid.abstractFactory.aircrafts.IAircraft;
import br.com.solid.abstractFactory.landVehicles.Car;
import br.com.solid.abstractFactory.landVehicles.ILandVehicle;

public class UberTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
