package Creation;

import Entities.GameData;
import Entities.MCQTemplate;
import Entities.TFTemplate;
import Forms.GameDataForm;
import Forms.MCQForm;
import Forms.TFForm;
import Login.LoginManager;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class CreationManager {
    
    static GameData gameData;
    GameDataForm gameDataForm;
    TFForm TF;
    MCQForm MCQ;
    
    public CreationManager() {
        gameData = new GameData();
        gameDataForm = new GameDataForm();
        TF = new TFForm();
        MCQ = new MCQForm();
    }
    
    public GameData getGameData() {
        return gameData;
    }
    
    public void setGameData(GameData gameData) {
        CreationManager.gameData = gameData;
    }
    
    public GameDataForm getGDF() {
        return gameDataForm;
    }
    
    public void setGDF(GameDataForm GDF) {
        this.gameDataForm = GDF;
    }
    
    public GameDataForm getGameDataForm() {
        return gameDataForm;
    }
    
    public void setGameDataForm(GameDataForm gameDataForm) {
        this.gameDataForm = gameDataForm;
    }
    
    public TFForm getTF() {
        return TF;
    }
    
    public void setTF(TFForm TF) {
        this.TF = TF;
    }

    public MCQForm getMCQ() {
        return MCQ;
    }

    public void setMCQ(MCQForm MCQ) {
        this.MCQ = MCQ;
    }
    
    
    
    public void submitGameData(String Data) throws IOException {
        String[] dataArr = Data.split(",");
        gameData.setGameName(dataArr[0]);
        gameData.setTeacherName(dataArr[1]);
        gameData.setTeacherEmail(dataArr[2]);
        gameData.setTemplateType(dataArr[3]);
        gameData.setCategoryName(dataArr[4]);
        gameData.setGameTips(dataArr[5]);
        gameData.setNumOfLevel(Integer.parseInt(dataArr[6]));
        CreationDB DB = new CreationDB();
        addToDB();
        
    }
    
    public static void createGameQuestions(String Question) throws IOException {
      
        CreationDB DB = new CreationDB();
        if (gameData.getTemplateType().equals("MCQ")) {
            String[] Level = Question.split(",");
            MCQTemplate template = new MCQTemplate(Level[0], Level[1], Level[2], Level[3], Level[4], Level[5]);
            gameData.addMCQQuestion(template);
            String level = template.toString();
            DB.addQuestionstoGame(level , gameData.getGameName());
            
        } else if (gameData.getTemplateType().equals("TF")) {
            String[] Level = Question.split(",");
            TFTemplate template = new TFTemplate(Level[0], Level[1]);
            gameData.addTFQuestion(template);
            String level = template.toString();
            DB.addQuestionstoGame(level , gameData.getGameName());
        }   
    }
    
    public void addToDB() throws IOException {
        CreationDB DB = new CreationDB();
        DB.addToApprovalQueue(gameData.getGameName(), gameData.getCategoryName(), gameData.getTeacherEmail());
        DB.createGamaFile(gameData);
    }
    
    public ArrayList<String> showGameState() throws FileNotFoundException {
        CreationDB DB = new CreationDB();
        ArrayList<String> teacherNotifications ;
        String teacherEmail = LoginManager.user.getEmail() ;
        teacherNotifications = DB.getGameState(teacherEmail);
        return teacherNotifications ;
    }
}
