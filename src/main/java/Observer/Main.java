package Observer;
/**
 * Here is a simple example of the observer design pattern.
 * We can create here multiple channels like on YouTube
 * and also create how many users we want. Each user can
 * subscribe every channel he wants. After subscription
 * users will receive the notifications if the channel has got
 * the new movie.
 */

public class Main {
    public static void main(String[] args) {

        Subscriber s1 = new Subscriber("Tom");
        Subscriber s2 = new Subscriber("Jerry");
        Subscriber s3 = new Subscriber("Paul");
        Subscriber s4 = new Subscriber("Charles");
        Subscriber s5 = new Subscriber("Kevin");

        Channel atom = new Channel();
        Channel programming = new Channel();


        s3.addChannel(atom);
        s4.addChannel(atom);
        s3.addChannel(programming);
        s1.addChannel(programming);



        atom.uploadTitle("Sexy Frogs");
        programming.uploadTitle("How to programming in Java");


    }
}
