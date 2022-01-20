package Moves;

import Fakeemon.*;

public class Nuzzle extends Move {

    public Nuzzle (){
        name = "Nuzzle";
        PP = 20;
        MaxPP = 20;
        Power = 20;
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
