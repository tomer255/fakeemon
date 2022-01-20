package Moves;

import Fakeemon.*;

public class WaterSpout extends Move {

    public WaterSpout(){
        name = "Water Spout";
        PP = 5;
        MaxPP = 5;
        Power = 150;
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
                "Stats: High damage skill, high Accuracy.";
    }
}
