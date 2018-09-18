package Creation;

import Forms.GameDataForm;
import Forms.MCQForm;
import Forms.NotificationsForm;
import Forms.TFForm;
import Forms.TeacherForm;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CreationInterface {

    CreationManager CM;
    GameDataForm gameDataForm;
    public static int Count = 0;

    public CreationInterface() {
        CM = new CreationManager();
    }

    public void getCreationForm() {
        gameDataForm.setVisible(true);
    }

    public static void createQuestion() throws IOException {
        Count++;
        if (Count <= CreationManager.gameData.getNumOfLevel()) {
            getTemplate();
        }
        else {
            Count = 0 ;
            JOptionPane.showMessageDialog(null , "Your Game Was Created Successufuly.");
            TeacherForm Form = new TeacherForm();
            Form.setVisible(true);
        }
    }

    public static void getTemplate() throws IOException {
        if ("MCQ".equals(CreationManager.gameData.getTemplateType())) {
            MCQForm Form = new MCQForm();
            Form.setVisible(true);
        } else if ("TF".equals(CreationManager.gameData.getTemplateType())) {
            TFForm Form = new TFForm();
            Form.setVisible(true);
        }
    }

    public void sumbitGameData(String Data) throws IOException {
        CM.submitGameData(Data);
        createQuestion();
    }

    public static void addLevel(String Question) throws IOException {
        CreationManager.createGameQuestions(Question);
        createQuestion();
    }

    public void showGameState() throws FileNotFoundException {
        ArrayList<String> teacherNotifications;
        teacherNotifications = CM.showGameState();
        if(!teacherNotifications.isEmpty()) {
            NotificationsForm Form = new NotificationsForm();
            Form.GamesState(teacherNotifications);
        }
        else {
            TeacherForm Form = new TeacherForm();
            Form.setVisible(true);
            JOptionPane.showMessageDialog(null , "There is no notifications for you.");
        }
    }
}
