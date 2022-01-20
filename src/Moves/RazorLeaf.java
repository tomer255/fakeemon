package Moves;

import Fakeemon.*;

public class RazorLeaf extends Move{

    public RazorLeaf(){
        name = "Razor Leaf";
        PP = 25;
        MaxPP = 25;
        Power = 55;
        accuracy = 0.95f;
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
                "Stats: Medium damage skill, high Accuracy.";
    }
}
