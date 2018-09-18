package Login;


import Forms.LoginForm;
import Forms.CategoryListForm;
import Entities.Profile;
import Forms.ApprovalForm;
import Forms.TeacherForm;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;


public class LoginManager {

    
    public static Profile user ;

    public LoginManager() {
    }
    private LoginForm loginForm = new LoginForm();

    public LoginForm getLoginForm() {
        return loginForm;
    }

    public void setLoginForm(LoginForm loginForm) {
        this.loginForm = loginForm;
    }
    
    
    public void checkInformation(String Email , String Password) throws FileNotFoundException, IOException {
        LoginDB DB = new LoginDB();
        user = DB.checkValidation(Email, Password);
        if(user == null) {
            JOptionPane.showMessageDialog(null , "Your Email Or Your Password is Incorrect.");
            loginForm.setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null , "Weclocme " + user.getName());
            loginForm.setVisible(false);
            switch (user.getAccountType()) {
                case "Teacher":
                    TeacherForm teacherForm = new TeacherForm();
                    teacherForm.setVisible(true);
                    break;
                case "Student":
                    CategoryListForm studentForm = new CategoryListForm();
                    studentForm.setVisible(true);
                    break;
                case "Admin":
                    ApprovalForm adminForm = new ApprovalForm();
                    adminForm.BuildForm();
                    break;
                default:
                    break;
            }
        }
    }
    public void checkEmail(String Email) throws FileNotFoundException {
        LoginDB DB = new LoginDB();
        String checkExistance = DB.checkExistance(Email);
        JOptionPane.showMessageDialog(null , checkExistance);
        loginForm.setVisible(true);
    }
}
