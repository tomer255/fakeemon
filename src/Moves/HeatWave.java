package Moves;

import Fakeemon.*;

public class HeatWave extends Move {

    public HeatWave(){
        name = "Heat Wave";
        PP = 10;
        MaxPP = 10;
        Power = 95;
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
                "Stats: High damage skill, Medium Accuracy.";
    }
}