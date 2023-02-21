package TestDecorator;

import java.math.BigDecimal;

public class IPhone11_512GB extends IPhoneDecorator{
    IPhone11_512GB(IPhone11 iPhone11_32GB) {
        super(iPhone11_32GB);
    }

    @Override
    BigDecimal getPrice() {
        return super.getPrice().add(BigDecimal.valueOf(5000));
    }

    @Override
    String getDescription() {
        return super.decription + " 512GB";
    }
}
