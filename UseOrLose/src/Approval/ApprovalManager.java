/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Approval;

import Entities.Notification;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ApprovalManager {

    public Notification notification;
    ApprovalDB DB;
    public static ArrayList<String> ApprovedTemp;

    public ApprovalManager() {
        DB = new ApprovalDB();
        ApprovedTemp = new ArrayList<>();
    }

    public ArrayList<String> RequestWaitingGameList() throws FileNotFoundException, IOException {
        ApprovedTemp = DB.loadWaitingGames();
        return ApprovedTemp;
    }

    public void ApproveGame(ArrayList<String> acceptedGames, ArrayList<String> rejectedGames) throws IOException {
        for (String gameName : acceptedGames) {
            for (String gameData : ApprovedTemp) {
                String[] temp = gameData.split(",");
                if (temp[0].equals(gameName)) {
                    addToApproveGames(temp[0], temp[1], temp[2]);
                }
            }
        }
        for (String gameName : rejectedGames) {
            for (String gameData : ApprovedTemp) {
                String[] temp = gameData.split(",");
                if (temp[0].equals(gameName)) {
                    addToIgnoredGames(temp[0], temp[2]);
                }
            }
        }
    }

    public void addToApproveGames(String gameName, String categoryType, String teacherEmail) throws IOException {
        notification = new Notification(teacherEmail, gameName, "Accepted.");
        DB.writeNotification(notification);
        DB.addToCategory(categoryType, gameName);
    }

    private void addToIgnoredGames(String gameName, String teacherEmail) throws IOException {
        notification = new Notification(teacherEmail, gameName, "Rejected.");
        DB.writeNotification(notification);
    }

}
