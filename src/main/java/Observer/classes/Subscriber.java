package Observer.classes;


import Observer.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Here is subscriber class
 */

public class Subscriber implements Observer {

    private String name;
    private List<Channel> channels = new ArrayList<>();

    public Subscriber(String name) {
        this.name = name;
    }

    public void addChannel(Channel channel){
        channel.subscribe(this);
        channels.add(channel);
    }


    @Override
    public void update(Channel channel) {
        System.out.println("Hello " + name + " the video " + channel.getMovie() +  " is uploaded on channel ");
    }

    @Override
    public void unSubTheChannel(Channel channel) {
        channel.unSub(this);
    }

}
