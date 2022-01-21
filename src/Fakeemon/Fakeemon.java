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
    private final float speed;
    private float defenseStrengthAmplifier;
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

    public List<Move> getAttackPool() {
        return attackPool;
    }

    /**
     * Return the formatted description.
     */
    public String getDescription(){
        return String.format("Name:%s HP:%s/%s",Name,currentHP,MaxHP);
    }

    /**
     * Returns the Fakeemon's speed multiplied by his amplifier.
     */
    public float getSpeed() {
        return speed * speedAmplifier;
    }

    /**
     * Returns the Fakeemon's defense strength multiplied by his amplifier.
     */
    public float getDefenseStrength(){
        return defenseStrength * defenseStrengthAmplifier;
    }

    /**
     * Calculates the damage done to attacked Fakeemon,
     * Calculate based on the strength of the attack and defense of the Fakeemon attacked.
     *
     * @param attackerDamage - An attacker's damage before calculation.
     */
    public void Damage(float attackerDamage){
        float newHP = this.currentHP - (attackerDamage / getDefenseStrength());
        this.currentHP = max(newHP,0);
    }

    public void Heal(float amount) {
        this.currentHP = min(this.currentHP + amount, this.MaxHP);
    }

    /**
     * Return the speed amplifier after calculation.
     * Converts the integer to a float in order to add it to an amplifier,
     * which has the values 1.0, 1.1, 1.2, 1.3...
     *
     * @param addToAmplifier - An integer represents the amplifier addition.
     */
    public void AddSpeedAmplifier (int addToAmplifier){
        speedAmplifier += addToAmplifier * 0.1f;
    }

    /**
     * Return the Defense Strength amplifier after calculation.
     * Converts the integer to a float in order to add it to an amplifier,
     * which has the values 1.0, 1.1, 1.2, 1.3...
     *
     * @param addToAmplifier - An integer represents the amplifier addition.
     */
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
        this.speed = speed;
        this.defenseStrengthAmplifier = 1;
        this.speedAmplifier = 1;
    }
}
