package Registration;


import Forms.RegistrationForm;
import java.io.IOException;


public class RegistrationInterface {
    
    
    RegistrationManager RM = new RegistrationManager();
    RegistrationForm RF ;
    public void getTemplateForm() {
        RF = RM.getRegistrationForm();
        RF.setVisible(true);
    }   
    
    public void entersData(String userName , String Email , String Gender , String Password , String Type , int Age) throws IOException {
        RM.Register(userName, Email, Gender, Password, Type, Age);
    }
}
