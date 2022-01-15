package Fakeemon;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Fakeemon> Fakeemons = new ArrayList<>();

    public void addFakeemon(Fakeemon fakeemon){
        Fakeemons.add(fakeemon);
    }

    public Fakeemon getFakeemon(){
        return Fakeemons.get(0);
    }
}
