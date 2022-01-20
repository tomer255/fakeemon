package Fakeemon;


// using Singleton
public class TypeBalance {

    static TypeBalance typeBalance = new TypeBalance();

    private final float[][] bonus = new float[ElementType.values().length][ElementType.values().length];

    private TypeBalance(){

        setBonus(ElementType.Fire, ElementType.Fire,0.5f);
        setBonus(ElementType.Fire, ElementType.Water,0.5f);
        setBonus(ElementType.Fire, ElementType.Grass,2.0f);
        setBonus(ElementType.Fire, ElementType.Flying,1.0f);
        setBonus(ElementType.Fire, ElementType.Electric,1.0f);

        setBonus(ElementType.Water, ElementType.Fire,2.0f);
        setBonus(ElementType.Water, ElementType.Water,0.5f);
        setBonus(ElementType.Water, ElementType.Grass,0.5f);
        setBonus(ElementType.Water, ElementType.Flying,1.0f);
        setBonus(ElementType.Water, ElementType.Electric,1.0f);

        setBonus(ElementType.Grass, ElementType.Fire,0.5f);
        setBonus(ElementType.Grass, ElementType.Water,2.0f);
        setBonus(ElementType.Grass, ElementType.Grass,0.5f);
        setBonus(ElementType.Grass, ElementType.Flying,0.5f);
        setBonus(ElementType.Grass, ElementType.Electric,1.0f);

        setBonus(ElementType.Flying, ElementType.Fire,1.0f);
        setBonus(ElementType.Flying, ElementType.Water,1.0f);
        setBonus(ElementType.Flying, ElementType.Grass,2.0f);
        setBonus(ElementType.Flying, ElementType.Flying,1.0f);
        setBonus(ElementType.Flying, ElementType.Electric,0.5f);

        setBonus(ElementType.Electric, ElementType.Fire,1.0f);
        setBonus(ElementType.Electric, ElementType.Water,2.0f);
        setBonus(ElementType.Electric, ElementType.Grass,0.5f);
        setBonus(ElementType.Electric, ElementType.Flying,2.0f);
        setBonus(ElementType.Electric, ElementType.Electric,0.5f);

    }

    private void setBonus(ElementType attacker, ElementType defender, float value){
        bonus[attacker.ordinal()][defender.ordinal()] = value;
    }

    public static float getBonus(ElementType attacker, ElementType defender){
        return typeBalance.bonus[attacker.ordinal()][defender.ordinal()];
    }

    public enum ElementType {
        Fire,
        Water,
        Grass,
    }
}
