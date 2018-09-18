package Registration;

import Forms.RegistrationForm;
import Entities.Profile;
import Forms.CategoryListForm;
import Forms.TeacherForm;
import Login.LoginManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class RegistrationManager {

    private RegistrationForm registrationForm;
    private RegistrationDB DB ;

    public RegistrationForm getRegistrationForm() {
        return registrationForm;
    }

    public void setRegistrationForm(RegistrationForm registrationForm) {
        this.registrationForm = registrationForm;
    }

    public RegistrationManager(RegistrationForm registrationForm) {
        this.registrationForm = registrationForm;
    }
    
    public void Register(String userName, String Email, String Gender, String Password, String Type, int Age) throws FileNotFoundException, IOException {
        boolean checkExistance = DB.checkExistance(Email);
        if (checkExistance == false) {
            if (Type.equals("Teacher")) {
                if (Email.contains("edu")) {
                    Profile profile = new Profile(userName, Password, Email, Gender , Type , Age);
                    String user = profile.toString();
                    DB.addToDB(user);
                    JOptionPane.showMessageDialog(null, "Welcome " + userName);
                    LoginManager.user = profile ;
                    TeacherForm Form = new TeacherForm();
                    Form.setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Please Enter an Academic Email Address.");
                    registrationForm.setVisible(true);
                }
            } else {
                Profile profile = new Profile(userName, Password, Email, Gender , Type , Age);
                String user = profile.toString();
                DB.addToDB(user);
                JOptionPane.showMessageDialog(null, "Welcome " + userName);
                LoginManager.user = profile ;
                CategoryListForm Form = new CategoryListForm();
                Form.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Your Email Address is Already Exists.");
            registrationForm.setVisible(true);
        }
    }

    public RegistrationManager() {
        this.registrationForm = new RegistrationForm();
        this.DB = new RegistrationDB();
    }
}
