/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Creation.CreationInterface;
import Login.LoginManager;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Shady
 */
public class MCQForm extends javax.swing.JFrame {

    public MCQForm() {
        initComponents();
        this.setSize(1366 , 768);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Submit = new javax.swing.JToggleButton();
        homePage = new javax.swing.JToggleButton();
        Subject = new javax.swing.JLabel();
        Question = new javax.swing.JLabel();
        QuestionField = new javax.swing.JTextField();
        FirstA = new javax.swing.JLabel();
        First = new javax.swing.JTextField();
        SecondA = new javax.swing.JLabel();
        Second = new javax.swing.JTextField();
        ThirdA = new javax.swing.JLabel();
        Third = new javax.swing.JTextField();
        FourthA = new javax.swing.JLabel();
        Fourth = new javax.swing.JTextField();
        CorrectA = new javax.swing.JLabel();
        Correct = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Submit.setBackground(new java.awt.Color(0, 0, 0));
        Submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Submit Data");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(583, 400, 200, 40);

        homePage.setBackground(new java.awt.Color(0, 0, 0));
        homePage.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        homePage.setForeground(new java.awt.Color(255, 255, 255));
        homePage.setText("Home Page");
        homePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageActionPerformed(evt);
            }
        });
        getContentPane().add(homePage);
        homePage.setBounds(583, 450, 200, 40);

        Subject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Subject.setForeground(new java.awt.Color(255, 255, 255));
        Subject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subject.setText("MCQ Form");
        Subject.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Subject);
        Subject.setBounds(0, 40, 1366, 50);

        Question.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Question.setForeground(new java.awt.Color(255, 255, 255));
        Question.setText("Question");
        Question.setName("Question"); // NOI18N
        getContentPane().add(Question);
        Question.setBounds(450, 100, 150, 30);

        QuestionField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        QuestionField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        QuestionField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        QuestionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuestionFieldActionPerformed(evt);
            }
        });
        getContentPane().add(QuestionField);
        QuestionField.setBounds(700, 100, 300, 30);

        FirstA.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FirstA.setForeground(new java.awt.Color(255, 255, 255));
        FirstA.setText("First Choice");
        getContentPane().add(FirstA);
        FirstA.setBounds(450, 150, 150, 30);

        First.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        First.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        First.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        First.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstActionPerformed(evt);
            }
        });
        getContentPane().add(First);
        First.setBounds(700, 150, 300, 30);

        SecondA.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SecondA.setForeground(new java.awt.Color(255, 255, 255));
        SecondA.setText("Second Choice");
        getContentPane().add(SecondA);
        SecondA.setBounds(450, 200, 150, 30);

        Second.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Second.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Second.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Second.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SecondActionPerformed(evt);
            }
        });
        getContentPane().add(Second);
        Second.setBounds(700, 200, 300, 30);

        ThirdA.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ThirdA.setForeground(new java.awt.Color(255, 255, 255));
        ThirdA.setText("Third Choice");
        getContentPane().add(ThirdA);
        ThirdA.setBounds(450, 250, 150, 30);

        Third.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Third.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Third.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Third.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThirdActionPerformed(evt);
            }
        });
        getContentPane().add(Third);
        Third.setBounds(700, 250, 300, 30);

        FourthA.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        FourthA.setForeground(new java.awt.Color(255, 255, 255));
        FourthA.setText("Fourth Choice");
        getContentPane().add(FourthA);
        FourthA.setBounds(450, 300, 150, 30);

        Fourth.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Fourth.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fourth.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Fourth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FourthActionPerformed(evt);
            }
        });
        getContentPane().add(Fourth);
        Fourth.setBounds(700, 300, 300, 30);

        CorrectA.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CorrectA.setForeground(new java.awt.Color(255, 255, 255));
        CorrectA.setText("Correct Answer");
        getContentPane().add(CorrectA);
        CorrectA.setBounds(450, 350, 150, 30);

        Correct.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Correct.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Correct.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Correct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrectActionPerformed(evt);
            }
        });
        getContentPane().add(Correct);
        Correct.setBounds(700, 350, 300, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/The Brain.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1366, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        
        String level = QuestionField.getText() + ","  + First.getText() + "," + 
                Second.getText() + "," + Third.getText() + "," + Fourth.getText() +
                "," + Correct.getText() ;
        
        this.setVisible(false);
        try {
            CreationInterface.addLevel(level);  
        } catch (IOException ex) {
            Logger.getLogger(TFForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void homePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageActionPerformed
        // TODO add your handling code here:
        HomePage HP = new HomePage();
        HP.setVisible(true);
        this.setVisible(false);
        LoginManager.user = null ;

    }//GEN-LAST:event_homePageActionPerformed

    private void ThirdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThirdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ThirdActionPerformed

    private void QuestionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QuestionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QuestionFieldActionPerformed

    private void FirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstActionPerformed

    private void SecondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SecondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SecondActionPerformed

    private void CorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorrectActionPerformed

    private void FourthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FourthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FourthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextField Correct;
    private javax.swing.JLabel CorrectA;
    private javax.swing.JTextField First;
    private javax.swing.JLabel FirstA;
    private javax.swing.JTextField Fourth;
    private javax.swing.JLabel FourthA;
    private javax.swing.JLabel Question;
    private javax.swing.JTextField QuestionField;
    private javax.swing.JTextField Second;
    private javax.swing.JLabel SecondA;
    private javax.swing.JLabel Subject;
    private javax.swing.JToggleButton Submit;
    private javax.swing.JTextField Third;
    private javax.swing.JLabel ThirdA;
    private javax.swing.JToggleButton homePage;
    // End of variables declaration//GEN-END:variables
}
