
package Creation;

import Entities.GameData;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CreationDB {
    FileWriter FW = null ;
    BufferedWriter BW = null ;
    Scanner Scan ;
    
    public void addToApprovalQueue(String gameName , String CategoryType , String TeacherEmail) throws IOException {
        FW = new FileWriter("Files\\Approval Queue.txt" , true);
        BW = new BufferedWriter(FW);
        String Game = gameName + "," + CategoryType + "," + TeacherEmail + "\n";
        BW.write(Game);
        BW.close();
    }
    
    public void createGamaFile(GameData Game) throws IOException {
        FW = new FileWriter("Files\\" + Game.getGameName() + ".txt");
        BW = new BufferedWriter(FW);
        BW.write(Game.toString());
        BW.close();
    }
    
    public void addQuestionstoGame(String Question  , String GameName) throws IOException {
        FW = new FileWriter("Files\\" + GameName + ".txt" , true);
        BW = new BufferedWriter(FW);
        BW.write(Question);
        BW.close();
    }
    
    public ArrayList<String> getGameState(String teacherEmail) throws FileNotFoundException {
        Scan = new Scanner(new File("Files\\Notifications.txt"));
        ArrayList<String> teacherNotifications = new ArrayList<>();
        ArrayList<String> Notifications = new ArrayList<>();
        while(Scan.hasNextLine()) {
            Notifications.add(Scan.nextLine());
        }
        for(String Line : Notifications) {
            String [] LineArr = Line.split(",");
            if(teacherEmail.equals(LineArr[0])) {
                teacherNotifications.add(LineArr[1]+","+LineArr[2]);
            }
        }
        return teacherNotifications;
    }
}
