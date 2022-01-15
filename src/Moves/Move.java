package Moves;
import Fakeemon.*;

import java.util.Random;

public abstract class Move {
    protected String name;
    protected int PP;
    protected int MaxPP;
    protected int Power;
    protected float accuracy;
    protected TypeBalance.Type type;

    public String getName() {
        return name + PP + '/' + MaxPP;
    }

    public boolean use(Fakeemon attacker, Fakeemon defender){
        Random rand = new Random();
        if(PP <= 0){
            System.out.println("No PP left");
            return false;
        }
        if(accuracy < rand.nextFloat()){
            System.out.println("Miss");
            return false;
        }
        activate(attacker, defender);
        PP--;
        System.out.println(getName());
        System.out.println(String.format("attacker HP: %s",attacker.getCurrentHP()));
        System.out.println(String.format("defender HP: %s",defender.getCurrentHP()));
        System.out.println(String.format("PP left: %s",PP));
        return true;
    }

    abstract void activate(Fakeemon attacker, Fakeemon defender);
}
