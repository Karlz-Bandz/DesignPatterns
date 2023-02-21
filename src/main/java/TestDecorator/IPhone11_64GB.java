package TestDecorator;

import java.math.BigDecimal;

public class IPhone11_64GB extends IPhoneDecorator{
    IPhone11_64GB(IPhone11 iPhone11_32GB) {
        super(iPhone11_32GB);
    }

    @Override
    BigDecimal getPrice() {
        BigDecimal newpr = super.getPrice().add(BigDecimal.valueOf(1000));
        return newpr;
    }

    @Override
    String getDescription() {
        return super.decription + " 64GB";
    }

}
