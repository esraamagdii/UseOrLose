package Registration;

import Entities.Profile;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class RegistrationDB {
    
   
    public static String usersDB = "Files\\Users.txt" ;
    public static Scanner Scan ;
    
    public boolean checkExistance(String Email)  throws FileNotFoundException {

        ArrayList<Profile> Users = new ArrayList<>();
        Profile profile ;
        Scan = new Scanner(new File(usersDB));
        while(Scan.hasNextLine()) {
            String Line = Scan.nextLine();
            String [] lineArray = Line.split(",");
            profile = new Profile(lineArray[0] , lineArray[1] ,lineArray[2] 
                    ,lineArray[3] , lineArray[4] , Integer.parseInt(lineArray[5]));
            Users.add(profile);
        }
        for(Profile user : Users) {
            if(user.getEmail().equals(Email)) {
                return true ;
            }
        }
        return false ;
    }
    
    public void addToDB(String Data) throws IOException {
        FileWriter FW = new FileWriter(usersDB , true);
        try (BufferedWriter BW = new BufferedWriter(FW)) {
            BW.write(Data);
        }
    }
}
