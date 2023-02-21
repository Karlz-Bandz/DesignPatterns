package TestObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Subscriber implements Obserever{

    private int id;
    private String name;
    private String mail;
    private List<Channel> channels = new ArrayList<>();


    Subscriber(int id, String name, String mail){
        this.id = id;
        this.name = name;
        this.mail = mail;
    }



    @Override
    public void update(Channel channel) {
        List<String> titles = channel.getTitles();
        String title = titles.get(titles.size()-1);


        System.out.println("Hello " + this.name + " on the channel " + channel.getName() +
        " is the new title called " + title);
    }

    @Override
    public void subChannel(Channel channel) {
        channel.addNewSub(this);
        this.channels.add(channel);
    }
}
