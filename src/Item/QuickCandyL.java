package Item;

import Fakeemon.Fakeemon;

public class QuickCandyL implements Iitem{
    @Override
    public String getName() {
        return "Quick Candy L";
    }

    @Override
    public void use(Fakeemon fakeemon) {
        fakeemon.AddSpeedAmplifier(2);
    }

    @Override
    public String getDescription() {
        return "Quick Candy L, increases Fakkemon's speed, thus increasing the opponent's miss chance";
    }
}