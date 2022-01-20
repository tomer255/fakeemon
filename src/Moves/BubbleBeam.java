package Moves;

import Fakeemon.*;

public class BubbleBeam extends Move {

    public BubbleBeam(){
        name = "Bubble Beam";
        PP = 20;
        MaxPP = 20;
        Power = 65;
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
                "Stats: Low damage skill, high Accuracy.";
    }
}
