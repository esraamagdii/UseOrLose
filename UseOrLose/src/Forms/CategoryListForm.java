package Forms;


import Login.LoginManager;
import Playing.PlayingInterface;
import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CategoryListForm extends javax.swing.JFrame {

    
    public CategoryListForm() {
        initComponents();
        this.setSize(1366 , 768);
        Submit.setBackground(Color.black);
        Submit.setLocation(583 , 270);
        Submit.setSize(200 , 40);
        Score.setBackground(Color.black);
        Score.setLocation(583 , 340);
        Score.setSize(200 , 40);
        homePage.setBackground(Color.black);
        homePage.setLocation(583 , 400);
        homePage.setSize(200 , 40);
        Background.setSize(this.getSize());
        Font font = new Font("Tahoma", Font.BOLD, 16);
        Math.setFont(font);
        Math.setForeground(Color.white);
        Math.setSize(1366 , 50);
        Science.setFont(font);
        Science.setForeground(Color.white);
        Science.setSize(1366 , 50);
        Programming.setFont(font);
        Programming.setForeground(Color.white);
        Programming.setSize(1366 , 50);
        setDefaultCloseOperation(CategoryListForm.EXIT_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CategoryType = new javax.swing.ButtonGroup();
        Math = new javax.swing.JRadioButton();
        Science = new javax.swing.JRadioButton();
        Programming = new javax.swing.JRadioButton();
        Submit = new javax.swing.JToggleButton();
        homePage = new javax.swing.JToggleButton();
        Score = new javax.swing.JToggleButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Math.setBackground(new java.awt.Color(102, 102, 102));
        CategoryType.add(Math);
        Math.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Math.setForeground(new java.awt.Color(255, 255, 255));
        Math.setText("Math");
        Math.setOpaque(false);
        Math.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MathActionPerformed(evt);
            }
        });
        getContentPane().add(Math);
        Math.setBounds(620, 70, 57, 50);

        Science.setBackground(new java.awt.Color(102, 102, 102));
        CategoryType.add(Science);
        Science.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Science.setForeground(new java.awt.Color(255, 255, 255));
        Science.setText("Science");
        Science.setOpaque(false);
        getContentPane().add(Science);
        Science.setBounds(620, 130, 71, 50);

        Programming.setBackground(new java.awt.Color(102, 102, 102));
        CategoryType.add(Programming);
        Programming.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Programming.setForeground(new java.awt.Color(255, 255, 255));
        Programming.setText("Programming");
        Programming.setOpaque(false);
        Programming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgrammingActionPerformed(evt);
            }
        });
        getContentPane().add(Programming);
        Programming.setBounds(620, 190, 107, 50);

        Submit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Submit.setForeground(new java.awt.Color(255, 255, 255));
        Submit.setText("Submit Data");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(0, 250, 490, 40);

        homePage.setBackground(new java.awt.Color(0, 0, 0));
        homePage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homePage.setForeground(new java.awt.Color(255, 255, 255));
        homePage.setText("Home Page");
        homePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageActionPerformed(evt);
            }
        });
        getContentPane().add(homePage);
        homePage.setBounds(583, 540, 200, 40);

        Score.setBackground(new java.awt.Color(0, 0, 0));
        Score.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Score.setForeground(new java.awt.Color(255, 255, 255));
        Score.setText("Achievements");
        Score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScoreActionPerformed(evt);
            }
        });
        getContentPane().add(Score);
        Score.setBounds(583, 540, 200, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/The Brain.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 490, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProgrammingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgrammingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProgrammingActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String categoryType = null ;
        if(Math.isSelected()) {
            categoryType = Math.getText();
        }
        else if(Science.isSelected()) {
            categoryType = Science.getText();
        }
        else if(Programming.isSelected()) {
            categoryType = Programming.getText();
        }
        this.setVisible(false);
        PlayingInterface PI = new PlayingInterface();
        try {
            PI.chooseCategory(categoryType);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CategoryListForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void MathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MathActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MathActionPerformed

    private void homePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageActionPerformed
        // TODO add your handling code here:
        HomePage HP = new HomePage();
        HP.setVisible(true);
        this.setVisible(false);
        LoginManager.user = null ;
    }//GEN-LAST:event_homePageActionPerformed

    private void ScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScoreActionPerformed
        // TODO add your handling code here:
        PlayingInterface PI = new PlayingInterface();
        try {
            PI.showScore();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CategoryListForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ScoreActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.ButtonGroup CategoryType;
    private javax.swing.JRadioButton Math;
    private javax.swing.JRadioButton Programming;
    private javax.swing.JRadioButton Science;
    private javax.swing.JToggleButton Score;
    private javax.swing.JToggleButton Submit;
    private javax.swing.JToggleButton homePage;
    // End of variables declaration//GEN-END:variables
}
