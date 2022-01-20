package Moves;

import Fakeemon.*;

public class OverHeat extends Move {

    public OverHeat(){
        name = "Over Heat";
        PP = 5;
        MaxPP = 5;
        Power = 130;
        accuracy = 0.9f;
        type = TypeBalance.ElementType.Fire;
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