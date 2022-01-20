package Moves;

import Fakeemon.*;

public class SplishySplash extends Move {

    public SplishySplash(){
        name = "Splishy Splash";
        PP = 15;
        MaxPP = 15;
        Power = 90;
        accuracy = 1;
        type = TypeBalance.ElementType.Water;
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
