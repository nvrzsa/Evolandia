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

    /**
     * Checks if two creatures are eligible for evolution.
     * Two creatures are eligible for evolution if they have the same family and evolution level (except EL3).
     *
     * @param creature1 The first creature for evolution.
     * @param creature2 The second creature for evolution.
     * @return True if the creatures are eligible for evolution, false otherwise.
     */
    public static boolean isEligibleForEvolution(Creatures creature1, Creatures creature2) {
        // Check if both creatures belong to the same family and have the same evolution level
        return creature1.getFamily().equals(creature2.getFamily()) &&
                creature1.getEvol() == creature2.getEvol() &&
                creature1.getEvol() != 3; // EL3 creatures cannot evolve further
    }

    /**
     * Evolves two eligible creatures into a new evolved creature.
     * Assumes the creatures are eligible for evolution.
     *
     * @param creature1 The first creature for evolution.
     * @param creature2 The second creature for evolution.
     * @return The evolved creature if the evolution is successful, null otherwise.
     */
    public static Creatures evolveCreatures(Creatures creature1, Creatures creature2) {
        // Check eligibility for evolution
        if (isEligibleForEvolution(creature1, creature2)) {
            // Create a new creature with the same family and an increased evolution level
            String family = creature1.getFamily();
            int newEvolLevel = creature1.getEvol() + 1; // Increment the evolution level
            String evolvedName = "Evolved " + family; // You can modify this as needed for naming conventions
            String type = creature1.getType(); // Assume the type remains the same for evolution
            return new Creatures(newEvolLevel, evolvedName, type, family);
        } else {
            // Creatures are not eligible for evolution
            System.out.println("These creatures are not eligible for evolution.");
            return null;
        }
    }
}