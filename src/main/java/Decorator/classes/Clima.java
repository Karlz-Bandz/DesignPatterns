package Decorator.classes;

import java.math.BigDecimal;

public class Clima extends CarDecorator {

    public Clima(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + clima";
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal price = super.getPrice();
        BigDecimal extraMoney = new BigDecimal("1000");
        return price.add(extraMoney);
    }
}
