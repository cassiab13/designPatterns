package br.com.builder;

import br.com.builder.builders.CarBuilder;
import br.com.builder.builders.SportCarBuilder;
import br.com.builder.builders.TruckBuilder;
import br.com.builder.cars.Car;
import br.com.builder.cars.SportCar;
import br.com.builder.cars.Truck;
import br.com.builder.director.Director;


public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso");

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println("Caminhão: " + truck.result());

        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.constructSportCar(sportCarBuilder);

        SportCar sportCar = sportCarBuilder.getResult();
        System.out.println("Carro esportivo " + sportCar.result());

    }
}