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
import javax.swing.JLabel;

public class MCQPlaying extends javax.swing.JFrame {

    public MCQPlaying() {
        initComponents();
        Submit.setBackground(Color.black);
        homePage.setBackground(Color.black);
        JLabel Background = new javax.swing.JLabel();
        Background.setIcon(new javax.swing.ImageIcon("src\\Forms\\The Brain.jpg")); // NOI18N
        getContentPane().add(Background);
        Background.setSize(1366, 768);
        this.setSize(1366, 768);
    }
    public void setLevel(String question,String Ans1,String Ans2,String Ans3,String Ans4)
    {
        Question.setText(question);
        Answer1.setText(Ans1);
        Answer2.setText(Ans2);
        Answer3.setText(Ans3);
        Answer4.setText(Ans4);
    }
    public String checkAnswer()
    {
        if(Answer1.isSelected())
            return Answer1.getText();
        else if(Answer2.isSelected())
            return Answer2.getText();
        else if(Answer3.isSelected())
            return Answer3.getText();
        else if(Answer4.isSelected())
            return Answer4.getText();
        
        return "";
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Answer = new javax.swing.ButtonGroup();
        Question = new javax.swing.JLabel();
        Answer1 = new javax.swing.JRadioButton();
        Answer2 = new javax.swing.JRadioButton();
        Answer3 = new javax.swing.JRadioButton();
        Answer4 = new javax.swing.JRadioButton();
        Submit = new javax.swing.JButton();
        homePage = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Question.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Question.setForeground(new java.awt.Color(255, 255, 255));
        Question.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Question);
        Question.setBounds(0, 50, 1366, 40);

        Answer.add(Answer1);
        Answer1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Answer1.setForeground(new java.awt.Color(255, 255, 255));
        Answer1.setAlignmentX(0.5F);
        getContentPane().add(Answer1);
        Answer1.setBounds(623, 100, 600, 40);

        Answer.add(Answer2);
        Answer2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Answer2.setForeground(new java.awt.Color(255, 255, 255));
        Answer2.setAlignmentX(0.5F);
        getContentPane().add(Answer2);
        Answer2.setBounds(623, 150, 600, 40);

        Answer.add(Answer3);
        Answer3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Answer3.setForeground(new java.awt.Color(255, 255, 255));
        Answer3.setAlignmentX(0.5F);
        getContentPane().add(Answer3);
        Answer3.setBounds(623, 200, 600, 40);

        Answer.add(Answer4);
        Answer4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Answer4.setForeground(new java.awt.Color(255, 255, 255));
        Answer4.setAlignmentX(0.5F);
        getContentPane().add(Answer4);
        Answer4.setBounds(623, 250, 600, 40);

        Submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Check Answer");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(583, 330, 200, 40);

        homePage.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        homePage.setForeground(new java.awt.Color(255, 255, 255));
        homePage.setText("Home Page");
        homePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageActionPerformed(evt);
            }
        });
        getContentPane().add(homePage);
        homePage.setBounds(583, 380, 200, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String Answer = checkAnswer();
        PlayingInterface playing =new PlayingInterface();
        try {
            playing.insertAnswer(Answer);
        } catch (IOException ex) {
            Logger.getLogger(MCQPlaying.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
    }//GEN-LAST:event_SubmitActionPerformed

    private void homePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageActionPerformed
        // TODO add your handling code here:
        HomePage HP = new HomePage();
        HP.setVisible(true);
        this.setVisible(false);
        LoginManager.user = null ;

    }//GEN-LAST:event_homePageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Answer;
    private javax.swing.JRadioButton Answer1;
    private javax.swing.JRadioButton Answer2;
    private javax.swing.JRadioButton Answer3;
    private javax.swing.JRadioButton Answer4;
    private javax.swing.JLabel Question;
    private javax.swing.JButton Submit;
    private javax.swing.JToggleButton homePage;
    // End of variables declaration//GEN-END:variables
}
