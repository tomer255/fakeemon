package Fakeemon;

import java.util.List;

import Moves.*;

import static java.lang.Float.max;
import static java.lang.Float.min;

public class Fakeemon {
    private String Name;
    private TypeBalance.Type type;
    private float MaxHP;
    private float currentHP;
    private List<Move> attackPool;
    private float attackDamage;
    private float defenseStrength;
    private float spAtkBaseDamage;
    private float spDefBaseStrength;
    private float speed;
    private float attackDamageAmplifier;
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

    public TypeBalance.Type getType() {
        return type;
    }

    public void Damage(float amount){
        this.currentHP = max(this.currentHP - amount,0);
    }

    public List<Move> getAttackPool() {
        return attackPool;
    }

    public void Heal(float amount){
        this.currentHP = min(this.currentHP + amount,this.MaxHP);
    }

    public Fakeemon(String Name, TypeBalance.Type type, float MaxHP, float currentHP, List<Move> attackPool,
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
