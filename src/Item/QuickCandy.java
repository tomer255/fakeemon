package Item;

import Fakeemon.Fakeemon;

public class QuickCandy implements Iitem{
    @Override
    public String getName() {
        return "Quick Candy";
    }

    @Override
    public void use(Fakeemon fakeemon) {
        fakeemon.AddSpeedAmplifier(1);
    }

    @Override
    public String getDescription() {
        return "Quick Candy , increases Fakkemon's speed, thus increasing the opponent's miss chance";
    }
}