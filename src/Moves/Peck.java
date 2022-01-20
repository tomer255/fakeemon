package Moves;

import Fakeemon.*;

public class Peck  extends Move {

    public Peck (){
        name = "Peck";
        PP = 35;
        MaxPP = 35;
        Power = 35;
        accuracy = 1;
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
                "Stats: Low damage skill, high Accuracy.";
    }
}
