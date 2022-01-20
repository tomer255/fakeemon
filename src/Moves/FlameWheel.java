package Moves;

import Fakeemon.*;

public class FlameWheel extends Move {

    public FlameWheel(){
        name = "Flame Wheel";
        PP = 25;
        MaxPP = 25;
        Power = 60;
        accuracy = 1;
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
                "Stats: Medium damage skill, high Accuracy.";
    }
}
