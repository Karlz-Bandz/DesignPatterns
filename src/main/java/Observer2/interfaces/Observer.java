package Observer2.interfaces;

import Observer2.classes.Delivery;

public interface Observer {

    void update(Delivery delivery);

    void setTheNewDelivery(Delivery delivery);

    void notYet(Delivery delivery);

}
