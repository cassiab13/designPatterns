package br.com.builder.builders;

import br.com.builder.components.CarType;
import br.com.builder.components.Color;
import br.com.builder.components.Engine;
import br.com.builder.components.Transmission;

public interface IBuilder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setColor(Color color);
}
