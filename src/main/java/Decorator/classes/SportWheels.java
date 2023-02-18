package Decorator.classes;

import java.math.BigDecimal;

public class SportWheels extends CarDecorator{
    public SportWheels(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + sport wheels";
    }

    @Override
    public BigDecimal getPrice() {
        BigDecimal price = super.getPrice();
        BigDecimal extraMoney = new BigDecimal("7000");
        return price.add(extraMoney);
    }
}
