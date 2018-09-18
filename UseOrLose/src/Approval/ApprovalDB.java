
package Approval;

import Entities.Notification;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;

public class ApprovalDB {

    public ArrayList<String> ApprovalGames;
    public static Scanner Scan;
    FileWriter FW;
    BufferedWriter BW;

    public ArrayList<String> loadWaitingGames() throws FileNotFoundException, IOException {

        ApprovalGames = new ArrayList<>();
        String ApprovalGamesDB = "Files\\Approval Queue.txt";
        Scan = new Scanner(new File(ApprovalGamesDB));
        while (Scan.hasNextLine()) {
            String game = Scan.nextLine();
            ApprovalGames.add(game);
        }
        FW = new FileWriter("Files\\Approval Queue.txt");
        FW.write("");
        return ApprovalGames;
    }

    public void writeNotification(Notification notify) throws IOException {
        FW = new FileWriter("Files\\Notifications.txt", true);
        BW = new BufferedWriter(FW);
        BW.write(notify.toString());
        BW.close();
    }

    public void addToCategory(String categoryName, String gameName) throws UnsupportedEncodingException, IOException {
        FW = new FileWriter("Files\\" + categoryName + ".txt", true);
        BW = new BufferedWriter(FW);
        BW.write(gameName + "," + 0.0 + "\n");
        BW.close();

    }
}
