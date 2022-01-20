package Moves;

import Fakeemon.*;

public class ThunderShock extends Move {

    public ThunderShock (){
        name = "Thunder Shock";
        PP = 30;
        MaxPP = 30;
        Power = 40;
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
                "Stats: Low damage skill, high Accuracy.";
    }
}
