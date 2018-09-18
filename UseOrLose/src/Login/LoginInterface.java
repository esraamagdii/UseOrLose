package Login;


import Forms.LoginForm;
import java.io.FileNotFoundException;
import java.io.IOException;


public class LoginInterface {
    
    LoginManager LM = new  LoginManager();
    LoginForm LF = new LoginForm();
    public void getLoginForm() {
        LF = LM.getLoginForm();
        LF.setVisible(true);
    }
    public void entersData(String Email , String Password) throws FileNotFoundException, IOException {
        LM.checkInformation(Email, Password);
    }
    
    public void recheckEmail(String Email) throws FileNotFoundException {
        LM.checkEmail(Email);
    }
}
