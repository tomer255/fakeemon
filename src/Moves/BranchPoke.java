package Moves;

import Fakeemon.*;

public class BranchPoke  extends Move{

    public BranchPoke(){
        name = "Branch Poke";
        PP = 40;
        MaxPP = 40;
        Power = 40;
        accuracy = 1;
        type = TypeBalance.ElementType.Grass;
    }

    @Override
    void activate(Fakeemon attacker, Fakeemon defender) {
        float damage = Power * TypeBalance.getBonus(type,defender.getType());
        defender.Damage(damage);
    }

    @Override
    public String getDescription() {
        return "Effect: Damage the opponent." +
                "Stats: Low damage skill, high Accuracy.";
    }
}
