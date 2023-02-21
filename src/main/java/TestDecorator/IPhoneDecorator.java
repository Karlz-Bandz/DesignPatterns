package TestDecorator;

import java.math.BigDecimal;

public abstract class IPhoneDecorator extends IPhone11 {

    IPhone11 iPhone11_32GB;

    IPhoneDecorator(IPhone11 iPhone11_32GB){
        this.iPhone11_32GB = iPhone11_32GB;
    }

    @Override
    BigDecimal getPrice() {
        return iPhone11_32GB.getPrice();
    }

    @Override
    String getDescription() {
        return iPhone11_32GB.getDescription();
    }
}
