package br.com.solid.abstractFactory.app;

import br.com.solid.abstractFactory.aircrafts.IAircraft;
import br.com.solid.abstractFactory.factories.ITransportFactory;
import br.com.solid.abstractFactory.landVehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory){
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute(){
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
