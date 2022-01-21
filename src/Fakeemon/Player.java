package Fakeemon;

import Item.Iitem;

import java.util.ArrayList;
import java.util.List;

public class  Player {

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

    public Fakeemon getFakeemon(){
        return currentFakeemon;
    }

    public void setCurrentFakeemon(Fakeemon currentFakeemon) {
        this.currentFakeemon = currentFakeemon;
    }

    /**
     * Adding the fakeemon to the player's fakkemon list.
     *
     * @param fakeemon - Fakeemon needs to be added to the list.
     */
    public void addFakeemon(Fakeemon fakeemon){
        if(currentFakeemon == null){
            currentFakeemon = fakeemon;
        }
        fakeemons.add(fakeemon);
    }

    /**
     * Adding the item to the player's bag items.
     *
     * @param item - The item to add to the player's list.
     */
    public void addItem(Iitem item){
        items.add(item);
    }

}
