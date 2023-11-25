import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EvolandiaView {

    private JFrame mainframe;

    private JPanel startOfGame = new JPanel();
    private JPanel panelCont = new JPanel();

    private CardLayout cl = new CardLayout();

    
    
    public EvolandiaView(){
        
        this.mainframe = new JFrame("Vending Machine Factory Simulator");
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainframe.setPreferredSize(new Dimension(1000, 300));

        startOfGame.setLayout(new GridLayout(11, 1, 10, 10));

        JLabel label = new JLabel("Welcome to Evolandia");
        JLabel label1 = new JLabel("Choose your starter:");
        JButton buttonA = new JButton(" Strawander ");
        JButton buttonB = new JButton(" Chocowool ");
        JButton buttonC = new JButton(" Parfwit ");
        JButton buttonD =   new JButton(" Brownisaur ");
        JButton buttonE =   new JButton(" Frubat ");
        JButton buttonF =   new JButton(" Malts ");
        JButton buttonG =   new JButton(" Squirpie ");
        JButton buttonH =   new JButton(" Chocolite ");
        JButton buttonI =   new JButton(" Oshacone ");

        startOfGame.add(label);
        startOfGame.add(label1);
        startOfGame.add(buttonA);
        startOfGame.add(buttonB);
        startOfGame.add(buttonC);
        startOfGame.add(buttonD);
        startOfGame.add(buttonE);
        startOfGame.add(buttonF);
        startOfGame.add(buttonG);
        startOfGame.add(buttonH);
        startOfGame.add(buttonI);

        panelCont.setLayout(cl);
        panelCont.add(startOfGame, "1");
        cl.show(panelCont, "1");

        mainframe.add(panelCont);
        mainframe.pack();
        mainframe.setLocationRelativeTo(null);
        mainframe.setVisible(true);
    } 


    // for testing purposes only
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new EvolandiaView();
            }
        });
    }
}
