package Item;

import Fakeemon.Fakeemon;

public class HealthCandyXL implements Iitem{
    @Override
    public String getName() {
        return "Health Candy XL";
    }

    @Override
    public void use(Fakeemon fakeemon) {
        fakeemon.Heal(300);
    }

    @Override
    public String getDescription() {
        return "Health Candy XL, Heal the fakeemon 300 HP";
    }
}