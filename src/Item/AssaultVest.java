package Item;

import Fakeemon.Fakeemon;

public class AssaultVest implements Iitem{
    @Override
    public String getName() {
        return "Assault Vest";
    }

    @Override
    public void use(Fakeemon fakeemon) {
        fakeemon.AddDefenseStrengthAmplifier(2);
    }

    @Override
    public String getDescription() {
        return "Assault Vest, increases Fakkemon's defense strength\n" +
                "As a result, the opponent's damage is reduced";
    }
}