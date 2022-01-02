public class Fekeemon {
    private String pokemonName;
    private Type type;
    private float TotalHP;
    private float currentHP;
    private List<Attack> attackPool;
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

    public Fekeemon(String pokemonName, Type type, float totalHP, float currentHP, List<Attack> attackPool,
                    float attackDamage, float defenseStrength, float spAtkBaseDamage, float spDefBaseStrength, float speed) {
        this.pokemonName = pokemonName;
        this.type = type;
        TotalHP = totalHP;
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
