import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EvolandiaView {
    private JFrame window;
    private Container con;
    private JPanel titlePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, menuPanel;
    private JLabel titleNameLabel;
    private Font titleFont = new Font("Times New Roman", Font.PLAIN, 100);
    private Font startFont = new Font ("Times New Roman", Font.PLAIN, 30);
    private JButton startButton, choice1, choice2, choice3, choice4, choice5, choice6, choice7, choice8, choice9;
    private JTextArea mainTextArea;

    private ImageIcon strawanderJPG = new ImageIcon("sprites\\Strawander.jpg");
    private ImageIcon chocowoolJPG = new ImageIcon("sprites\\chocowool.jpg");
    private ImageIcon parfwitJPG = new ImageIcon("sprites\\parfwit.jpg");
    private ImageIcon brownisaurJPG = new ImageIcon("sprites\\brownisaur.jpg");
    private ImageIcon frubatJPG = new ImageIcon("sprites\\frubat.jpg");
    private ImageIcon maltsJPG = new ImageIcon("sprites\\malts.jpg");
    private ImageIcon squirpieJPG = new ImageIcon("sprites\\squirpie.jpg");
    private ImageIcon chocoliteJPG = new ImageIcon("sprites\\chocolite.jpg");
    private ImageIcon oshaconeJPG = new ImageIcon("sprites\\oshacone.jpg");


    public static void main(String[] args) {
        
        new EvolandiaView();
    }

    public EvolandiaView (){
        // mainframe
        window = new JFrame("EVOLANDIA");
        window.setSize(800, 600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.pink);
        window.setLayout(null);
        con = window.getContentPane();

        // title Panel
        titlePanel = new JPanel();
        titlePanel.setBounds(100, 100, 600, 150);
        titlePanel.setBackground(Color.pink);
        titleNameLabel = new JLabel("EVOLANDIA");
        titleNameLabel.setForeground(Color.black);
        titleNameLabel.setFont(titleFont);

        // start Button Panel
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300, 350, 200, 100);
        startButtonPanel.setBackground(Color.pink);

        // button in start Button Panel
        startButton = new JButton("START");
        startButton.setBackground(Color.black);
        startButton.setForeground(Color.pink);
        startButton.setFont(startFont);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                selectStarterScreen();
            }
        });

        

        titlePanel.add(titleNameLabel);
        startButtonPanel.add(startButton);
        con.add(titlePanel);
        con.add(startButtonPanel);

        window.setVisible(true);
    }

    public void selectStarterScreen(){

        titlePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        // main Text Panel
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(10, 10, 600, 140);
        mainTextPanel.setBackground(Color.pink);
        con.add(mainTextPanel);

        mainTextArea = new JTextArea("Welcome to EVOLANDIA \nSelect your starter (red = fire, green = grass, blue = water)");
        mainTextArea.setBounds(100, 100, 600, 140);
        mainTextArea.setBackground(Color.BLACK);
        mainTextArea.setForeground(Color.pink);
        mainTextArea.setFont(startFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);

        // choice button Panel
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(10, 150, 700, 300);
        choiceButtonPanel.setBackground(Color.black);
        con.add(choiceButtonPanel);

        choice1 = new JButton("Strawander");
        choice1.setForeground(Color.red);
        choice1.setIcon(strawanderJPG);
        choice1.setFont(startFont);
        choice1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                menuScreen();
            } 
        });
        choiceButtonPanel.add(choice1);
 
        choice2 = new JButton("Chocowool");
        choice2.setForeground(Color.red);
        choice2.setIcon(chocowoolJPG);
        choice2.setFont(startFont);
        choice2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                menuScreen();
            } 
        });
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("Parfwit");
        choice3.setForeground(Color.red);
        choice3.setIcon(parfwitJPG);
        choice3.setFont(startFont);
        choice3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                menuScreen();
            } 
        });
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("Brownisaur");
        choice4.setForeground(Color.green);
        choice4.setIcon(brownisaurJPG);
        choice4.setFont(startFont);
        choice4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                menuScreen();
            } 
        });
        choiceButtonPanel.add(choice4);

        choice5 = new JButton("Frubat");
        choice5.setForeground(Color.green);
        choice5.setIcon(frubatJPG);
        choice5.setFont(startFont);
        choice5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                menuScreen();
            } 
        });
        choiceButtonPanel.add(choice5);

        choice6 = new JButton("Malts");
        choice6.setForeground(Color.green);
        choice6.setIcon(maltsJPG);
        choice6.setFont(startFont);
        choice6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                menuScreen();
            } 
        });
        choiceButtonPanel.add(choice6);

        choice7 = new JButton("Squirpie");
        choice7.setForeground(Color.blue);
        choice7.setIcon(squirpieJPG);
        choice7.setFont(startFont);
        choice7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                menuScreen();
            } 
        });
        choiceButtonPanel.add(choice7);

        choice8 = new JButton("Chocolite");
        choice8.setForeground(Color.blue);
        choice8.setIcon(chocoliteJPG);
        choice8.setFont(startFont);
        choice8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                menuScreen();
            } 
        });
        choiceButtonPanel.add(choice8);

        choice9 = new JButton("Oshacone");
        choice9.setForeground(Color.blue);
        choice9.setIcon(oshaconeJPG);
        choice9.setFont(startFont);
        choice9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0){
                menuScreen();
            } 
        });
        choiceButtonPanel.add(choice9);

    }

    public void menuScreen() {
        mainTextPanel.setVisible(false);
        choiceButtonPanel.setVisible(false);

        menuPanel = new JPanel();
        menuPanel.setBounds(100, 100, 600, 150);
        menuPanel.setBackground(Color.black);
        con.add(menuPanel);
    }
}