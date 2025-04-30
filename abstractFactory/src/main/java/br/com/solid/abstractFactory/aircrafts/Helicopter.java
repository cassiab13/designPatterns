package br.com.solid.abstractFactory.aircrafts;

public class Helicopter implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Ligando as hélices");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros a bordo");
    }

    @Override
    public void wind() {
        System.out.println("Ventos ok");
    }
}
