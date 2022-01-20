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

    public void use(Fakeemon attacker, Fakeemon defender){
        Random rand = new Random();
        if(PP <= 0){
            System.out.println("No PP left");
            return;
        }
        if(getFinalAccuracy(defender) < rand.nextFloat()){
            System.out.println("Miss");
        }
        else {
            activate(attacker, defender);
        }
        PP--;
    }

    private float getFinalAccuracy(Fakeemon fakeemon){
        return accuracy - fakeemon.getSpeed()*0.05f;
    }

    abstract void activate(Fakeemon attacker, Fakeemon defender);
    public abstract String getDescription();
}
