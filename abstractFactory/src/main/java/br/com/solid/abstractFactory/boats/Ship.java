package br.com.solid.abstractFactory.boats;

public class Ship implements IBoat{
    @Override
    public void startRoute() {
        startEngine();
        getCargo();
        System.out.println("Navio pronto. Partindo");
    }

    @Override
    public void startEngine() {
        System.out.println("Motores prontos");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo");
    }
}
