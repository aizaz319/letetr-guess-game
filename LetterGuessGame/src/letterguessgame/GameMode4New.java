
package letterguessgame;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;


public class GameMode4New extends JFrame implements ActionListener {
    int attemptsLeft = 5;
    JLabel topLabel = new JLabel("Guess the word by typing a letter – You are playing 4 word guess mode",JLabel.CENTER);
    JLabel centerLabel = new JLabel("",JLabel.CENTER);
    JLabel bottomLabel = new JLabel("Enter a letter Please:",JLabel.CENTER);
//    JLabel leftLabel = new JLabel("East Panel:");
//    JLabel rightLabel = new JLabel("West Panel:");
    
    JButton [] myButtons;
    JButton [] myButtons1;
    
    JTextField guessTextField = new JTextField(1);
    
    JButton revealBtn = new JButton("Reveal");
    JButton clearBtn = new JButton("Clear");
    JButton goBackBtn = new JButton("Go Back to Main Menu");
    JLabel attemptsLeftLabel = new JLabel("You have "+ attemptsLeft +" attempts left", JLabel.CENTER);
    
    
    
    JPanel northPanel = new JPanel();
    JPanel centerPanel = new JPanel();
    JPanel southPanel = new JPanel();
    JPanel eastPanel = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel attemptsPanel = new JPanel();
    public GameMode4New(){
        setTitle("Letter Guess Game");
        setSize(900,500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        
        topLabel.setFont(new Font("Verdana", Font.BOLD,24));
        topLabel.setForeground(Color.WHITE);
        centerLabel.setFont(new Font("Verdana", Font.BOLD,25));
        bottomLabel.setFont(new Font("Verdana", Font.BOLD,20));
        
        guessTextField.setForeground(Color.red);
        guessTextField.setFont(new Font("Verdana", Font.BOLD,20));
//        leftLabel.setFont(new Font("Verdana", Font.BOLD,20));
//        rightLabel.setFont(new Font("Verdana", Font.BOLD,20));
          southPanel.setLocation(150, 150);
        
        northPanel.add(topLabel);
        northPanel.setBackground(Color.BLUE);
        southPanel.add(bottomLabel);
        southPanel.add(guessTextField);
        southPanel.add(revealBtn);
        southPanel.add(clearBtn);
        centerPanel.add(centerLabel);
        southPanel.add(attemptsLeftLabel);
        southPanel.add(goBackBtn);
//        eastPanel.add(leftLabel);
//        westPanel.add(rightLabel);
        
        
        northPanel.setBorder(BorderFactory.createLineBorder(Color.yellow));
        southPanel.setBorder(BorderFactory.createLineBorder(Color.yellow));
        //centerPanel.setBorder(BorderFactory.createLineBorder(Color.yellow));

        
        add("North", northPanel);
        add("South", southPanel);
        add("Center", centerPanel);
        add("East", eastPanel);
        add("West", westPanel);
        
        goBackBtn.addActionListener(this);
        revealBtn.addActionListener(this);
        
        randomFile();
    }
    
    
    public static void main(String[] args) {
        GameMode4New f1 = new GameMode4New();
        
    }
    
    public void randomFile(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
            String line = reader.readLine();
            java.util.List<String> lines = new ArrayList<String>();
            
            while(line != null){
                lines.add(line);
                line = reader.readLine();
            }
            Random random = new Random();
            String randomLine = lines.get(random.nextInt(lines.size()));
//            suggestedLabel.setText(""+randomLine);
            String str = new String(randomLine); 
            
            myButtons = new JButton[str.length()];               
            myButtons1 = new JButton[str.length()];
//            System.out.println(str);
//            int strInt = Integer.parseInt(str);
//            System.out.println(strInt);
              System.out.println(str);
              
              
               char counter1 = str.charAt(0);
        for (int i = 0; i < str.length(); i++) { 
            String output= str.replaceAll("[a-z]", "?");
             myButtons[i]= new JButton(""+output.charAt(i));              //show dashes
             
             centerPanel.add(myButtons[i]);
//            counter1 = str.charAt(i); 
        }
//         add(textField);
        for (int i = 0; i < str.length(); i++) { 
            String output= str.replaceAll("[a-z]", "?");
            
             myButtons1[i]= new JButton(""+str.charAt(i));                //show real word
             
             centerPanel.add(myButtons1[i]);
             myButtons1[i].setVisible(false);
//            counter1 = str.charAt(i); 
        }
//        add(revealBtn);
//        revealBtn.addActionListener(this);
        
         
        }
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage() + "for words.txt", "File Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == goBackBtn){
        int goBack = JOptionPane.showConfirmDialog(null, "Are you sure you want to continue with this choice?",
                "Exit", JOptionPane.YES_NO_OPTION);
        if(goBack == 0) {
         dispose();
        GameForm form = new GameForm();
        form.setVisible(true);
      }
        else if(goBack == 1){
    }
        }
        if(e.getSource() == revealBtn){
            try{
            BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
            String line = reader.readLine();
            java.util.List<String> lines = new ArrayList<String>();
            
            while(line != null){
                lines.add(line);
                line = reader.readLine();
            }
            Random random = new Random();
            String randomLine = lines.get(random.nextInt(lines.size()));
//            suggestedLabel.setText(""+randomLine);
            String str = new String(randomLine); 
            
            myButtons = new JButton[str.length()];               
            myButtons1 = new JButton[str.length()];
//            System.out.println(str);
//            int strInt = Integer.parseInt(str);
//            System.out.println(strInt);
              System.out.println(str);
              
              
             
//         add(textField);
        
          
            String guessStr = guessTextField.getText().toString();
           System.out.println(guessStr);
//            System.out.println(guessStr);
//            for(int i = 0; i<str.length(); i++){
                 if(myButtons1[0].equals(guessStr)){
                  System.out.println("equal:" + myButtons[0]);
//                 }
                
            }
//              myButtons[1].setText(guessStr);
//        add(revealBtn);
//        revealBtn.addActionListener(this);
        
         
        }
        catch(IOException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage() + "for words.txt", "File Error",JOptionPane.ERROR_MESSAGE);
        }
//          
    }
        }
}
