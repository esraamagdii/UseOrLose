package Entities;

import java.util.ArrayList;

public class GameData {

    private String gameName;
    private String teacherName ;
    private String teacherEmail ;
    private String templateType;
    private String categoryName;
    private String gameTips;
    private int numOfLevel ;
    private ArrayList <TFTemplate> TFQuestions ;
    private ArrayList <MCQTemplate> MCQQuestions ;
    
    public GameData() {
        TFQuestions = new ArrayList<>();
        MCQQuestions = new ArrayList<>();
    }

    public GameData(String gameName, String teacherName, String teacherEmail, 
            String templateType, String categoryName ,String gameTips, int numOfLevel) {
        this.gameName = gameName;
        this.teacherName = teacherName;
        this.teacherEmail = teacherEmail;
        this.templateType = templateType;
        this.categoryName = categoryName;
        this.gameTips = gameTips;
        this.numOfLevel = numOfLevel;        
    }


    @Override
    public String toString() {
        return gameName + "," + teacherName + "," + teacherEmail + "," + templateType + "," 
                + categoryName + "," + gameTips + "," + numOfLevel + "\n" ;
    }
    
    public String writeQuestions() {
        String Str = "";
        if(templateType.equals("TF")) {
            for(TFTemplate Question : TFQuestions) {
                Str += Question.toString();
            }
        }
        else if(templateType.equals("MCQ")) {
            for(MCQTemplate Question : MCQQuestions) {
                Str += Question.toString();
            }
        }
        return Str ;
    }
    
    
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getNumOfLevel() {
        return numOfLevel;
    }

    public void setNumOfLevel(int numOfLevel) {
        this.numOfLevel = numOfLevel;
    }

    public String getGameTips() {
        return gameTips;
    }

    public void setGameTips(String gameTips) {
        this.gameTips = gameTips;
    }

    public ArrayList<TFTemplate> getTFQuestions() {
        return TFQuestions;
    }

    public void setTFQuestions(ArrayList<TFTemplate> TFQuestions) {
        this.TFQuestions = TFQuestions;
    }

    public ArrayList<MCQTemplate> getMCQQuestions() {
        return MCQQuestions;
    }

    public void setMCQQuestions(ArrayList<MCQTemplate> MCQQuestions) {
        this.MCQQuestions = MCQQuestions;
    }
    
    
    public void addMCQQuestion(MCQTemplate Question) {
        MCQQuestions.add(Question);
    }
    public void addTFQuestion(TFTemplate Question) {
        TFQuestions.add(Question);
    }

    public void setGameComments(ArrayList<Comment> gamesComments) {
    }

    public int getGameScore() {
        return 0;
    }
    public void setGameScore(int score) {
    }
}
