/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author Shady
 */
public class NotificationsForm extends javax.swing.JFrame {

    /**
     * Creates new form Notifications
     */
    public NotificationsForm() {
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    public void GamesState(ArrayList<String> teacherNotifications) {
        JLabel[] gameState = new JLabel[teacherNotifications.size()];
        System.err.println(100 + (50 * (teacherNotifications.size()) + 1));
        for (int i = 0; i < teacherNotifications.size(); i++) {
            String[] Split = teacherNotifications.get(i).split(",");
            gameState[i] = new JLabel(Split[0] + " Was " + Split[1]);
            gameState[i].setSize(1366, 40);
            gameState[i].setLocation(0, 100 + (50 * i));
            gameState[i].setVerticalAlignment((int) CENTER_ALIGNMENT);
            gameState[i].setHorizontalAlignment((int) CENTER_ALIGNMENT);
            gameState[i].setOpaque(false);
            gameState[i].setForeground(Color.white);
            Font font = new Font("Tahoma", 1, 18);
            gameState[i].setFont(font);
            this.add(gameState[i]);
        }
        JLabel Background = new javax.swing.JLabel();
        Background.setIcon(new javax.swing.ImageIcon("src\\Forms\\The Brain.jpg")); // NOI18N
        getContentPane().add(Background);
        Background.setSize(1366, 768);
        this.setSize(1366, 768);
        this.setVisible(true);
    }

    public void Comments(ArrayList<String> teacherComments) {
        JLabel[] gameState = new JLabel[teacherComments.size()];
        for (int i = 0; i < teacherComments.size(); i++) {
            String[] Split = teacherComments.get(i).split(",");
            gameState[i] = new JLabel(Split[1] + " Was Commented On " + Split[0] + ":\"" + Split[2] + "\"");
            gameState[i].setSize(1366, 40);
            gameState[i].setLocation(0, 100 + (50 * i));
            gameState[i].setVerticalAlignment((int) CENTER_ALIGNMENT);
            gameState[i].setHorizontalAlignment((int) CENTER_ALIGNMENT);
            gameState[i].setOpaque(false);
            gameState[i].setForeground(Color.white);
            Font font = new Font("Tahoma", 1, 18);
            gameState[i].setFont(font);
            this.add(gameState[i]);
        }
        JLabel Background = new javax.swing.JLabel();
        Background.setIcon(new javax.swing.ImageIcon("src\\Forms\\The Brain.jpg")); // NOI18N
        getContentPane().add(Background);
        Background.setSize(1366, 768);
        this.setSize(1366, 768);
        this.setVisible(true);
    }

    public void Scores(ArrayList<String> userScore) {
        JLabel[] Score = new JLabel[userScore.size()];
        for (int i = 0; i < userScore.size(); i++) {
            String[] Split = userScore.get(i).split(",");
            Score[i] = new JLabel("Game Name : " + Split[0] + ", Your Score : " + Split[1]);
            Score[i].setSize(1366, 40);
            Score[i].setLocation(0, 100 + (50 * i));
            Score[i].setVerticalAlignment((int) CENTER_ALIGNMENT);
            Score[i].setHorizontalAlignment((int) CENTER_ALIGNMENT);
            Score[i].setOpaque(false);
            Score[i].setForeground(Color.white);
            Font font = new Font("Tahoma", 1, 18);
            Score[i].setFont(font);
            this.add(Score[i]);
        }
        JLabel Background = new javax.swing.JLabel();
        Background.setIcon(new javax.swing.ImageIcon("src\\Forms\\The Brain.jpg")); // NOI18N
        getContentPane().add(Background);
        Background.setSize(1366, 768);
        this.setSize(1366, 768);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
