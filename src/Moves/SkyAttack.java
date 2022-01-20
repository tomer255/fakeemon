package Moves;

import Fakeemon.*;

public class SkyAttack extends Move {

    public SkyAttack (){
        name = "Sky Attack";
        PP = 5;
        MaxPP = 5;
        Power = 140;
        accuracy = 0.90f;
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
                "Stats: High damage skill, Medium Accuracy.";
    }
}
