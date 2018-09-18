package Playing;

import Entities.MCQTemplate;
import Entities.TFTemplate;
import Forms.CategoryListForm;
import Forms.GameListForm;
import Forms.MCQPlaying;
import Forms.NotificationsForm;
import Forms.TFPlaying;
import Forms.TeacherForm;
import Login.LoginManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PlayingInterface {

    PlayingManager PM = new PlayingManager();

    MCQPlaying MCQ = new MCQPlaying();
    TFPlaying TF = new TFPlaying();
    public static int level = 0;
    public static int score = 0;

    public PlayingInterface() {

        PM = new PlayingManager();
    }

    public void ChooseGame(String GameName) throws IOException {
        PM.requestGameData(GameName);
        ShowGameTips();
        ShowGameLevel();
    }

    public void ShowGameTips() {
        String gameTips = PlayingManager.game.getGameTips();
        JOptionPane.showMessageDialog(null, gameTips);
    }

    public void ShowGameLevel() throws IOException {

        if (level < PlayingManager.game.getNumOfLevel()) {
            if (PlayingManager.game.getTemplateType().equals("MCQ")) {
                MCQTemplate MCQLevel;
                MCQLevel = PM.GetMCQTemplatForm(level);
                MCQ.setLevel(MCQLevel.getQuestion(), MCQLevel.getAnswers()[0], MCQLevel.getAnswers()[1],
                        MCQLevel.getAnswers()[2], MCQLevel.getAnswers()[3]);
                MCQ.setVisible(true);
            } else {
                TFTemplate TFLevel;
                TFLevel = PM.GetTFTemplate(level);
                TF.setLevel(TFLevel.getQuestion());
                TF.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "You Have Answered " + score + " Questions From " + PM.game.getNumOfLevel());
            if (LoginManager.user != null) {
                PM.savaState(score);
                int Choice = JOptionPane.showConfirmDialog(null, "Would you evaluate the game?", "Evaluation Form", JOptionPane.YES_NO_OPTION);
                if (Choice == JOptionPane.YES_OPTION) {
                    String Comment = JOptionPane.showInputDialog("Add Comment.");
                    PM.addComment(Comment);
                    int gameRate = Integer.parseInt(JOptionPane.showInputDialog("Please, Rate The Game From 1 to 5."));
                    PM.calculateRate(gameRate);
                }
            }
            level = 0;
            score = 0;
            CategoryListForm Form = new CategoryListForm();
            Form.setVisible(true);
        }
    }

    public void insertAnswer(String Answer) throws IOException {
        boolean checkAnswer = PM.checkAnswer(Answer, level);
        if (checkAnswer == true) {
            ++score;
            ShowNextLevel();
        } else {
            JOptionPane.showMessageDialog(null, "Your Answer Is Wrong!");
            ShowNextLevel();
        }
    }

    public void ShowNextLevel() throws IOException {
        level++;
        ShowGameLevel();
    }

    public void chooseCategory(String categoryType) throws FileNotFoundException {
        ArrayList<String> gameNames = PM.getGameList(categoryType);
        GameListForm Form = new GameListForm();
        Form.BuildForm(gameNames);
    }

    public void showComments() throws FileNotFoundException {
        ArrayList<String> teacherComments;
        teacherComments = PM.showComments();
        if (!teacherComments.isEmpty()) {
            NotificationsForm Form = new NotificationsForm();
            Form.Comments(teacherComments);
        } else {
            TeacherForm Form = new TeacherForm();
            Form.setVisible(true);
            JOptionPane.showMessageDialog(null, "There is no notifications for you.");
        }
    }

    public void showScore() throws FileNotFoundException {
        if (LoginManager.user != null) {
            ArrayList<String> userScore;
            userScore = PM.showUserScore();
            if (!userScore.isEmpty()) {
                NotificationsForm Form = new NotificationsForm();
                Form.Scores(userScore);
            } else {
                JOptionPane.showMessageDialog(null, "There is no notifications for you.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "There is no notifications for you.");
        }
    }

}
