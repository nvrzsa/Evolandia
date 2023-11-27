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
}