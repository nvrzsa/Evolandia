import java.util.Scanner;

/**
 * This is the Battle class, it represents a battle between active and enemy creatures in a game.
 * It allows the player to choose actions like attacking, swapping creatures, catching creatures, or fleeing.
 */
public class Battle {
    private Creatures activeCreature;
    private Creatures enemyCreature;
    private Inventory inventory;

    /**
     * Constructs a Battle with the specified active creature, enemy creature, and inventory.
     *
     * @param activeCreature The player's active creature.
     * @param enemyCreature  The enemy creature to battle.
     * @param inventory      The player's inventory of creatures.
     */
    public Battle(Creatures activeCreature, Creatures enemyCreature, Inventory inventory) {
        this.activeCreature = activeCreature;
        this.enemyCreature = enemyCreature;
        this.inventory = inventory;
    }

    /**
     * Perform an attack action on the enemy creature based on type advantages.
     * The damage calculation takes into account the active creature's evolution level and type advantage.
     */
    private void attack() {
        String cType = activeCreature.getType();
        String eType = enemyCreature.getType();

        int randomNumber = new java.util.Random().nextInt(10) + 1;
        double hp = enemyCreature.getHealth();
        int damage = randomNumber * activeCreature.getEvol();

        if (cType.equals("fire") && eType.equals("grass")) {
            damage *= 1.5;
        } else if (cType.equals("grass") && eType.equals("water")) {
            damage *= 1.5;
        } else if (cType.equals("water") && eType.equals("fire")) {
            damage *= 1.5;
        }
        hp -= damage;
        enemyCreature.setHealth(hp);
    }

    /**
     * Check if the enemy creature can be caught based on its remaining health and a catch rate.
     *
     * @return true if the creature can be caught, false otherwise.
     */
    private boolean isCatched() {
        double catchRate = (40.0 + 50 - enemyCreature.getHealth()) / 100;
        double randomNumber = new java.util.Random().nextDouble();

        if (randomNumber <= catchRate) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Execute a battle phase where the player can choose actions and interact with the enemy creature.
     * This method allows the player to attack, swap creatures, catch the enemy creature, or flee.
     */
    public void battlePhase() {
        Scanner sc = new Scanner(System.in);
        enemyCreature.setHealth(50);

        for (int i = 0; i < 3; i++) {
            System.out.println(enemyCreature.getName() + ": " + enemyCreature.getHealth() + "hp");
            System.out.println("1. ATTACK,  2. SWAP,    3. CATCH,   4. FLEE");
            System.out.print("Choice: ");

            // Check if the input is an integer
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        attack();
                        break;
                    case 2:
                        System.out.println("This is your inventory.");
                        inventory.showCreature();
                        System.out.print("\nEnter the index of the creature to set as active (or -1 to go back): ");
                        int index = sc.nextInt();
                        if (index == -1) {
                            // Go back to the main menu
                        } else {
                            inventory.setActive(inventory.getCreature(index));
                        }
                        break;
                    case 3:
                        if (isCatched()) {
                            System.out.println(enemyCreature.getName() + " has been caught!");
                            enemyCreature.setHealth(50);
                            inventory.addCreature(enemyCreature);
                        } else {
                            System.out.println(enemyCreature.getName() + " failed to be caught");
                        }
                        break;
                    case 4:
                        i = 4;
                        System.out.println("You fled from battle.");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        i -= 1;
                }
            } else {
                // Handle non-integer input
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Consume the invalid input
                i -= 1;
            }
        }

        System.out.println("\n-------------------------");
        System.out.println("BATTLE ENDED");
        System.out.println("-------------------------\n");
    }
}


