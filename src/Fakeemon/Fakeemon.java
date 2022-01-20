package Fakeemon;

import java.util.List;

import Moves.*;

import static java.lang.Float.max;
import static java.lang.Float.min;

public class Fakeemon {
    private final String Name;
    private final TypeBalance.ElementType type;
    private final float MaxHP;
    private float currentHP;
    private final List<Move> attackPool;
    private final float attackDamage;
    private final float defenseStrength;
    private final float spAtkBaseDamage;
    private final float spDefBaseStrength;
    private final float speed;
    private final float attackDamageAmplifier;
    private float defenseStrengthAmplifier;
    private float spAtkBaseDamageAmplifier;
    private float spDefBaseStrengthAmplifier;
    private float speedAmplifier;

    public float getMaxHP() {
        return MaxHP;
    }

    public float getCurrentHP() {
        return currentHP;
    }

    public String getName() {
        return Name;
    }

    public TypeBalance.ElementType getType() {
        return type;
    }

    public float getSpeed() {
        return speed * speedAmplifier;
    }
    
    public float getDefenseStrength(){
        return defenseStrength * defenseStrengthAmplifier;
    }

    public void Damage(float amount){
        float newHP = this.currentHP - (amount / getDefenseStrength());
        this.currentHP = max(newHP,0);
    }

    public String getDescription(){
        return String.format("Name:%s HP:%s/%s",Name,currentHP,MaxHP);
    }

    public List<Move> getAttackPool() {
        return attackPool;
    }

    public void Heal(float amount){
        this.currentHP = min(this.currentHP + amount,this.MaxHP);
    }

    public void AddSpeedAmplifier (int addToAmplifier){
        speedAmplifier += addToAmplifier * 0.1f;
    }

    public void AddDefenseStrengthAmplifier (int addToAmplifier){
        defenseStrengthAmplifier += addToAmplifier* 0.1f;
    }

    public Fakeemon(String Name, TypeBalance.ElementType type, float MaxHP, float currentHP, List<Move> attackPool,
                    float attackDamage, float defenseStrength, float spAtkBaseDamage, float spDefBaseStrength, float speed) {
        this.Name = Name;
        this.type = type;
        this.MaxHP = MaxHP;
        this.currentHP = currentHP;
        this.attackPool = attackPool;
        this.attackDamage = attackDamage;
        this.defenseStrength = defenseStrength;
        this.spAtkBaseDamage = spAtkBaseDamage;
        this.spDefBaseStrength = spDefBaseStrength;
        this.speed = speed;
        this.attackDamageAmplifier = 1;
        this.defenseStrengthAmplifier = 1;
        this.spAtkBaseDamageAmplifier = 1;
        this.spDefBaseStrengthAmplifier = 1;
        this.speedAmplifier = 1;
    }
}
