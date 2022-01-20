package Moves;

import Fakeemon.*;

public class FloatyFall extends Move {

    public FloatyFall (){
        name = "Floaty Fall";
        PP = 15;
        MaxPP = 15;
        Power = 90;
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
