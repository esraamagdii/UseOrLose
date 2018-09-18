/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Login.LoginManager;
import Playing.PlayingInterface;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TFPlaying extends javax.swing.JFrame {

    public TFPlaying() {
        initComponents();
        Submit.setBackground(Color.black);
        homePage.setBackground(Color.black);
        Background.setSize(1366, 768);
        this.setSize(1366, 768);
    }
    public void setLevel(String question)
    {
        Question.setText(question);
        
    }
    public String checkAnswer()
    {
        if(True.isSelected())
            return "True";
        else if(False.isSelected())
            return "False";
        
        return "";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Answer = new javax.swing.ButtonGroup();
        Submit = new javax.swing.JButton();
        homePage = new javax.swing.JToggleButton();
        Question = new javax.swing.JLabel();
        True = new javax.swing.JRadioButton();
        False = new javax.swing.JRadioButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Submit.setBackground(new java.awt.Color(255, 255, 255));
        Submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Submit Answer");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(583, 270, 200, 40);

        homePage.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        homePage.setForeground(new java.awt.Color(255, 255, 255));
        homePage.setText("Home Page");
        homePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageActionPerformed(evt);
            }
        });
        getContentPane().add(homePage);
        homePage.setBounds(583, 340, 200, 40);

        Question.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Question.setForeground(new java.awt.Color(255, 255, 255));
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Question.setText("\n");
        Question.setFocusable(false);
        Question.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Question);
        Question.setBounds(0, 90, 1366, 40);

        True.setBackground(new java.awt.Color(0, 0, 0));
        Answer.add(True);
        True.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        True.setForeground(new java.awt.Color(255, 255, 255));
        True.setText("True");
        True.setOpaque(false);
        True.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrueActionPerformed(evt);
            }
        });
        getContentPane().add(True);
        True.setBounds(623, 150, 100, 30);

        False.setBackground(new java.awt.Color(0, 0, 0));
        Answer.add(False);
        False.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        False.setForeground(new java.awt.Color(255, 255, 255));
        False.setText("False");
        False.setOpaque(false);
        False.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FalseActionPerformed(evt);
            }
        });
        getContentPane().add(False);
        False.setBounds(623, 200, 100, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/The Brain.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1365, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        
        this.setVisible(false);
        String Answer = checkAnswer();
        PlayingInterface playing = new PlayingInterface();
        try {
            playing.insertAnswer(Answer);
        } catch (IOException ex) {
            Logger.getLogger(TFPlaying.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_SubmitActionPerformed

    private void TrueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrueActionPerformed

    private void FalseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FalseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FalseActionPerformed

    private void homePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageActionPerformed
        // TODO add your handling code here:
        HomePage HP = new HomePage();
        HP.setVisible(true);
        this.setVisible(false);
        LoginManager.user = null ;

    }//GEN-LAST:event_homePageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Answer;
    private javax.swing.JLabel Background;
    private javax.swing.JRadioButton False;
    private javax.swing.JLabel Question;
    private javax.swing.JButton Submit;
    private javax.swing.JRadioButton True;
    private javax.swing.JToggleButton homePage;
    // End of variables declaration//GEN-END:variables
}
