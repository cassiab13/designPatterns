package br.com.solid.abstractFactory.factories;

import br.com.solid.abstractFactory.aircrafts.Helicopter;
import br.com.solid.abstractFactory.aircrafts.IAircraft;
import br.com.solid.abstractFactory.landVehicles.ILandVehicle;
import br.com.solid.abstractFactory.landVehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
