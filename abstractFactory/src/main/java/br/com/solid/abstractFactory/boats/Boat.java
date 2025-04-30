package br.com.solid.abstractFactory.boats;

public class Boat implements IBoat{
    @Override
    public void startRoute() {
        startEngine();
        getCargo();
        System.out.println("Barco partindo");
    }

    @Override
    public void startEngine() {
        System.out.println("Motores ligados. Vento a 10km");
    }

    @Override
    public void getCargo() {
        System.out.println("Encomenda a bordo");
    }
}
