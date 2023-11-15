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

        // create the starter creatures array
        Creatures[] starter = {
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

        while(check == false){
            System.out.println("\nWelcome to Evolandia!\n");
            System.out.println("Select your starter: \n");
            for(int i = 0; i < starter.length; i++){
                System.out.println(i+1 + ", " + starter[i].getName() + ", " + starter[i].getType());
            }

            System.out.print("\nChoice: ");
            int choice = sc.nextInt();
            if (choice >= 1 && choice <= starter.length){
                creature1 = starter[choice - 1];
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
                        System.out.println("where do you want to move: \nUP, DOWN, LEFT, RIGHT, or go back to MENU");
                        System.out.print("Choice: ");
                        String movement = sc.next();
                        area1.move(movement);

                        if(movement.equals("MENU")){
                            inMap = false;
                        }

                        if(randomNumber <= 0.4){
                            int enemyCreature = new java.util.Random().nextInt(9);
                            enemy = starter[enemyCreature];
                            Battle battle = new Battle(creature1, enemy, inventory);
                            battle.battlePhase();
                        }
                        pause.nextLine();
                        System.out.print("\033c");
                    }
                    break;
                case 3:
                    System.out.println("WIP Feature");
                    break;
                case 4:
                    System.out.println("Thank you for playing the game!");
                    game = false;
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        }
        sc.close();
    }
}

