/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letterguessgame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import static letterguessgame.GameMode4.attemptsLabel;
import static letterguessgame.GameMode4.diffLabel;
import static letterguessgame.GameMode4.guessTextField;
import static letterguessgame.GameMode4.insertString;
import static letterguessgame.GameMode4.letterFoundLabel;
import static letterguessgame.GameMode4.suggestedLabel;
import static letterguessgame.GameMode4.suggestedLabel1;

/**
 *
 * @author Aizaz
 */
public class GameMode4BusinessLogic {

    
    
    
    static void randomFile() {
        if (diffLabel.getText().toString().equalsIgnoreCase("Easy")) {
            System.out.println("selected easy");
            try {

                BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
                String line = reader.readLine();
                List<String> lines = new ArrayList<String>();

                while (line != null) {
                    lines.add(line);
                    line = reader.readLine();
                }
                Random random = new Random();
                String randomLine = lines.get(random.nextInt(lines.size()));
                String str = new String(randomLine);
//          
                System.out.println(str);
                int l = (int) (Math.random() * str.length());
                char ch = str.charAt(l);

                try {
                    System.out.println(maskStringEasy(str, 0, (str.length() / 2), '-'));
//        isAllWorsGuessed();
                } catch (Exception ex) {
                    Logger.getLogger(GameMode4.class.getName()).log(Level.SEVERE, null, ex);
                }

                String output = str.replace(String.valueOf(ch), "-");
                System.out.println("output: " + output);

                try {
                    suggestedLabel.setText(maskStringEasy(str, 0, str.length(), '-'));               //------ output
                } catch (Exception ex) {
                    Logger.getLogger(GameMode4.class.getName()).log(Level.SEVERE, null, ex);
                }
                suggestedLabel1.setText(str);                 //real output
                suggestedLabel1.setVisible(false);

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "for words.txt", "File Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (diffLabel.getText().toString().equalsIgnoreCase("Normal")) {
            try {

                BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
                String line = reader.readLine();
                List<String> lines = new ArrayList<String>();

                while (line != null) {
                    lines.add(line);
                    line = reader.readLine();
                }
                Random random = new Random();
                String randomLine = lines.get(random.nextInt(lines.size()));
                String str = new String(randomLine);

                System.out.println(str);
                int l = (int) (Math.random() * str.length());
                char ch = str.charAt(l);

                try {
                    System.out.println(maskStringNormal(str, 0, random.nextInt(str.length()), '-'));
//        isAllWorsGuessed();
                } catch (Exception ex) {
                    Logger.getLogger(GameMode4.class.getName()).log(Level.SEVERE, null, ex);
                }

                String output = str.replaceAll(String.valueOf(ch), "-");
//            String output= str.replaceAll("[a-z]", "-");
                try {
                    suggestedLabel.setText(maskStringNormal(str, 0, str.length(), '-'));               //------ output
                } catch (Exception ex) {
                    Logger.getLogger(GameMode4.class.getName()).log(Level.SEVERE, null, ex);
                }
                suggestedLabel1.setText(str);                 //real output
                suggestedLabel1.setVisible(false);

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "for words.txt", "File Error",
                        JOptionPane.ERROR_MESSAGE);
            }

//        System.exit(0);
        } else if (diffLabel.getText().toString().equalsIgnoreCase("Hard")) {
            try {

                BufferedReader reader = new BufferedReader(new FileReader("words.txt"));
                String line = reader.readLine();
                List<String> lines = new ArrayList<String>();

                while (line != null) {
                    lines.add(line);
                    line = reader.readLine();
                }
                Random random = new Random();
                String randomLine = lines.get(random.nextInt(lines.size()));
                String str = new String(randomLine);
//           
                System.out.println(str);
                int l = (int) (Math.random() * str.length());
                char ch = str.charAt(l);

                try {
                    System.out.println(maskStringHard(str, 0, random.nextInt(str.length()), '-'));
//        isAllWorsGuessed();
                } catch (Exception ex) {
                    Logger.getLogger(GameMode4.class.getName()).log(Level.SEVERE, null, ex);
                }

                String output = str.replaceAll(String.valueOf(ch), "-");

                try {
                    suggestedLabel.setText(maskStringHard(str, 0, str.length(), '-'));               //------ output
                } catch (Exception ex) {
                    Logger.getLogger(GameMode4.class.getName()).log(Level.SEVERE, null, ex);
                }

//            System.out.println(output);
//            suggestedLabel.setText(output);               //------ output
                suggestedLabel1.setText(str);                 //real output
                suggestedLabel1.setVisible(false);

            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage() + "for words.txt", "File Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }
    private static String maskStringEasy(String strText, int start, int end, char maskChar)
            throws Exception {

        if (strText == null || strText.equals("")) {
            return "";
        }

        if (start < 0) {
            start = 0;
        }

        if (end > strText.length()) {
            end = strText.length();
        }

        if (start > end) {
            throw new Exception("End index cannot be greater than start index");
        }

        int maskLength = end - start;

        if (maskLength == 0) {
            return strText;
        }
        Random random = new Random();
        int randomInt = random.nextInt(strText.length());
        System.out.println("random:" + randomInt);
        StringBuilder sbMaskString = new StringBuilder(maskLength);

        for (int i = 0; i < maskLength; i++) {
            if (i % 2 == 0) {
                sbMaskString.append(maskChar);
            } else {
                sbMaskString.append(strText.charAt(i));
            }
//            System.out.println("sub:" +sbMaskString);
        }

        return strText.substring(0, start)
                + sbMaskString.toString()
                + strText.substring(start + maskLength);
    }

    private static String maskStringNormal(String strText, int start, int end, char maskChar)
            throws Exception {

        if (strText == null || strText.equals("")) {
            return "";
        }

        if (start < 0) {
            start = 0;
        }

        if (end > strText.length()) {
            end = strText.length();
        }

        if (start > end) {
            throw new Exception("End index cannot be greater than start index");
        }

        int maskLength = end - start;

        if (maskLength == 0) {
            return strText;
        }
        Random random = new Random();
        int oneThird = (strText.length() / 3);
        System.out.println("onr third:" + oneThird);
        int randomInt = random.nextInt(strText.length());
        System.out.println("random:" + randomInt);
        StringBuilder sbMaskString = new StringBuilder(maskLength);

        for (int i = 0; i < maskLength; i++) {
            if (i % 3 == 0) {
                sbMaskString.append(strText.charAt(i));
//                 sbMaskString.append(maskChar);
            } else {
                sbMaskString.append(maskChar);
            }
//            System.out.println("sub:" +sbMaskString);
        }

        return strText.substring(0, start)
                + sbMaskString.toString()
                + strText.substring(start + maskLength);
    }

    private static String maskStringHard(String strText, int start, int end, char maskChar)
            throws Exception {

        if (strText == null || strText.equals("")) {
            return "";
        }

        if (start < 0) {
            start = 0;
        }

        if (end > strText.length()) {
            end = strText.length();
        }

        if (start > end) {
            throw new Exception("End index cannot be greater than start index");
        }

        int maskLength = end - start;

        if (maskLength == 0) {
            return strText;
        }
        Random random = new Random();
        int randomInt = random.nextInt(strText.length());
        System.out.println("random:" + randomInt);
        StringBuilder sbMaskString = new StringBuilder(maskLength);

        for (int i = 0; i < maskLength; i++) {
            if (i % strText.length() == 4) {

                sbMaskString.append(strText.charAt(i));
            } else {
                sbMaskString.append(maskChar);
            }
//            System.out.println("sub:" +sbMaskString);
        }

        return strText.substring(0, start)
                + sbMaskString.toString()
                + strText.substring(start + maskLength);
    }
    
    void RevealLetter() {
        String guess = guessTextField.getText().toString().toLowerCase();
        String suggested1 = suggestedLabel.getText().toString().toLowerCase();        //which shows ----
        String suggested = suggestedLabel1.getText().toString().toLowerCase();       //hidden
        int wordsLength = suggested.length();
        System.out.println("words length: " + wordsLength);
//          if(guess.equalsIgnoreCase("#")){
//              suggestedLabel1.setVisible(true);
//          }
        if (!suggested1.contains("-")) {
//            JOptionPane.showMessageDialog(null, "Congratulation\nYou Won The Game", "Information",
//                    JOptionPane.INFORMATION_MESSAGE);

            int playAgain = JOptionPane.showConfirmDialog(null, "Congratulation! You Won The Game \n"
                    + "Do you want to play again",
                    "Confirm", JOptionPane.YES_NO_OPTION);
            if (playAgain == 0) {
//                dispose();
                String difficultyLevelStr = diffLabel.getText().toString();
                GameMode4 form = new GameMode4(difficultyLevelStr);
//                System.exit(0);
                form.dispose();
                form.setVisible(true);

            } else if (playAgain == 1) {
//                dispose();
                System.exit(0);
            }

        } else if (guess.trim().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Please enter your guess", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!guess.matches("^[a-zA-Z]+$")) {
            JOptionPane.showMessageDialog(null, "Only letter is allowed", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else if (guess.trim().length() > 1) {
            JOptionPane.showMessageDialog(null, "Only one letter is allowed", "Error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            int index = suggested.indexOf(guess);
            int index1 = suggested.indexOf(guess, index + 1);
            do {
                if (suggested.contains(guess) == true) {
                    if (suggested1.contains(guess)) {
                        JOptionPane.showMessageDialog(null, guess + " is already inserted", "Information",
                                JOptionPane.ERROR_MESSAGE);
                    }

                    if (containsDouble(suggested, guess)) {
                        System.out.println("Modified String: " + insertString(suggested1, guess, index1));
                        System.out.println("contains " + guess + " for two times");
                        suggestedLabel.setText(insertString(suggested1, guess, index1));
                    }

                    suggestedLabel.setText(insertString(suggested1, guess, index));
                    System.out.println("at index: " + index);
                    System.out.println("Modified String: " + insertString(suggested1, guess, index));

                    letterFoundLabel.setText(guess + " is found successfuly at index " + suggested.indexOf(guess, index));
                    index = suggested.indexOf(guess, index + 1);
                    System.out.println("=======================================");
//                suggestedLabel.setText(insertString(suggested1, guess, index));

                }
            } while (index >= 0);
//           
            if (suggested.contains(guess) == false) {
                String attemptsStr = attemptsLabel.getText().toString();
                int attemptsRemain = Integer.parseInt(attemptsStr);
                int attempts = attemptsRemain - 1;
                attemptsLabel.setText("" + attempts);
                if (attempts == 0) {
//            JOptionPane.showMessageDialog(null, "Game Over");
                    JOptionPane.showMessageDialog(null, "Game Over\nYou Lost The Game\nThe Word Was:\n\t\t" + suggested, "Information",
                            JOptionPane.INFORMATION_MESSAGE);
//            attemptsLabel.setText(""+ 5);
                    int playAgain = JOptionPane.showConfirmDialog(null, "Do you want to play again",
                            "Confirm", JOptionPane.YES_NO_OPTION);
                    if (playAgain == 0) {
//                        dispose();
                        String difficultyLevelStr = diffLabel.getText().toString();
                        GameMode4 form = new GameMode4(difficultyLevelStr);
                        form.setVisible(true);

                    } else if (playAgain == 1) {
//                        dispose();
                    }
                }

            }
//            }
        }

        guessTextField.setText("");
        guessTextField.requestFocus();
    }

    private boolean containsDouble(String s, String letter) {
        
     
        int firstIndex = s.indexOf(letter);

        return firstIndex > -1 && s.indexOf(letter, firstIndex + 1) > -1;
    }
    
  
}
