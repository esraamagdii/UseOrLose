package Forms;

import Registration.RegistrationInterface;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RegistrationForm extends javax.swing.JFrame {

    public static String userName = "";
    public static String Password = "";
    public static String Email = "";
    public static String Gender = "";
    public static String Type = "";
    public static int Age = -1;
    public static RegistrationInterface RI = new RegistrationInterface();

    public RegistrationForm() {
        initComponents();
  
        Submit.setBackground(Color.BLACK);
        homePage.setBackground(Color.BLACK);
        Background.setSize(1366, 768);
        this.setSize(1366, 768);
        setDefaultCloseOperation(RegistrationForm.EXIT_ON_CLOSE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderType = new javax.swing.ButtonGroup();
        AccountType = new javax.swing.ButtonGroup();
        Subject = new javax.swing.JLabel();
        homePage = new javax.swing.JToggleButton();
        Submit = new javax.swing.JToggleButton();
        Teacher = new javax.swing.JRadioButton();
        Name = new javax.swing.JLabel();
        ageField = new javax.swing.JTextField();
        userEmail = new javax.swing.JLabel();
        Student = new javax.swing.JRadioButton();
        userPassword = new javax.swing.JLabel();
        userGender = new javax.swing.JLabel();
        userAge = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        Account = new javax.swing.JLabel();
        Male = new javax.swing.JRadioButton();
        Female = new javax.swing.JRadioButton();
        passwordField = new javax.swing.JPasswordField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setFont(new java.awt.Font("Agency FB", 1, 12)); // NOI18N
        getContentPane().setLayout(null);

        Subject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Subject.setForeground(new java.awt.Color(255, 255, 255));
        Subject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Subject.setText("Registration Form");
        Subject.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(Subject);
        Subject.setBounds(0, 20, 1366, 50);

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
        homePage.setBounds(583, 450, 200, 40);

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

        Teacher.setBackground(new java.awt.Color(0, 0, 0));
        AccountType.add(Teacher);
        Teacher.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Teacher.setForeground(new java.awt.Color(255, 255, 255));
        Teacher.setText("Teacher");
        Teacher.setOpaque(false);
        Teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeacherActionPerformed(evt);
            }
        });
        getContentPane().add(Teacher);
        Teacher.setBounds(800, 350, 100, 40);

        Name.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("User Name");
        Name.setName("Name"); // NOI18N
        getContentPane().add(Name);
        Name.setBounds(450, 100, 150, 40);

        ageField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ageField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ageField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ageField);
        ageField.setBounds(700, 250, 300, 40);

        userEmail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userEmail.setForeground(new java.awt.Color(255, 255, 255));
        userEmail.setText("Email");
        getContentPane().add(userEmail);
        userEmail.setBounds(450, 150, 150, 40);

        Student.setBackground(new java.awt.Color(0, 0, 0));
        AccountType.add(Student);
        Student.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Student.setForeground(new java.awt.Color(255, 255, 255));
        Student.setText("Student");
        Student.setOpaque(false);
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        getContentPane().add(Student);
        Student.setBounds(700, 350, 100, 40);

        userPassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        userPassword.setForeground(new java.awt.Color(255, 255, 255));
        userPassword.setText("Password");
        getContentPane().add(userPassword);
        userPassword.setBounds(450, 200, 150, 40);

        userGender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        userGender.setForeground(new java.awt.Color(255, 255, 255));
        userGender.setText("Gender");
        getContentPane().add(userGender);
        userGender.setBounds(450, 300, 150, 40);

        userAge.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        userAge.setForeground(new java.awt.Color(255, 255, 255));
        userAge.setText("Age");
        getContentPane().add(userAge);
        userAge.setBounds(450, 250, 150, 40);

        userNameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        userNameField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userNameField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(userNameField);
        userNameField.setBounds(700, 100, 300, 40);

        EmailField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EmailField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        EmailField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });
        getContentPane().add(EmailField);
        EmailField.setBounds(700, 150, 300, 40);

        Account.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Account.setForeground(new java.awt.Color(255, 255, 255));
        Account.setText("Account Type");
        getContentPane().add(Account);
        Account.setBounds(450, 350, 150, 40);

        Male.setBackground(new java.awt.Color(0, 0, 0));
        GenderType.add(Male);
        Male.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Male.setForeground(new java.awt.Color(255, 255, 255));
        Male.setText("Male");
        Male.setOpaque(false);
        Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaleActionPerformed(evt);
            }
        });
        getContentPane().add(Male);
        Male.setBounds(700, 300, 100, 40);

        Female.setBackground(new java.awt.Color(0, 0, 0));
        GenderType.add(Female);
        Female.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Female.setForeground(new java.awt.Color(255, 255, 255));
        Female.setText("Female");
        Female.setOpaque(false);
        Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FemaleActionPerformed(evt);
            }
        });
        getContentPane().add(Female);
        Female.setBounds(800, 300, 100, 40);

        passwordField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        getContentPane().add(passwordField);
        passwordField.setBounds(700, 200, 300, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Forms/The Brain.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1080, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeacherActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_TeacherActionPerformed

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ageFieldActionPerformed

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_StudentActionPerformed

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_userNameFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_EmailFieldActionPerformed

    private void MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaleActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_MaleActionPerformed

    private void FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FemaleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_FemaleActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

        userName = userNameField.getText();
        Password = passwordField.getText();
        Email = EmailField.getText();
        Age = Integer.parseInt(ageField.getText());
        if (Male.isSelected()) {
            Gender = "Male";
        } else if (Female.isSelected()) {
            Gender = "Female";
        }
        if (Student.isSelected()) {
            Type = "Student";
        } else if (Teacher.isSelected()) {
            Type = "Teacher";
        }
        System.out.println(Type);
        try {
            // TODO add your handling code here:
            RI.entersData(userName, Email, Gender, Password, Type, Age);
        } catch (IOException ex) {
            Logger.getLogger(RegistrationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);

    }//GEN-LAST:event_SubmitActionPerformed

    private void homePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homePageActionPerformed
        // TODO add your handling code here:
        HomePage HP = new HomePage();
        HP.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homePageActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account;
    private javax.swing.ButtonGroup AccountType;
    private javax.swing.JLabel Background;
    private javax.swing.JTextField EmailField;
    private javax.swing.JRadioButton Female;
    private javax.swing.ButtonGroup GenderType;
    private javax.swing.JRadioButton Male;
    private javax.swing.JLabel Name;
    private javax.swing.JRadioButton Student;
    private javax.swing.JLabel Subject;
    private javax.swing.JToggleButton Submit;
    private javax.swing.JRadioButton Teacher;
    private javax.swing.JTextField ageField;
    private javax.swing.JToggleButton homePage;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel userAge;
    private javax.swing.JLabel userEmail;
    private javax.swing.JLabel userGender;
    private javax.swing.JTextField userNameField;
    private javax.swing.JLabel userPassword;
    // End of variables declaration//GEN-END:variables
}
