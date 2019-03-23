package magicworld.model;

public abstract class Character {

    private String characterClass;
    private int strenght;
    private int agility;
    private int wisdom;
    private int composition;
    private int courage;
    //    Weapon   weapon;
    //    Armor    armor;
    private int capacity;
    private int defenceClass;
    //  Stuff  magic&stuff;
    private int level;
    //    Animals   animal;
    private int gamePoint;
    private int riskPoint;
    private int amount;

    public Character(String characterClass, int strenght, int agility, int wisdom, int composition,
                     int courage, int capacity, int defenceClass,
                     int level, int gamePoint, int riskPoint, int amount) {
        this.characterClass = characterClass;
        this.strenght = strenght;
        this.agility = agility;
        this.wisdom = wisdom;
        this.composition = composition;
        this.courage = courage;
        this.capacity = capacity;
        this.defenceClass = defenceClass;
        this.level = level;
        this.gamePoint = gamePoint;
        this.riskPoint = riskPoint;
        this.amount = amount;
    }

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getComposition() {
        return composition;
    }

    public void setComposition(int composition) {
        this.composition = composition;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDefenceClass() {
        return defenceClass;
    }

    public void setDefenceClass(int defenceClass) {
        this.defenceClass = defenceClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGamePoint() {
        return gamePoint;
    }

    public void setGamePoint(int gamePoint) {
        this.gamePoint = gamePoint;
    }

    public int getRiskPoint() {
        return riskPoint;
    }

    public void setRiskPoint(int riskPoint) {
        this.riskPoint = riskPoint;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
