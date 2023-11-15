import java.util.ArrayList;
import java.util.List;

/**
 * This is the Inventory class, it manages a collection of creatures and an active creature in a game.
 * It allows adding creatures, displaying stored creatures, setting an active creature, and more.
 */
public class Inventory{
    private ArrayList<Creatures> creature = new ArrayList<>();
    private Creatures activeCreature;

    /**
     * Add a new creature to the inventory.
     *
     * @param creature The creature to add to the inventory.
     */
    public void addCreature(Creatures creature){
        this.creature.add(creature);
    }

    /**
     * Display information about all creatures stored in the inventory, including their name, evolution level, family, and type.
     */
    public void showCreature(){
        for (int i = 0; i < creature.size(); i++){
            Creatures stored = creature.get(i);
            System.out.println("-------------------------");
            System.out.println("Index: " + i);
            System.out.println("Name: " + stored.getName());
            System.out.println("Evolution level: " + stored.getEvol());
            System.out.println("Family: " + stored.getFamily());
            System.out.println("Type: " + stored.getType());
            System.out.println("-------------------------\n");
        }
    }

    /**
     * Set a creature as the active creature in the inventory.
     *
     * @param creature The creature to set as the active one.
     */
    public void setActive(Creatures creature){
        this.activeCreature = creature;
        System.out.println("The active creature is: " + this.activeCreature.getName());
    }

    /**
     * Get the currently active creature.
     *
     * @return The active creature.
     */
    public Creatures getActiveCreature(){
        return this.activeCreature;
    }

    /**
     * Get the count of creatures stored in the inventory.
     *
     * @return The count of creatures in the inventory.
     */
    public int getCreatureCount() {
        return creature.size();
    }

    /**
     * Get a creature at a specific index in the inventory.
     *
     * @param index The index of the creature to retrieve.
     * @return The creature at the specified index or null if the index is out of bounds.
     */
    public Creatures getCreature(int index) {
        if (index >= 0 && index < creature.size()) {
            return creature.get(index);
        } else {
            return null;
        }
    }

    /**
     * Swap the active creature to another creature in the inventory based on its index.
     *
     * @param index The index of the creature to set as the active one.
     */
    public void swap(int index) {
        if (index >= 0 && index < creature.size()) {
            Creatures newActiveCreature = creature.get(index);
            setActive(newActiveCreature);
            System.out.println(newActiveCreature.getName() + " is now your active creature.");
        } else {
            System.out.println("Invalid index for swapping.");
        }
    }
}

