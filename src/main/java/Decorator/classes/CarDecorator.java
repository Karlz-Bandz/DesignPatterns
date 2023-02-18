package Decorator.classes;

import java.math.BigDecimal;

public abstract class CarDecorator extends Car {

    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription();
    }

    @Override
    public BigDecimal getPrice() {
        return car.getPrice();
    }
}
