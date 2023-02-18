package Observer2.classes;

import Observer2.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Client implements Observer {

    private int id;
    private String name;
    private List<Delivery> deliveries = new ArrayList<>();

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public void update(Delivery delivery) {
        System.out.println("Hello " + this.name + " your delivery is already at " + delivery.getAdress());
    }

    @Override
    public void setTheNewDelivery(Delivery delivery) {
        delivery.setNewClient(this);
        this.deliveries.add(delivery);
    }

    @Override
    public void notYet(Delivery delivery) {
        System.out.println("Hello " + this.name +  " your delivery is not yet at " + delivery.getAdress() + " Sorry :(");
    }
}
