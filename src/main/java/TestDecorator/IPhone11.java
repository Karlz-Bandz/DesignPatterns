package TestDecorator;

import java.math.BigDecimal;

public class IPhone11 extends IPhone {

    BigDecimal bigDecimal = new BigDecimal(1000);
    String decription = "IPhone 11";


    @Override
    BigDecimal getPrice() {
        return bigDecimal;
    }

    @Override
    String getDescription() {
        return decription;
    }
}
