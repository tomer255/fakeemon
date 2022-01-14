package Fakeemon;

public final class TypeBalance {

    private float[][] bonus = new float[Type.values().length][Type.values().length];

    public void initialize(){

        setBonus(Type.Fire,Type.Fire,0.5f);
        setBonus(Type.Fire,Type.Water,0.5f);
        setBonus(Type.Fire,Type.Grass,2.0f);

        setBonus(Type.Water,Type.Fire,2.0f);
        setBonus(Type.Water,Type.Water,0.5f);
        setBonus(Type.Water,Type.Grass,0.5f);

        setBonus(Type.Grass,Type.Fire,0.5f);
        setBonus(Type.Grass,Type.Water,2.0f);
        setBonus(Type.Grass,Type.Grass,0.5f);
    }

    private void setBonus(Type attacker,Type defender,float vale){
        bonus[attacker.ordinal()][defender.ordinal()] = vale;
    }

    public float getBonus(Type attacker,Type defender){
        return bonus[attacker.ordinal()][defender.ordinal()];
    }

    public enum Type{
        Fire,
        Water,
        Grass,
    }
}
