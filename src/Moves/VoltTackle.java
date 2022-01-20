package Moves;

import Fakeemon.*;

public class VoltTackle extends Move {

    public VoltTackle(){
        name = "Volt Tackle";
        PP = 15;
        MaxPP = 15;
        Power = 120;
        accuracy = 100;
        type = TypeBalance.ElementType.Electric;
    }

    @Override
    void activate(Fakeemon attacker, Fakeemon defender) {
        float damage = Power * TypeBalance.getBonus(type,defender.getType());
        defender.Damage(damage);
    }

    @Override
    public String getDescription() {

        return "Effect: Damage the opponent." +
                "Stats: High damage skill, high Accuracy.";
    }
}
