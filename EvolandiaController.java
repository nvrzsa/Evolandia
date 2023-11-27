import java.awt.*;
import java.awt.event.*;

public class EvolandiaController {
    private EvolandiaView evolandiaView;
    private EvolandiaModel evolandiaModel;

    public EvolandiaController(EvolandiaView evolandiaView, EvolandiaModel evolandiaModel){
        this.evolandiaView = evolandiaView;
        this.evolandiaModel = evolandiaModel;

        this.evolandiaView.setChoice1(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                evolandiaView.menuScreen();
                int choice = 0;
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

    }
    
}
