import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.List;

public class EvolandiaView {
    private int choice = 0;
    
    private JPanel area1Panel, area2Panel, area3Panel;
    private JFrame window;
    private Container con;
    private JPanel titlePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, menuPanel, menuChoicePanel, inventoryPanel;
    private JLabel titleNameLabel, menuLabel;
    private Font titleFont = new Font("Times New Roman", Font.PLAIN, 100);
    private Font startFont = new Font ("Times New Roman", Font.PLAIN, 30);
    private JButton startButton, choice1, choice2, choice3, choice4, choice5, choice6, choice7, choice8, choice9, viewInventoryButton, exploreAreaButton, evolveButton, exitButton;
    private JTextArea mainTextArea, inventoryTextArea;

    private ImageIcon strawanderJPG = new ImageIcon("sprites\\Strawander.jpg");
    private ImageIcon chocowoolJPG = new ImageIcon("sprites\\Chocowool.jpg");
    private ImageIcon parfwitJPG = new ImageIcon("sprites\\Parfwit.jpg");
    private ImageIcon brownisaurJPG = new ImageIcon("sprites\\Brownisaur.jpg");
    private ImageIcon frubatJPG = new ImageIcon("sprites\\Frubat.jpg");
    private ImageIcon maltsJPG = new ImageIcon("sprites\\Malts.jpg");
    private ImageIcon squirpieJPG = new ImageIcon("sprites\\Squirpie.jpg");
    private ImageIcon chocoliteJPG = new ImageIcon("sprites\\Chocolite.jpg");
    private ImageIcon oshaconeJPG = new ImageIcon("sprites\\Oshacone.jpg");

    public EvolandiaView (){
        
        // mainframe
        this.window = new JFrame("EVOLANDIA");
        this.window.setSize(800, 600);
        this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.window.getContentPane().setBackground(Color.pink);
        this.window.setLayout(null);
        this.con = window.getContentPane();

        // title Panel
        this.titlePanel = new JPanel();
        this.titlePanel.setBounds(100, 100, 600, 150);
        this.titlePanel.setBackground(Color.pink);
        this.titleNameLabel = new JLabel("EVOLANDIA");
        this.titleNameLabel.setForeground(Color.black);
        this.titleNameLabel.setFont(titleFont);

        // start Button Panel
        this.startButtonPanel = new JPanel();
        this.startButtonPanel.setBounds(300, 350, 200, 100);
        this.startButtonPanel.setBackground(Color.pink);

        // button in start Button Panel
        this.startButton = new JButton("START");
        this.startButton.setBackground(Color.black);
        this.startButton.setForeground(Color.pink);
        this.startButton.setFont(startFont);
        this.startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                selectStarterScreen();
            }
        });

        this.titlePanel.add(titleNameLabel);
        this.startButtonPanel.add(startButton);
        this.con.add(titlePanel);
        this.con.add(startButtonPanel);

        this.window.setVisible(true);

        //initialization

        this.choice1 = new JButton("Strawander");
        this.choice1.setForeground(Color.red);
        this.choice1.setIcon(strawanderJPG);
        this.choice1.setFont(startFont);

        this.choice2 = new JButton("Chocowool");
        this.choice2.setForeground(Color.red);
        this.choice2.setIcon(chocowoolJPG);
        this.choice2.setFont(startFont);

        this.choice3 = new JButton("Parfwit");
        this.choice3.setForeground(Color.red);
        this.choice3.setIcon(parfwitJPG);
        this.choice3.setFont(startFont);

        this.choice4 = new JButton("Brownisaur");
        this.choice4.setForeground(Color.green);
        this.choice4.setIcon(brownisaurJPG);
        this.choice4.setFont(startFont);

        this.choice5 = new JButton("Frubat");
        this.choice5.setForeground(Color.green);
        this.choice5.setIcon(frubatJPG);
        this.choice5.setFont(startFont);

        this.choice6 = new JButton("Malts");
        this.choice6.setForeground(Color.green);
        this.choice6.setIcon(maltsJPG);
        this.choice6.setFont(startFont);

        this.choice7 = new JButton("Squirpie");
        this.choice7.setForeground(Color.blue);
        this.choice7.setIcon(squirpieJPG);
        this.choice7.setFont(startFont);

        this.choice8 = new JButton("Chocolite");
        this.choice8.setForeground(Color.blue);
        this.choice8.setIcon(chocoliteJPG);
        this.choice8.setFont(startFont);

        this.choice9 = new JButton("Oshacone");
        this.choice9.setForeground(Color.blue);
        this.choice9.setIcon(oshaconeJPG);
        this.choice9.setFont(startFont);

        this.viewInventoryButton = new JButton("VIEW INVENTORY");
        this.viewInventoryButton.setFont(startFont);
        this.viewInventoryButton.setBackground(Color.black);
        this.viewInventoryButton.setForeground(Color.pink);

        // Initialize area panels with placeholders
        area1Panel = createAreaPanel(5, 1);
        area2Panel = createAreaPanel(3, 3);
        area3Panel = createAreaPanel(4, 4);
    }

    public void selectStarterScreen(){

        this.titlePanel.setVisible(false);
        this.startButtonPanel.setVisible(false);

        // main Text Panel
        this.mainTextPanel = new JPanel();
        this.mainTextPanel.setBounds(10, 10, 600, 140);
        this.mainTextPanel.setBackground(Color.pink);
        this.con.add(mainTextPanel);

        this.mainTextArea = new JTextArea("Welcome to EVOLANDIA \nSelect your starter (red = fire, green = grass, blue = water)");
        this.mainTextArea.setBounds(100, 100, 600, 140);
        this.mainTextArea.setBackground(Color.BLACK);
        this.mainTextArea.setForeground(Color.pink);
        this.mainTextArea.setFont(startFont);
        this.mainTextArea.setLineWrap(true);
        this.mainTextPanel.add(mainTextArea);

        // choice button Panel
        this.choiceButtonPanel = new JPanel();
        this.choiceButtonPanel.setBounds(10, 150, 700, 300);
        this.choiceButtonPanel.setBackground(Color.black);
        this.con.add(choiceButtonPanel);

        this.choiceButtonPanel.add(choice1);
        this.choiceButtonPanel.add(choice2);
        this.choiceButtonPanel.add(choice3);
        this.choiceButtonPanel.add(choice4);
        this.choiceButtonPanel.add(choice5);
        this.choiceButtonPanel.add(choice6);
        this.choiceButtonPanel.add(choice7);
        this.choiceButtonPanel.add(choice8);
        this.choiceButtonPanel.add(choice9);

    }

    public void menuScreen() {
        this.mainTextPanel.setVisible(false);
        this.choiceButtonPanel.setVisible(false);

        this.menuPanel = new JPanel();
        this.menuPanel.setBounds(100, 100, 600, 150);
        this.menuPanel.setBackground(Color.black);

        this.menuLabel = new JLabel("MENU");
        this.menuLabel.setForeground(Color.pink);
        this.menuLabel.setFont(titleFont);
        this.menuPanel.add(menuLabel);

        this.menuChoicePanel = new JPanel();
        this.menuChoicePanel.setBounds(190, 350, 400, 150);
        this.menuChoicePanel.setBackground(Color.pink);
        this.menuChoicePanel.setLayout(new GridLayout(4, 1));

        this.menuChoicePanel.add(viewInventoryButton);

        this.exploreAreaButton = new JButton("EXPLORE AN AREA");
        this.exploreAreaButton.setFont(startFont);
        this.exploreAreaButton.setBackground(Color.black);
        this.exploreAreaButton.setForeground(Color.pink);
        this.menuChoicePanel.add(exploreAreaButton);

        this.evolveButton = new JButton("EVOLVE CREATURE");
        this.evolveButton.setBackground(Color.black);
        this.evolveButton.setForeground(Color.pink);
        this.evolveButton.setFont(startFont);
        this.menuChoicePanel.add(evolveButton);

        this.exitButton = new JButton("EXIT GAME");
        this.exitButton.setFont(startFont);
        this.exitButton.setBackground(Color.black);
        this.exitButton.setForeground(Color.pink);
        this.menuChoicePanel.add(exitButton);
        this.exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent arg0){
                System.exit(0);
            }
        });

        this.con.add(menuChoicePanel);
        this.con.add(menuPanel);

    }

    private JPanel createAreaPanel(int width, int height) {
        JPanel areaPanel = new JPanel();
        areaPanel.setLayout(new GridLayout(height, width));

        // Customize the appearance of the area panel based on width and height
        for (int i = 0; i < width * height; i++) {
            // Create and add components (placeholders or visuals) to the area panel
            JLabel placeholder = new JLabel("Area " + (i + 1)); // Replace this with appropriate visuals
            placeholder.setHorizontalAlignment(JLabel.CENTER);
            placeholder.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Example border

            areaPanel.add(placeholder);
        }

        return areaPanel;
    }

    public void viewInventory(List<Creatures> creatures){
        this.menuPanel.setVisible(false);
        this.menuChoicePanel.setVisible(false);

        this.inventoryPanel = new JPanel();
        this.inventoryPanel.setBounds(100, 100, 600, 400);
        this.inventoryPanel.setBackground(Color.black);

        this.inventoryTextArea = new JTextArea("Inventory:\n");

        for (Creatures creature : creatures) {
            inventoryTextArea.append("Name: " + creature.getName() + " Type: " + creature.getType() + " \nFamily: " + creature.getFamily() + " EL: " + creature.getEvol() + "\n");
        }

        this.inventoryTextArea.setBounds(100, 100, 400, 200);
        this.inventoryTextArea.setBackground(Color.BLACK);
        this.inventoryTextArea.setForeground(Color.pink);
        this.inventoryTextArea.setFont(startFont);
        this.inventoryTextArea.setLineWrap(true);
        this.inventoryTextArea.setLineWrap(true);

        JScrollPane scrollPane = new JScrollPane(inventoryTextArea);
        scrollPane.setBounds(100, 100, 400, 200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        this.inventoryPanel.add(inventoryTextArea);
        this.con.add(inventoryPanel);
    }

    public void exploreArea(){

    }

    public void setChoice1(ActionListener actionListener){
        this.choice1.addActionListener(actionListener);
    }

    public void setChoice2(ActionListener actionListener){
        this.choice2.addActionListener(actionListener);
    }

    public void setChoice3(ActionListener actionListener){
        this.choice3.addActionListener(actionListener);
    }

    public void setChoice4(ActionListener actionListener){
        this.choice4.addActionListener(actionListener);
    }

    public void setChoice5(ActionListener actionListener){
        this.choice5.addActionListener(actionListener);
    }

    public void setChoice6(ActionListener actionListener){
        this.choice6.addActionListener(actionListener);
    }

    public void setChoice7(ActionListener actionListener){
        this.choice7.addActionListener(actionListener);
    }

    public void setChoice8(ActionListener actionListener){
        this.choice8.addActionListener(actionListener);
    }

    public void setChoice9(ActionListener actionListener){
        this.choice9.addActionListener(actionListener);
    }

    public void inventoryButton(ActionListener actionListener){
        this.viewInventoryButton.addActionListener(actionListener);
    }

}