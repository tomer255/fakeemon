package Item;

import Fakeemon.Fakeemon;

public class HealthCandy implements Iitem{
    @Override
    public String getName() {
        return "Health Candy";
    }

    @Override
    public void use(Fakeemon fakeemon) {
        fakeemon.Heal(100);
    }

    @Override
    public String getDescription() {
        return "Health Candy, Heal the fakeemon 100 HP";
    }
}