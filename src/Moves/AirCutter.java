package Moves;

import Fakeemon.*;

public class AirCutter extends Move {

    public AirCutter (){
        name = "Air Cutter";
        PP = 25;
        MaxPP = 25;
        Power = 60;
        accuracy = 0.95f;
        type = TypeBalance.ElementType.Flying;
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
