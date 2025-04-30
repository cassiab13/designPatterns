package br.com.solid.abstractFactory.factories;

import br.com.solid.abstractFactory.aircrafts.Helicopter;
import br.com.solid.abstractFactory.aircrafts.IAircraft;
import br.com.solid.abstractFactory.boats.Boat;
import br.com.solid.abstractFactory.boats.IBoat;
import br.com.solid.abstractFactory.landVehicles.Car;
import br.com.solid.abstractFactory.landVehicles.ILandVehicle;
import br.com.solid.abstractFactory.landVehicles.Motorcycle;

public class BoatTransport implements ITransportFactory{
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    public IBoat createTransportBoat() {
        return new Boat();
    }
}
