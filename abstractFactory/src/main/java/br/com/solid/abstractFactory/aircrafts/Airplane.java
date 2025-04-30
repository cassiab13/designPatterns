package br.com.solid.abstractFactory.aircrafts;

public class Airplane implements IAircraft{
    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando rota. Pronto para decolagem.");
    }

    @Override
    public void getCargo() {
        System.out.println("Passageiros embarcados. Vôo autorizado.");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a sudoeste 25km. Ventos ok.");
    }
}
