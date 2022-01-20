package Item;

import Fakeemon.Fakeemon;

public class Zinc implements Iitem{
    @Override
    public String getName() {
        return "Zinc";
    }

    @Override
    public void use(Fakeemon fakeemon) {
        fakeemon.AddDefenseStrengthAmplifier(1);
    }

    @Override
    public String getDescription() {
        return "Zinc , increases Fakkemon's defense strength\n" +
                "As a result, the opponent's damage is reduced";
    }
}