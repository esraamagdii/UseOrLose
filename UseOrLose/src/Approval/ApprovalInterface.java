package Approval;

import Forms.ApprovalForm;
import Forms.HomePage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ApprovalInterface {

    ApprovalForm ApproveForm;
    ApprovalManager AppM;

    public ApprovalInterface() {
        AppM = new ApprovalManager();
    }

    public ArrayList<String> requestWaitingGames() throws FileNotFoundException, IOException {

        ArrayList<String> ApprovedTemp = AppM.RequestWaitingGameList();
        ArrayList<String> gamesName = new ArrayList<>();
        for (String gameName : ApprovedTemp) {
            String[] parts = gameName.split(",");
            gamesName.add(parts[0]);
        }
        return gamesName;
    }

    public void PressButtonSubmit(ArrayList<String> acceptedGames , ArrayList<String> rejectedGames) throws IOException {
        AppM.ApproveGame(acceptedGames, rejectedGames);
    }

}
