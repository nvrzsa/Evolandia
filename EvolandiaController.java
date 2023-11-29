import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class EvolandiaController {
    private EvolandiaView evolandiaView;
    private EvolandiaModel evolandiaModel;

    public EvolandiaController(EvolandiaView evolandiaView, EvolandiaModel evolandiaModel){
        this.evolandiaView = evolandiaView;
        this.evolandiaModel = evolandiaModel;

        this.evolandiaView.setChoice1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                evolandiaView.menuScreen();
                int choice = 0;
                Creatures creature1 = evolandiaModel.getEvo1Index(choice);
                boolean result = evolandiaModel.creatureAdd(creature1);
        
                if (result) {
                    System.out.println(creature1.getName() + " has been added");
                } else {
                    System.out.println("Failed to add " + creature1.getName());
                }
            }
        });
        

        this.evolandiaView.setChoice2(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                evolandiaView.menuScreen();
                int choice = 1;
                Creatures creature1 = evolandiaModel.getEvo1Index(choice);
                boolean result = evolandiaModel.creatureAdd(creature1);

                if(result){
                    System.out.println(creature1.getName() + " has been added");
                }
                else {
                    System.out.println("failed");
                }

            } 
        });

        this.evolandiaView.setChoice3(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                evolandiaView.menuScreen();
                int choice = 2;
                Creatures creature1 = evolandiaModel.getEvo1Index(choice);
                boolean result = evolandiaModel.creatureAdd(creature1);

                if(result){
                    System.out.println(creature1.getName() + " has been added");
                }
                else {
                    System.out.println("failed");
                }

            } 
        });

        this.evolandiaView.setChoice4(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                evolandiaView.menuScreen();
                int choice = 3;
                Creatures creature1 = evolandiaModel.getEvo1Index(choice);
                boolean result = evolandiaModel.creatureAdd(creature1);

                if(result){
                    System.out.println(creature1.getName() + " has been added");
                }
                else {
                    System.out.println("failed");
                }

            } 
        });

        this.evolandiaView.setChoice5(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                evolandiaView.menuScreen();
                int choice = 4;
                Creatures creature1 = evolandiaModel.getEvo1Index(choice);
                boolean result = evolandiaModel.creatureAdd(creature1);

                if(result){
                    System.out.println(creature1.getName() + " has been added");
                }
                else {
                    System.out.println("failed");
                }

            } 
        });

        this.evolandiaView.setChoice6(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                evolandiaView.menuScreen();
                int choice = 5;
                Creatures creature1 = evolandiaModel.getEvo1Index(choice);
                boolean result = evolandiaModel.creatureAdd(creature1);

                if(result){
                    System.out.println(creature1.getName() + " has been added");
                }
                else {
                    System.out.println("failed");
                }

            } 
        });

        this.evolandiaView.setChoice7(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                evolandiaView.menuScreen();
                int choice = 6;
                Creatures creature1 = evolandiaModel.getEvo1Index(choice);
                boolean result = evolandiaModel.creatureAdd(creature1);

                if(result){
                    System.out.println(creature1.getName() + " has been added");
                }
                else {
                    System.out.println("failed");
                }

            } 
        });

        this.evolandiaView.setChoice8(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                evolandiaView.menuScreen();
                int choice = 7;
                Creatures creature1 = evolandiaModel.getEvo1Index(choice);
                boolean result = evolandiaModel.creatureAdd(creature1);

                if(result){
                    System.out.println(creature1.getName() + " has been added");
                }
                else {
                    System.out.println("failed");
                }

            } 
        });

        this.evolandiaView.setChoice9(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                evolandiaView.menuScreen();
                int choice = 8;
                Creatures creature1 = evolandiaModel.getEvo1Index(choice);
                boolean result = evolandiaModel.creatureAdd(creature1);

                if(result){
                    System.out.println(creature1.getName() + " has been added");
                }
                else {
                    System.out.println("failed");
                }

            } 
        });

        this.evolandiaView.inventoryButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                List<Creatures> inventoryCreatures = evolandiaModel.inventory.getCreatureList();
                evolandiaView.viewInventory(inventoryCreatures);
            }
        });

        this.evolandiaView.exploreButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                evolandiaView.exploreArea();
            }
        });

        evolandiaView.setEvolveButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the selected creatures from the view
                Creatures selectedCreature1 = evolandiaView.getSelectedCreature1();
                Creatures selectedCreature2 = evolandiaView.getSelectedCreature2();
        
                boolean evolutionSuccess = evolandiaModel.evolveCreatures(selectedCreature1, selectedCreature2);
                
                if (evolutionSuccess) {
                    // Evolution successful
                    evolandiaView.displayEvolutionSuccess();
                } else {
                    // Evolution failed
                    evolandiaView.displayEvolutionFailure();
                }
            }
        });

        evolandiaView.upButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println("up");
                evolandiaView.movePlayer(-1, 0);
                
            }
        });

        evolandiaView.downButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                evolandiaView.movePlayer(1, 0);
            }
        });

        evolandiaView.leftButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                evolandiaView.movePlayer(0, -1);
            }
        });

        evolandiaView.rightButton(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                evolandiaView.movePlayer(0, 1);
            }
        });

    }

    
}
