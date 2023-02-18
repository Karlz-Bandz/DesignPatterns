package Observer.interfaces;

import Observer.classes.Channel;

public interface Observer {

    void update(Channel channel);

    void unSubTheChannel(Channel channel);
}
