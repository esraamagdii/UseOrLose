package Forms;


import Login.LoginManager;
import Playing.PlayingInterface;
import java.awt.Color;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class GameListForm extends javax.swing.JFrame {

    public static JRadioButton [] Button ;
    public GameListForm() {
        initComponents();
        this.setSize(1366 , 768);
        setDefaultCloseOperation(GameListForm.EXIT_ON_CLOSE);
        
    }
    
    
    public void BuildForm ( ArrayList <String> gamesName) throws FileNotFoundException {
        ButtonGroup Game = new ButtonGroup();
        Button = new JRadioButton [gamesName.size()] ;
        for (int i = 0 ; i < gamesName.size() ; i++){
		Button[i] = new JRadioButton(gamesName.get(i));
                Button[i].setName(gamesName.get(i));
		Button[i].setSize(1366 , 50);
                Button[i].setLocation(620 , 100 + (i * 50));
                Button[i].setOpaque(false);
                Font font = new Font("Tahoma", Font.BOLD, 16);
                Button[i].setFont(font);
                Button[i].setForeground(Color.white);
                Game.add(Button[i]); 
                this.add(Button[i]);    
        }
        Play.setSize(200, 50);
        Play.setBackground(Color.black);
        Play.setLocation(583, 100 + (50 * gamesName.size()));
        homePage.setSize(200, 50);
        homePage.setBackground(Color.black);
        homePage.setLocation(583, 120 + (50 * (gamesName.size() + 1)));
        JLabel Background = new javax.swing.JLabel();
        Background.setIcon(new javax.swing.ImageIcon("src\\Forms\\The Brain.jpg")); // NOI18N
        getContentPane().add(Background);
        Background.setSize(1366, 768);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Play = new javax.swing.JToggleButton();
        homePage = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Play.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Play.setForeground(new java.awt.Color(255, 255, 255));
        Play.setText("Start Play");
        Play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayActionPerformed(evt);
            }
        });
        getContentPane().add(Play);
        Play.setBounds(583, 270, 200, 40);

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

    private void PlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayActionPerformed
        
        this.setVisible(false);
        PlayingInterface PI = new PlayingInterface();
        String gameName = "";
        for(int i = 0 ; i < Button.length ; i++) {
            if(Button[i].isSelected()) {
                gameName = Button[i].getText();
                break;
            }
        }
        try {
            PI.ChooseGame(gameName);
        } catch (IOException ex) {
            Logger.getLogger(GameListForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PlayActionPerformed

    private void homePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageActionPerformed
        // TODO add your handling code here:
        HomePage HP = new HomePage();
        HP.setVisible(true);
        this.setVisible(false);
        LoginManager.user = null ;

    }//GEN-LAST:event_homePageActionPerformed


    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Play;
    private javax.swing.JToggleButton homePage;
    // End of variables declaration//GEN-END:variables
}
