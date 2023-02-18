package Observer.interfaces;

import Observer.classes.Channel;
import Observer.classes.Subscriber;

public interface Subject {

    public void subscribe(Subscriber subscriber);

    public void unSub(Subscriber subscriber);

    public void notifySubscribers(Channel channel);

    public void uploadTitle(String title);


    public String getMovie();
}
