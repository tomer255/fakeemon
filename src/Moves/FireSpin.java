package Moves;

import Fakeemon.*;

public class FireSpin extends Move {

    public FireSpin(){
        name = "Fire Spin";
        PP = 15;
        MaxPP = 15;
        Power = 35;
        accuracy = 0.85f;
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
                "Stats: Low damage skill, Medium Accuracy.";
    }
}