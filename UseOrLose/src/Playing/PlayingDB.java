
package Playing;

import Entities.GameData;
import Entities.MCQTemplate;
import Entities.TFTemplate;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PlayingDB {

    public ArrayList<String> getGameName(String CategoryType) throws FileNotFoundException {
        String categoryFile = "Files\\" + CategoryType + ".txt" ;
        Scanner Scan = new Scanner(new File(categoryFile));
        ArrayList<String> gameNames = new ArrayList<>();
        while(Scan.hasNextLine()) {
            String [] lineArr = Scan.nextLine().split(",");
            gameNames.add(lineArr[0]);
        }
        return gameNames ;
    }

    public ArrayList<String> categoryList = new ArrayList<>();

    public GameData getGameData(String GameName) throws FileNotFoundException {
        GameData game = new GameData();
        String gamePath = "Files\\" + GameName + ".txt";
        Scanner Scan = new Scanner(new File(gamePath));
        while (Scan.hasNextLine()) {
            String line = Scan.nextLine();
            String[] parts = line.split(",");
            game.setGameName(parts[0]);
            game.setTeacherName(parts[1]);
            game.setTeacherEmail(parts[2]);
            game.setTemplateType(parts[3]);
            game.setCategoryName(parts[4]);
            game.setGameTips(parts[5]);
            game.setNumOfLevel(Integer.parseInt(parts[6]));
            if (game.getTemplateType().equals("MCQ")) {
                for (int i = 0; i < game.getNumOfLevel(); i++) {
                    String Question = Scan.nextLine();
                    String[] Answers = Scan.nextLine().split(",");
                    String correctAnswer = Answers[0];
                    String Answer1 = Answers[1];
                    String Answer2 = Answers[2];
                    String Answer3 = Answers[3];
                    String Answer4 = Answers[4];
                    MCQTemplate temp = new MCQTemplate(Question, Answer1, Answer2, Answer3,
                            Answer4, correctAnswer);
                    game.addMCQQuestion(temp);
                }
            } else {
                for (int i = 0; i < game.getNumOfLevel(); i++) {
                    String question = Scan.nextLine();
                    String correctAnswer = Scan.nextLine();
                    TFTemplate temp = new TFTemplate(question, correctAnswer);
                    game.addTFQuestion(temp);
                }
            }
        }
        return game;
    }

    public void saveState(String GameName, String UserEmail, double Score) throws IOException {
        FileWriter FW = new FileWriter("Files\\UsersScore.txt", true);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.write(GameName + "," + UserEmail + "," + Score + "\n");
        BW.close();
        
    }

    void saveComment(String GameName, String TeacherEmail , String UserName, String Comment) throws IOException {
        FileWriter FW = new FileWriter("Files\\Comments.txt", true);
        try (BufferedWriter BW = new BufferedWriter(FW)) {
            BW.write(GameName + "," + TeacherEmail + "," + UserName + "," + Comment + "\n");
        }
    }
    
    public ArrayList<String> getComments(String teacherEmail) throws FileNotFoundException {
        
        Scanner Scan = new Scanner(new File("Files\\Comments.txt"));
        ArrayList<String> teacherComments = new ArrayList<>();
        ArrayList<String> Comments = new ArrayList<>();
        while(Scan.hasNextLine()) {
            Comments.add(Scan.nextLine());
        }
        for(String Line : Comments) {
            String [] LineArr = Line.split(",");
            if(teacherEmail.equals(LineArr[1])) {
                teacherComments.add(LineArr[0] + "," + LineArr[2] + "," + LineArr[3]);
            }
        }
        return teacherComments;
    }

    void addRate(String gameName , String categoryName , int Rate) throws IOException {
        FileWriter FW = new FileWriter("Files\\Rates.txt" , true);
        BufferedWriter BW = new BufferedWriter(FW);
        BW.write(gameName + "," + Rate + "\n");
        BW.close();
        ArrayList<String> gamesRate = new ArrayList<>();
        Scanner Scan = new Scanner(new File("Files\\Rates.txt"));
        while(Scan.hasNextLine()) {
            gamesRate.add(Scan.nextLine());
        }
        double Sum = 0 ;
        int Count = 0 ;
        for(String Line : gamesRate) {
            String [] lineArr = Line.split(",");
            if(lineArr[0].equals(gameName)) {
                Sum += Double.parseDouble(lineArr[1]);
                Count++ ;
            }
        }
        double gameRate = (double) Sum / (double) Count ;
        Scan = new Scanner(new File("Files\\" + categoryName + ".txt"));
        gamesRate = new ArrayList<>();
        while(Scan.hasNextLine()) {
            gamesRate.add(Scan.nextLine());
        }
        ArrayList<String> newGamesRate = new ArrayList<>();
        for(String Line : gamesRate) {
            String [] lineArr = Line.split(",");
            if(lineArr[0].equals(gameName)) {
                String newLine = lineArr[0]+ "," + gameRate ;
                newGamesRate.add(newLine);
            }
            else {
                newGamesRate.add(Line);
            }
        }
        FW = new FileWriter("Files\\" + categoryName + ".txt");
        BW = new BufferedWriter(FW);
        for(String Line : newGamesRate) {
            BW.write(Line + "\n");
        }
        BW.close();
    }

    public ArrayList<String> getUserScore(String userEmail) throws FileNotFoundException {
        Scanner Scan = new Scanner(new File("Files\\UsersScore.txt"));
        ArrayList<String> userScore = new ArrayList<>();
        ArrayList<String> Scores = new ArrayList<>();
        while(Scan.hasNextLine()) {
            Scores.add(Scan.nextLine());
        }
        for(String Line : Scores) {
            String [] LineArr = Line.split(",");
            if(userEmail.equals(LineArr[1])) {
                userScore.add(LineArr[0] + "," + LineArr[2]);
            }
        }
        return userScore;
    }
}
