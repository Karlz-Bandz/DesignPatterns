package TestObserver;

public class Main {

    /*
    * Here is a little better solution than solution in Observer package
     */

    public static void main(String[] args) {
        Subscriber karol = new Subscriber(1,"Karol", "karol222@gmail.com");
        Subscriber karolina = new Subscriber(2,"Karolina", "karola222@gmail.com");
        Subscriber kamil = new Subscriber(3,"Kamil", "kamilo222@gmail.com");


        Channel channel1 = new Channel(1, "Jackass");
        Channel channel2 = new Channel(2, "Music");

        kamil.subChannel(channel1);
        karol.subChannel(channel1);
        karolina.subChannel(channel2);

        channel1.addTitle("Stev-o new");
        channel1.addTitle("Crash th car");
        channel2.addTitle("How to play guitar");


    }
}
