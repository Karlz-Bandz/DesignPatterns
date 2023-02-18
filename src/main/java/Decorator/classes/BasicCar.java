package Decorator.classes;

import java.math.BigDecimal;

public class BasicCar extends Car{

    BigDecimal bigDecimal = new BigDecimal("50000.00");

    @Override
    public BigDecimal getPrice() {
        return bigDecimal;
    }

    @Override
    public String getDescription() {
        return "Basic car";
    }
}
