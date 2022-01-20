package Moves;

import Fakeemon.*;

public class Aeroblast extends Move {

    public Aeroblast (){
        name = "Aeroblast";
        PP = 5;
        MaxPP = 5;
        Power = 100;
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
                "Stats: High damage skill, high Accuracy.";
    }
}
