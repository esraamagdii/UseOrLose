package Login;

import Entities.Notification;
import Entities.Profile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LoginDB {

    public static String usersDB = "Files\\Users.txt";
    public static Scanner Scan;
    public static ArrayList<Profile> Users ;

    public Profile checkValidation(String Email, String Password) throws FileNotFoundException {

        Users = new ArrayList<>();
        Profile profile;
        Scan = new Scanner(new File(usersDB));
        while (Scan.hasNextLine()) {
            String Line = Scan.nextLine();
            String[] lineArray = Line.split(",");
            profile = new Profile(lineArray[0], lineArray[1], lineArray[2],
                     lineArray[3], lineArray[4], Integer.parseInt(lineArray[5]));
            Users.add(profile);
        }
        for (Profile user : Users) {
            if (user.getEmail().equals(Email) && user.getPassword().equals(Password)) {
                return user;
            }
        }
        return null;
    }

    public String checkExistance(String Email) throws FileNotFoundException {
        Users = new ArrayList<>();
        Profile profile ;
        Scan = new Scanner(new File(usersDB));
        while (Scan.hasNextLine()) {
            String Line = Scan.nextLine();
            String[] lineArray = Line.split(",");
            profile = new Profile(lineArray[0], lineArray[1], lineArray[2],
                     lineArray[3], lineArray[4], Integer.parseInt(lineArray[5]));
            Users.add(profile);
        }
        for (Profile user : Users) {
            if (user.getEmail().equals(Email)) {
                return "Check Your Email Address.";
            }
        }
        return "Your Email isn't Exist.";
    }
}
