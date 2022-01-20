package Item;

import Fakeemon.Fakeemon;

public class QuickCandyXL implements Iitem{
    @Override
    public String getName() {
        return "Quick Candy XL";
    }

    @Override
    public void use(Fakeemon fakeemon) {
        fakeemon.AddSpeedAmplifier(3);
    }

    @Override
    public String getDescription() {
        return "Quick Candy XL, increases Fakkemon's speed, thus increasing the opponent's miss chance";
    }
}