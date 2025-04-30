package br.com.solid.abstractFactory.landVehicles;

public class Motorcycle implements ILandVehicle{
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Encomenda pronta");
    }
}
