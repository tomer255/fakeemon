package Moves;

import Fakeemon.*;

public class SeedFlare  extends Move{

    public SeedFlare(){
        name = "Seed Flare";
        PP = 5;
        MaxPP = 5;
        Power = 120;
        accuracy = 0.85f;
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
                "Stats: High damage skill, Medium Accuracy.";
    }
}
