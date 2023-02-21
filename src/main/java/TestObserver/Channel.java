package TestObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Channel implements Subject{

    private int id;
    private String name;
    private List<String> titles = new ArrayList<>();
    private List<Subscriber> subers = new ArrayList<>();

    Channel(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public void addTitle(String title) {
        this.titles.add(title);
        this.notifySubers();
    }

    @Override
    public void addNewSub(Subscriber subscriber) {
        this.subers.add(subscriber);
    }

    @Override
    public void notifySubers() {
        for(Subscriber sub: subers){
            sub.update(this);
        }
    }

    @Override
    public List<String> getTitles() {
        return titles;
    }
}
