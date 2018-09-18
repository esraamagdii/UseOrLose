package Playing;

import Entities.GameData;
import Entities.MCQTemplate;
import Entities.TFTemplate;
import Login.LoginManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class PlayingManager {

    public static GameData game = new GameData();
    PlayingDB DB;

    public PlayingManager() {
        DB = new PlayingDB();
    }

    public PlayingDB getDB() {
        return DB;
    }

    public void setDB(PlayingDB DB) {
        this.DB = DB;
    }

    public void requestGameData(String GameName) throws FileNotFoundException {
        game = DB.getGameData(GameName);
    }

    public MCQTemplate GetMCQTemplatForm(int level) {
        MCQTemplate Level = game.getMCQQuestions().get(level);
        return Level;
    }

    public TFTemplate GetTFTemplate(int level) {
        TFTemplate Level = game.getTFQuestions().get(level);
        return Level;
    }

    public boolean checkAnswer(String Answer, int level) throws IOException {
        if (game.getTemplateType().equals("MCQ")) {
            MCQTemplate temp = game.getMCQQuestions().get(level);
            if (temp.getCorrectAnswer().equals(Answer)) {
                return true;
            }
        } else {
            TFTemplate temp = game.getTFQuestions().get(level);
            if (temp.getCorrectAnswer().equals(Answer)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<String> getGameList(String CategoryType) throws FileNotFoundException {
        ArrayList<String> gameNames = DB.getGameName(CategoryType);
        return gameNames;

    }

    void savaState(int score) throws IOException {
        double Score = ((double) score / (double) game.getNumOfLevel()) * 10;
        DB.saveState(game.getGameName(), LoginManager.user.getEmail(), Score);

    }
    public ArrayList<String> showUserScore() throws FileNotFoundException {
        ArrayList<String> userScore ;
        userScore = DB.getUserScore(LoginManager.user.getEmail());
        return userScore ;
    }
    void addComment(String Comment) throws IOException {
        DB.saveComment(game.getGameName(), game.getTeacherEmail(), LoginManager.user.getName(), Comment);
    }

    public ArrayList<String> showComments() throws FileNotFoundException {
        DB = new PlayingDB();
        ArrayList<String> teacherComments;
        String teacherEmail = LoginManager.user.getEmail();
        teacherComments = DB.getComments(teacherEmail);
        return teacherComments;
    }

    void calculateRate(int Rate) throws IOException {
        DB = new PlayingDB();
        DB.addRate(game.getGameName(), game.getCategoryName(), Rate);
    }
    
   
}
