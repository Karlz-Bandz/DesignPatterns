package Observer;

import Observer.classes.Channel;
import Observer.classes.Subscriber;

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
        Channel music = new Channel();

        s3.addChannel(atom);
        s4.addChannel(atom);
        s3.addChannel(programming);
        s1.addChannel(programming);
        s3.addChannel(music);
        s5.addChannel(music);
        s2.addChannel(music);

        s3.unSubTheChannel(music);



        /**
         * Atom channel
         */
        System.out.println("\nAtom channel");
        System.out.println();
        atom.uploadTitle("Sexy Frogs");
        /**
         * Programming channel
         */

        System.out.println("\nProgramming channel");
        System.out.println();
        programming.uploadTitle("How to programming in Java");
        /**
         * Muscic Channel
         */
        System.out.println("\nMuscic Channel");
        System.out.println();
        music.uploadTitle("Led Zeppelin");


    }
}
