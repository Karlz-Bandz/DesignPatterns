package Observer2;

import Observer2.classes.Client;
import Observer2.classes.Delivery;

public class Main {
    public static void main(String[] args) {

        Client karol = new Client(1, "Karol");
        Client karolina = new Client(2, "Karolina");
        Client adam = new Client(3, "Adam");

        Delivery delivery1 = new Delivery("Farby", "ul. Puławska 169");
        Delivery delivery2 = new Delivery("Nożyczki", "ul. Ogrodowa 4");
        Delivery delivery3 = new Delivery("Szampony", "ul. Puławska 169");

        karol.setTheNewDelivery(delivery1);
        karolina.setTheNewDelivery(delivery1);
        adam.setTheNewDelivery(delivery2);
        karolina.setTheNewDelivery(delivery2);
        karol.setTheNewDelivery(delivery3);
        karolina.setTheNewDelivery(delivery3);

        System.out.println("\nDelivery 1 status\n");
        delivery1.uploadStatus(1);
        System.out.println("\nDelivery 2 status\n");
        delivery2.uploadStatus(0);
        System.out.println("\nDelivery 3 status\n");
        delivery3.uploadStatus(0);


    }
}
