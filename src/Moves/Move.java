package Moves;

import Fakeemon.*;

import java.util.Random;

public abstract class Move {
    protected String name;
    protected int PP;
    protected int MaxPP;
    protected int Power;
    protected float accuracy;
    protected TypeBalance.ElementType type;

    public String getName() {
        return name + " " + PP + '/' + MaxPP;
    }

    public String use(Fakeemon attacker, Fakeemon defender) {
        Random rand = new Random();
        String returnMassage;
        if (PP <= 0) {
            return  "No PP left";
        } else if (getFinalAccuracy(defender) < rand.nextFloat()) {
            returnMassage = "Miss";
        } else {
            activate(attacker, defender);
            returnMassage = getActivateMassage(defender);
        }
        PP--;
        return returnMassage;
    }

    String getActivateMassage(Fakeemon defender) {
        float effectiveness = TypeBalance.getBonus(type, defender.getType());
        if(effectiveness < 1){
            return "Move was not very effective";
        }
        else if (effectiveness > 1){
            return "Move was very effective";
        }
        else{
            return "Move was effective";
        }
    }

    private float getFinalAccuracy(Fakeemon fakeemon) {
        return accuracy - fakeemon.getSpeed() * 0.05f;
    }

    abstract void activate(Fakeemon attacker, Fakeemon defender);

    public abstract String getDescription();
}
