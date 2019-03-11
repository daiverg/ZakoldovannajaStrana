package magicworld.model;

import magicworld.gamedata.MagicAttackType;

public abstract class Monster {

    private String name;
    private int defense;
    private float health;
    private int moral;
    private float attack;
    private int cost;
    private int chanceRetreat;
    private int aggression;
    private MagicAttackType magicAttack;
    private Float protectionChance;

    public Monster(String name, int defense, float health, int moral, float attack, int cost, int chanceRetreat, int aggression, MagicAttackType magicAttack, Float protectionChance) {
        this.name = name;
        this.defense = defense;
        this.health = health;
        this.moral = moral;
        this.attack = attack;
        this.cost = cost;
        this.chanceRetreat = chanceRetreat;
        this.aggression = aggression;
        this.magicAttack = magicAttack;
        this.protectionChance = protectionChance;
    }

    public MagicAttackType getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(MagicAttackType magicAttack) {
        this.magicAttack = magicAttack;
    }

    public Float getProtectionChance() {
        return protectionChance;
    }

    public void setProtectionChance(Float protectionChance) {
        this.protectionChance = protectionChance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public int getMoral() {
        return moral;
    }

    public void setMoral(int moral) {
        this.moral = moral;
    }

    public float getAttack() {
        return attack;
    }

    public void setAttack(float attack) {
        this.attack = attack;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getChanceRetreat() {
        return chanceRetreat;
    }

    public void setChanceRetreat(int chanceRetreat) {
        this.chanceRetreat = chanceRetreat;
    }

    public int getAggression() {
        return aggression;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", defense=" + defense +
                ", health=" + health +
                ", moral=" + moral +
                ", attack=" + attack +
                ", cost=" + cost +
                ", chanceRetreat=" + chanceRetreat +
                ", aggression=" + aggression +
                '}';
    }
}
