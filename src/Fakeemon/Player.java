package Fakeemon;

import Item.Iitem;

import java.util.ArrayList;
import java.util.List;

public class Player {


    private final List<Fakeemon> fakeemons = new ArrayList<>();

    private Fakeemon currentFakeemon = null;

    private final List<Iitem> items = new ArrayList<>();

    public List<Iitem> getItems() {
        return items;
    }

    public List<Fakeemon> getFakeemons()
    {
        return fakeemons;
    }

    public void addFakeemon(Fakeemon fakeemon){
        if(currentFakeemon == null){
            currentFakeemon = fakeemon;
        }
        fakeemons.add(fakeemon);
    }

    public void setCurrentFakeemon(Fakeemon currentFakeemon) {
        this.currentFakeemon = currentFakeemon;
    }

    public void addItem(Iitem item){
        items.add(item);
    }

    public Fakeemon getFakeemon(){
        return currentFakeemon;
    }
}
