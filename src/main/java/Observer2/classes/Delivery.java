package Observer2.classes;

import Observer2.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class Delivery implements Subject {

    private String name;
    private String adress;
    private List<Client> clients = new ArrayList<>();

    public String getAdress() {
        return adress;
    }

    public Delivery(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    @Override
    public void setNewClient(Client client) {
        this.clients.add(client);
    }

    @Override
    public void notifyAboutDelivery() {
        for(Client client: clients){
            client.update(this);
        }
    }

    @Override
    public void notifyThatDeliveryIsNotYet() {
        for (Client client: clients){
            client.notYet(this);
        }
    }

    @Override
    public void uploadStatus(int number) {
        if(number == 1){
            notifyAboutDelivery();
        }else if (number == 0){
            notifyThatDeliveryIsNotYet();
        }else {
            System.out.println("Error");
        }
    }
}
