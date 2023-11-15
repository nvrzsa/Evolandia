/**
 * This is the Creatures class which contains the evolution level, name, type, family, health of the Creatures.
 */
public class Creatures {
    /** The evolution level of the creature */
    private int evoLvl;
    /** The name of the creature */
    private String name;
    /** The type of the creature */
    private String type;
    /** The family of the creature */
    private String family;
    /** The health of the creature */
    private double health;

    /**
     * Constructor for the Creatures class
     * @param evoLvl    evolution level of the creature
     * @param name      name of the creature
     * @param type      type of the creature
     * @param family    family of the creature
     * @param health    health of the creature
     */
    public Creatures(int evoLvl, String name, String type, String family){
        this.evoLvl = evoLvl;
        this.name = name;
        this.type = type;
        this.family = family;
        this.health = 50;
    }

    /**
     * Returns the evolution level of the creature.
     * @return
     */
    public int getEvol(){
        return this.evoLvl;
    }

    /**
     * Returns the name of the creature.
     * @return
     */
    public String getName(){
        return this.name;
    }

    /**
     * Returns the type of the creature.
     * @return
     */
    public String getType(){
        return this.type;
    }

    /**
     * Returns the family of the creature.
     * @return
     */
    public String getFamily(){
        return this.family;
    }

    /**
     * Returns the health of the creature.
     * @return
     */
    public double getHealth(){
        return this.health;
    }

    /**
     * Sets the health of the creature to a new value.
     * @param health
     */
    public void setHealth(double health){
        this.health = health;
    }
}