package Item;

import Fakeemon.Fakeemon;

public class HealthCandyL implements Iitem{
    @Override
    public String getName() {
        return "Health Candy L";
    }

    @Override
    public void use(Fakeemon fakeemon) {
        fakeemon.Heal(200);
    }

    @Override
    public String getDescription() {
        return "Health Candy L, Heal the fakeemon 200 HP";
    }
}