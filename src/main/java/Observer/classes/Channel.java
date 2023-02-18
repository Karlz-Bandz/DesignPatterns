package Observer.classes;

import Observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Here is the channel class
 */

public class Channel implements Subject {


    private List<Subscriber> subPeople = new ArrayList<>();
    private String title;


    @Override
    public void subscribe(Subscriber subscriber){
        subPeople.add(subscriber);
    }

    @Override
    public void unSub(Subscriber subscriber){
        subPeople.remove(subscriber);
    }

    @Override
    public void notifySubscribers(Channel channel){
        for(Subscriber sub: subPeople){
            sub.update(channel);
        }
    }

    @Override
    public void uploadTitle(String title){
        this.title = title;
        notifySubscribers(this);

    }

    @Override
    public String getMovie() {
        return this.title;
    }
}
