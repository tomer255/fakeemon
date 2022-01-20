package Moves;

import Fakeemon.*;

public class BlazeKick extends Move {

    public BlazeKick(){
        name = "Blaze Kick";
        PP = 10;
        MaxPP = 10;
        Power = 85;
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
                "Stats: Medium damage skill, high Accuracy.";
    }
}
