package Item;

import Fakeemon.Fakeemon;

public interface Iitem {
    String getName();
    void use(Fakeemon fakeemon);
    String getDescription();
}
