package TestObserver;

import java.util.List;

public interface Subject {

    void addTitle(String title);

    void addNewSub(Subscriber subscriber);

    void notifySubers();

    List<String> getTitles();
}
