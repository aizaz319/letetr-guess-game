/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letterguessgame;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author dell
 */
public class GameMode4 extends javax.swing.JFrame {

    private UIManager.LookAndFeelInfo[] looks; // look and feels
    ArrayList<JButton> jbuttons = new ArrayList<JButton>();
    GameMode4BusinessLogic form1 = new GameMode4BusinessLogic();
    

    /**
     * Creates new form GameMode4
     */
    
    public GameMode4() {
    }

    public GameMode4(String id) {
        initComponents();
        String id1 = id;
        diffLabel.setText(id1);
        form1.randomFile();
        looks = UIManager.getInstalledLookAndFeels();
        String str = "hello";
        setTitle("Letter Guessing Game");
    }
    int attemptLimit = 4;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem7 = new javax.swing.JRadioButtonMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jRadioButtonMenuItem9 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem10 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem11 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        mainMenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        guessTextField = new javax.swing.JTextField();
        revealBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        gaveupBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        letterFoundLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        attemptsLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        diffLabel = new javax.swing.JLabel();
        cheatModeCheckBox = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        suggestedLabel1 = new javax.swing.JLabel();
        suggestedLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newItemMenuBar = new javax.swing.JMenuItem();
        exitMenuBar = new javax.swing.JMenuItem();
        settingsMenuBar = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        metalTheme = new javax.swing.JRadioButtonMenuItem();
        nimbusTheme = new javax.swing.JRadioButtonMenuItem();
        motifTheme = new javax.swing.JRadioButtonMenuItem();
        windowTheme = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aboutMenuBar = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jRadioButtonMenuItem3.setSelected(true);
        jRadioButtonMenuItem3.setText("jRadioButtonMenuItem3");

        jRadioButtonMenuItem4.setSelected(true);
        jRadioButtonMenuItem4.setText("jRadioButtonMenuItem4");

        jRadioButtonMenuItem6.setSelected(true);
        jRadioButtonMenuItem6.setText("jRadioButtonMenuItem6");

        jRadioButtonMenuItem7.setSelected(true);
        jRadioButtonMenuItem7.setText("jRadioButtonMenuItem7");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jRadioButtonMenuItem9.setSelected(true);
        jRadioButtonMenuItem9.setText("jRadioButtonMenuItem9");

        jRadioButtonMenuItem10.setSelected(true);
        jRadioButtonMenuItem10.setText("jRadioButtonMenuItem10");

        jRadioButtonMenuItem11.setSelected(true);
        jRadioButtonMenuItem11.setText("jRadioButtonMenuItem11");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/letterguessgame/guess.jpg"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Guess the word by typing a letter – You are playing 4 word guess mode");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(243, 243, 243))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1))
        );

        mainMenu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mainMenu.setText("Go Back to Main Menu");
        mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuActionPerformed(evt);
            }
        });

        guessTextField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guessTextField.setForeground(new java.awt.Color(255, 51, 0));
        guessTextField.setBorder(null);
        guessTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                guessTextFieldFocusGained(evt);
            }
        });
        guessTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessTextFieldActionPerformed(evt);
            }
        });

        revealBtn.setText("Reveal");
        revealBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revealBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        gaveupBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gaveupBtn.setText("I Gave up on This Word!");
        gaveupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gaveupBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Enter a letter Please");

        letterFoundLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(letterFoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(guessTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(revealBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(gaveupBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revealBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guessTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(letterFoundLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(gaveupBtn)
                .addGap(32, 32, 32))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("You Have");

        attemptsLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        attemptsLabel.setForeground(new java.awt.Color(255, 255, 255));
        attemptsLabel.setText("4");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("attempts left");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(attemptsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(attemptsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        diffLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        diffLabel.setText("diff");

        cheatModeCheckBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cheatModeCheckBox.setText("Cheat Mode");
        cheatModeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cheatModeCheckBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Level:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(diffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cheatModeCheckBox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diffLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cheatModeCheckBox)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        suggestedLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        suggestedLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suggestedLabel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                suggestedLabelInputMethodTextChanged(evt);
            }
        });

        jMenu1.setMnemonic('F');
        jMenu1.setText("File");

        newItemMenuBar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newItemMenuBar.setText("New");
        newItemMenuBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newItemMenuBarActionPerformed(evt);
            }
        });
        jMenu1.add(newItemMenuBar);

        exitMenuBar.setText("Exit");
        exitMenuBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuBarActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuBar);

        jMenuBar1.add(jMenu1);

        settingsMenuBar.setMnemonic('S');
        settingsMenuBar.setText("Settings");

        jMenu3.setText("Themes");

        buttonGroup1.add(metalTheme);
        metalTheme.setText("Metal");
        metalTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metalThemeActionPerformed(evt);
            }
        });
        jMenu3.add(metalTheme);

        buttonGroup1.add(nimbusTheme);
        nimbusTheme.setText("Nimbus");
        nimbusTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimbusThemeActionPerformed(evt);
            }
        });
        jMenu3.add(nimbusTheme);

        buttonGroup1.add(motifTheme);
        motifTheme.setSelected(true);
        motifTheme.setText("CDE/Motif");
        motifTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motifThemeActionPerformed(evt);
            }
        });
        jMenu3.add(motifTheme);

        buttonGroup1.add(windowTheme);
        windowTheme.setText("Windows");
        windowTheme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                windowThemeActionPerformed(evt);
            }
        });
        jMenu3.add(windowTheme);

        settingsMenuBar.add(jMenu3);

        jMenuBar1.add(settingsMenuBar);

        jMenu2.setMnemonic('H');
        jMenu2.setText("Help");

        aboutMenuBar.setText("About");
        aboutMenuBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuBarActionPerformed(evt);
            }
        });
        jMenu2.add(aboutMenuBar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(247, 247, 247)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(suggestedLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suggestedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(suggestedLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(suggestedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuActionPerformed
        int goBack = JOptionPane.showConfirmDialog(null, "Are you sure you want to continue with this choice?",
                "Exit", JOptionPane.YES_NO_OPTION);
        if (goBack == 0) {
            dispose();
            GameForm form = new GameForm();
            form.setVisible(true);
        } else if (goBack == 1) {
        }

    }//GEN-LAST:event_mainMenuActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        guessTextField.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    private void guessTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessTextFieldActionPerformed


    }//GEN-LAST:event_guessTextFieldActionPerformed

    private void guessTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_guessTextFieldFocusGained

    }//GEN-LAST:event_guessTextFieldFocusGained

    private void gaveupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gaveupBtnActionPerformed
        int gaveUp = JOptionPane.showConfirmDialog(null, "Are you sure you want to continue with this choice?",
                "Gave up", JOptionPane.YES_NO_OPTION);
        if (gaveUp == 0) {
//            suggestedLabel.setText(suggestedLabel1.getText().toString());
            JOptionPane.showMessageDialog(null, "The Word Was:\n\t\t" + suggestedLabel1.getText().toString(), "Information",
                    JOptionPane.INFORMATION_MESSAGE);
            form1.randomFile();
//            randomFile();
//         JOptionPane.showMessageDialog(null, "It will replace the word with a new word...");
        } else if (gaveUp == 1) {
        }
    }//GEN-LAST:event_gaveupBtnActionPerformed

    private void revealBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revealBtnActionPerformed
        form1.RevealLetter();

    }//GEN-LAST:event_revealBtnActionPerformed
    // Function to insert string 
    // Function to insert string 

    public static String insertString(
            String originalString,
            String stringToBeInserted,
            int index) {

        // Create a new string 
        String newString = originalString.substring(0, index)
                + stringToBeInserted
                + originalString.substring(index + 1);

        // return the modified String 
        return newString;
    }

    private void newItemMenuBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newItemMenuBarActionPerformed
        dispose();
        String difficultyLevelStr = diffLabel.getText().toString();
        GameMode4 form = new GameMode4(difficultyLevelStr);
        form.setVisible(true);

    }//GEN-LAST:event_newItemMenuBarActionPerformed

    private void exitMenuBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuBarActionPerformed
        dispose();
    }//GEN-LAST:event_exitMenuBarActionPerformed

    private void aboutMenuBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuBarActionPerformed
        JOptionPane.showMessageDialog(null, "This game is designed and programmed by\n"
                + "two master of Computer Engineering students of\n Cyprus International University\n\n"
                + "Name: Aizaz Ali Shah\n"
                + "Email: Aizaz319@gmail.com\n"
                + "Name: Jana Al Hajj\n"
                + "Email: janahajj187@gmail.com\n"
                + "Cprus International University\n",
                "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_aboutMenuBarActionPerformed

    private void metalThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metalThemeActionPerformed
        changeTheLookAndFeel(0);
        suggestedLabel1.setVisible(false);

    }//GEN-LAST:event_metalThemeActionPerformed

    private void nimbusThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimbusThemeActionPerformed
        changeTheLookAndFeel(1);
        suggestedLabel1.setVisible(false);
    }//GEN-LAST:event_nimbusThemeActionPerformed

    private void windowThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_windowThemeActionPerformed
        changeTheLookAndFeel(3);
        suggestedLabel1.setVisible(false);
    }//GEN-LAST:event_windowThemeActionPerformed

    private void motifThemeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motifThemeActionPerformed
        changeTheLookAndFeel(2);
        suggestedLabel1.setVisible(false);
    }//GEN-LAST:event_motifThemeActionPerformed

    private void suggestedLabelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_suggestedLabelInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_suggestedLabelInputMethodTextChanged

    private void cheatModeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cheatModeCheckBoxActionPerformed
        if (cheatModeCheckBox.isSelected()) {
            suggestedLabel1.setVisible(true);
        } else {
            suggestedLabel1.setVisible(false);
        }

    }//GEN-LAST:event_cheatModeCheckBoxActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuBar;
    public static javax.swing.JLabel attemptsLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cheatModeCheckBox;
    private javax.swing.JButton clearBtn;
    public static javax.swing.JLabel diffLabel;
    private javax.swing.JMenuItem exitMenuBar;
    private javax.swing.JButton gaveupBtn;
    public static javax.swing.JTextField guessTextField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem10;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem11;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem7;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem9;
    public static javax.swing.JLabel letterFoundLabel;
    private javax.swing.JButton mainMenu;
    private javax.swing.JRadioButtonMenuItem metalTheme;
    private javax.swing.JRadioButtonMenuItem motifTheme;
    private javax.swing.JMenuItem newItemMenuBar;
    private javax.swing.JRadioButtonMenuItem nimbusTheme;
    private javax.swing.JButton revealBtn;
    private javax.swing.JMenu settingsMenuBar;
    public static javax.swing.JLabel suggestedLabel;
    public static javax.swing.JLabel suggestedLabel1;
    private javax.swing.JRadioButtonMenuItem windowTheme;
    // End of variables declaration//GEN-END:variables


    private void changeTheLookAndFeel(int value) {
        try // change look-and-feel
        {

            // set look-and-feel for this application
            UIManager.setLookAndFeel(looks[value].getClassName());
            // update components in this application
            SwingUtilities.updateComponentTreeUI(this);

        } // end try
        catch (Exception exception) {
            exception.printStackTrace();
        } // end catch
    } // end method changeTheLookAndFeel

}
