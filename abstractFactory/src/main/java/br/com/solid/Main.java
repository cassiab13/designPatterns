package br.com.solid;


import br.com.solid.abstractFactory.app.Application;
import br.com.solid.abstractFactory.factories.BoatTransport;
import br.com.solid.abstractFactory.factories.ITransportFactory;
import br.com.solid.abstractFactory.factories.NineNineTransport;
import br.com.solid.abstractFactory.factories.UberTransport;


public class Main {
    public static Application configureApplication(){
        Application app;
        ITransportFactory factory;

        String company = "uber";

        if(company.equals("uber")){
            factory = new UberTransport();
        } else if(company.equals("99")) {
            factory = new NineNineTransport();
        } else {
            factory = new BoatTransport();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRoute();
    }
}

