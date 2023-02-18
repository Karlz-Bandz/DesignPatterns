package Observer2.interfaces;

import Observer2.classes.Client;

public interface Subject {

    void setNewClient(Client client);

    void notifyAboutDelivery();

    void notifyThatDeliveryIsNotYet();

    void uploadStatus(int number);
}
