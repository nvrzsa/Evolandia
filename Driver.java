import java.util.Scanner;

public class Driver {
    public static void main (String args[]){
        Inventory inventory = new Inventory();
        Scanner sc = new Scanner(System.in);
        Scanner pause = new Scanner(System.in);
        boolean check = false;
        boolean game = true;
        boolean inMap = true;
        Creatures creature1 = null;
        Creatures enemy = null;

        Area area1 = new Area(5, 1);
        Area area2 = new Area(3, 3);
        Area area3 = new Area(4, 4);

        // create the starter creatures array
        Creatures[] EL1 = {
            new Creatures(1, "Strawander", "fire", "A"),
            new Creatures(1, "Chocowool", "fire", "B"),
            new Creatures(1, "Parfwit", "fire", "C"),
            new Creatures(1, "Brownisaur", "grass", "D"),
            new Creatures(1, "Frubat", "grass", "E"),
            new Creatures(1, "Malts", "grass", "F"),
            new Creatures(1, "Squirpie", "water", "G"),
            new Creatures(1, "Chocolite", "water", "H"),
            new Creatures(1, "Oshacone", "water", "I")
        };

        Creatures[] EL2 = {
            new Creatures(2, "Strawleon", "fire", "A"),
            new Creatures(2, "Chocofluff", "fire", "B"),
            new Creatures(2, "Parfure", "fire", "C"),
            new Creatures(2, "Chocosaur", "grass", "D"),
            new Creatures(2, "Golberry", "grass", "E"),
            new Creatures(2, "Kirlicake", "grass", "F"),
            new Creatures(2, "Tartortle", "water", "G"),
            new Creatures(2, "Chocolish", "water", "H"),
            new Creatures(2, "Dewice", "water", "I")
        };

        Creatures[] EL3 = {
            new Creatures(3, "Strawizard", "fire", "A"),
            new Creatures(3, "Candaros", "fire", "B"),
            new Creatures(3, "Parfelure", "fire", "C"),
            new Creatures(3, "Fudgasaur", "grass", "D"),
            new Creatures(3, "Croberry", "grass", "E"),
            new Creatures(3, "Velvevoir", "grass", "F"),
            new Creatures(3, "Piestoise", "water", "G"),
            new Creatures(3, "Icesundae", "water", "H"),
            new Creatures(3, "Samurcone", "water", "I")
        };

        while(check == false){
            System.out.println("\nWelcome to Evolandia!\n");
            System.out.println("Select your starter: \n");
            for(int i = 0; i < EL1.length; i++){
                System.out.println(i+1 + ", " + EL1[i].getName() + ", " + EL1[i].getType());
            }

            System.out.print("\nChoice: ");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= EL1.length){
                creature1 = EL1[choice - 1];
                inventory.addCreature(creature1);
                System.out.println(creature1.getName() + " has been selected");
                check = true;
            }
            else {
                System.out.println("Invalid choice, please select again \n");
            }
        }

        pause.nextLine();
        System.out.print("\033c");

        while(game == true){
            System.out.println("------------------------------------------------------------------------");
            System.out.println("MENU: ");
            System.out.println("1. VIEW INVENTORY   2. EXPLORE AN AREA  3. EVOLVE CREATURE  4. EXIT");
            System.out.println("------------------------------------------------------------------------\n");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            System.out.print("\033c");

            switch (choice){
                case 1:
                    System.out.println("This is your inventory.");
                    inventory.showCreature();
                    System.out.print("\nEnter the index of the creature to set as active (or -1 to go back): ");
                    int index = sc.nextInt();

                    if (index == -1) {
                        // Go back to the main menu
                    } else {
                        inventory.swap(index);
                    }
                break;

                case 2:
                    inMap = true;
                    while(inMap == true){ 
                        double randomNumber = new java.util.Random().nextDouble();
                        System.out.println(randomNumber);
                        area1.displayArea();
                        System.out.println("Where do you want to move: \nUP, DOWN, LEFT, RIGHT, or go back to MENU");
                        System.out.print("Choice: ");
                        String movement = "";

                        // Check if there is a next string available before reading
                        if (sc.hasNext()) {
                            movement = sc.next();
                        } else {
                            System.out.println("No input found.");
                        }

                        area1.move(movement);

                        if(movement.equals("MENU")){
                            inMap = false;
                        }

                        if(randomNumber <= 0.4){
                            int enemyCreature = new java.util.Random().nextInt(9);
                            enemy = EL1[enemyCreature];
                            Battle battle = new Battle(creature1, enemy, inventory);
                            battle.battlePhase();
                        }

                        // Check if there's more input before reading the next line
                        if (pause.hasNextLine()) {
                            pause.nextLine();
                        }

                        System.out.print("\033c");
                    }
                break;

                case 3:
                    System.out.println("Select two creatures for evolution:");
                    inventory.showCreature(); // Display creatures for selection

                    System.out.print("Enter the index of the first creature: ");
                    int index1 = sc.nextInt();
                    System.out.print("Enter the index of the second creature: ");
                    int index2 = sc.nextInt();

                    Creatures creature1ForEvolution = inventory.getCreature(index1);
                    Creatures creature2ForEvolution = inventory.getCreature(index2);

                    if (creature1ForEvolution != null && creature2ForEvolution != null) {
                        if (Creatures.isEligibleForEvolution(creature1ForEvolution, creature2ForEvolution)) {
                            Creatures evolvedCreature = Creatures.evolveCreatures(creature1ForEvolution, creature2ForEvolution);
                            if (evolvedCreature != null) {
                            // Evolution successful, add evolved creature to inventory and remove the original creatures
                            inventory.addCreature(evolvedCreature);
                            inventory.removeCreature(creature1ForEvolution);
                            inventory.removeCreature(creature2ForEvolution);
                            System.out.println("Evolution successful! " + evolvedCreature.getName() + " added to inventory.");
                        } else {
                            System.out.println("Evolution failed.");
                        }
                    } else {
                        System.out.println("Selected creatures are not eligible for evolution.");
                    }
                } else {
                    System.out.println("Invalid creature selection.");
                }
                break;

                case 4:
                    System.out.println("Thank you for playing the game!");
                    game = false;
                break;
                
                default:
                    System.out.println("Invalid selection");
            }
        }
        sc.close(); // Close the primary scanner
        pause.close(); // Close the 'pause' scanner
    }
}