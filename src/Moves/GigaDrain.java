package Moves;

import Fakeemon.*;

public class GigaDrain extends Move{

    public GigaDrain(){
        name = "Giga Drain";
        PP = 10;
        MaxPP = 10;
        Power = 75;
        accuracy = 1;
        type = TypeBalance.ElementType.Grass;
    }

    @Override
    void activate(Fakeemon attacker, Fakeemon defender) {
        float damage = Power * TypeBalance.getBonus(type,defender.getType());
        defender.Damage(damage);
        attacker.Heal(damage/2);
    }

    @Override
    public String getDescription() {

        return "Effect: Damage the opponent and recover half of the damage caused." +
                "Stats: Medium damage skill, high Accuracy.";
    }
}
