package Moves;

import Fakeemon.*;

public class Thunder extends Move {

    public Thunder(){
        name = "Thunder";
        PP = 10;
        MaxPP = 10;
        Power = 110;
        accuracy = 70;
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
                "Stats: High damage skill, Low Accuracy.";
    }
}
