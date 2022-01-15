package Moves;

import Fakeemon.*;

public class Absorb extends Move{

    public Absorb(){
        name = "Absorb";
        PP = 25;
        MaxPP = 25;
        Power = 20;
        accuracy = 1;
        type = TypeBalance.Type.Grass;
    }

    @Override
    void activate(Fakeemon attacker, Fakeemon defender) {
        float damage = Power * TypeBalance.getBonus(type,defender.getType());
        defender.Damage(damage);
        attacker.Heal(damage);
    }
}
