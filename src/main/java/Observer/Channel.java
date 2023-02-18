package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Here is the channel class
 */

public class Channel {


    private List<Subscriber> subPeople = new ArrayList<>();
    private String title;

    public void subscribe(Subscriber subscriber){
        subPeople.add(subscriber);
    }
    public void unSub(Subscriber subscriber){
        subPeople.remove(subscriber);
    }

    public void notifySubscribers(Channel channel){
        for(Subscriber sub: subPeople){
            sub.update(channel);
        }
    }

    public void uploadTitle(String title){
        this.title = title;
        notifySubscribers(this);

    }

    public String getMovie() {
        return this.title;
    }
}
