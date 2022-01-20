package Moves;

import Fakeemon.*;

public class ThunderPunch extends Move {

    public ThunderPunch(){
        name = "Thunder Punch";
        PP = 15;
        MaxPP = 15;
        Power = 75;
        accuracy = 1;
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
                "Stats: Medium damage skill, high Accuracy.";
    }
}
