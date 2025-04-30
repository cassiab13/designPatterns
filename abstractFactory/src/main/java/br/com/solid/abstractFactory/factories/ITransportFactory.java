package br.com.solid.abstractFactory.factories;

import br.com.solid.abstractFactory.aircrafts.IAircraft;
import br.com.solid.abstractFactory.boats.IBoat;
import br.com.solid.abstractFactory.landVehicles.ILandVehicle;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    IBoat createTransportBoat();
}
