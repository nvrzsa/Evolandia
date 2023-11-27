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
                //evolandiaView.menuScreen();
                int choice = 1;
                Creatures creature1 = evolandiaModel.getEvo1Index(choice);
                boolean result = evolandiaModel.creatureAdd(creature1);

                if(result){
                    System.out.println("success");
                }
                else {
                    System.out.println("failed");
                }

            } 
        });
    }
    
}
