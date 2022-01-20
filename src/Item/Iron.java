package Item;

import Fakeemon.Fakeemon;

public class Iron implements Iitem{
    @Override
    public String getName() {
        return "Iron";
    }

    @Override
    public void use(Fakeemon fakeemon) {
        fakeemon.AddDefenseStrengthAmplifier(2);
    }

    @Override
    public String getDescription() {
        return "Iron , increases Fakkemon's defense strength\n" +
                "As a result, the opponent's damage is reduced";
    }
}