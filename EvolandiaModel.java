import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EvolandiaModel {
    Inventory inventory;
    boolean check;
    boolean game;
    boolean inMap;
    Creatures creature1;
    Creatures enemy;
    Area area1;
    Area area2;
    Area area3;
    Creatures[] evoLvl1, evoLvl2, evoLvl3;

        public EvolandiaModel(){
            this.inventory = new Inventory();
            this.check = false;
            this.game = true;
            this.inMap = true;
            this.creature1 = null;
            this.enemy = null;
            this.area1 = new Area(5, 1);
            this.area2 = new Area(3, 3);
            this.area3 = new Area(4, 4);
            this.evoLvl1 = evoLvl1Creatures();
            this.evoLvl2 = evoLvl2Creatures();
            this.evoLvl3 = evoLvl3Creatures();
        }

        private Creatures[] evoLvl1Creatures() {
            return new Creatures[]{
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
        }

        private Creatures[] evoLvl2Creatures(){
            return new Creatures[]{
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
        }

        private Creatures[] evoLvl3Creatures(){
            return new Creatures[]{
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
        }

        public List<Creatures> getInventoryCreatures() {
            return this.inventory.getCreatureList();
        }

        public Creatures getEvo1Index(int index){
            return evoLvl1[index];
        }

        public Creatures getEvo2Index(int index){
            return evoLvl2[index];
        }

        public Creatures getEvo3Index(int index){
            return evoLvl3[index];
        }

        public boolean creatureAdd(Creatures creature){
            boolean result = false;
            try{
                this.inventory.addCreature(creature);
                result = true;
            }
            catch(Exception e){
                System.out.println("Error: " + e);
            }
            return result;
        }

        public boolean evolveCreatures(Creatures creature1, Creatures creature2) {
            if (canEvolve(creature1, creature2)) {
                if (evolutionSuccess(creature1, creature2)) {
                    Creatures evolvedCreature = createEvolvedCreature(creature1, creature2);
                    if (evolvedCreature != null) {
                        // Remove the selected creatures from the inventory
                        inventory.removeCreature(creature1);
                        inventory.removeCreature(creature2);
                        // Add the evolved creature to the inventory
                        inventory.addCreature(evolvedCreature);
                        return true; // Evolution successful
                    }
                }
            }
            return false; // Evolution failed
        }

        private boolean canEvolve(Creatures creature1, Creatures creature2) {
            // Check if the creatures belong to the same family and EL, and not EL3
            return creature1.getFamily().equals(creature2.getFamily()) &&
                   creature1.getEvol() == creature2.getEvol() &&
                   creature1.getEvol() != 3;
        }

        private boolean evolutionSuccess(Creatures creature1, Creatures creature2) {
            // Example logic for determining evolution success based on types and levels
            boolean success = false;
        
            // Check if creatures are of the same type and at a compatible evolution level
            if (creature1.getType().equals(creature2.getType()) && creature1.getEvol() == creature2.getEvol()) {
                // Logic for successful evolution (Example: Fire creatures evolve at level 1, Grass at level 2, Water at level 3)
                if (creature1.getType().equals("fire") && creature1.getEvol() == 1) {
                    success = true;
                } else if (creature1.getType().equals("grass") && creature1.getEvol() == 2) {
                    success = true;
                } else if (creature1.getType().equals("water") && creature1.getEvol() == 3) {
                    success = true;
                }
                // Add more conditions as needed based on your game's evolution rules
            }
        
            return success;
        }
        

        private Creatures createEvolvedCreature(Creatures creature1, Creatures creature2) {
            // Assuming the evolution is successful based on your logic
            // Create a new creature with the same family, next EL, and appropriate type

            // Get the family of the evolved creature
            String family = creature1.getFamily();

            // Determine the next evolution level (EL) for the evolved creature
            int nextEL = creature1.getEvol() + 1;

            // Determine the type of the evolved creature (assuming it remains the same as the parents)
            String type = creature1.getType();

            // Create a new creature with the evolved characteristics
            Creatures evolvedCreature = new Creatures(nextEL, "Evolved " + family, type, family);

            return evolvedCreature;
        }

}