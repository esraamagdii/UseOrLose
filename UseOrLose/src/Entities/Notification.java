package Entities;


public class Notification {
	private String GameName ; 
	private String State ;
        private String UserName ;

    public Notification() {
    }

    public Notification(String UserName ,String GameName, String State) {
        this.GameName = GameName;
        this.State = State;
        this.UserName = UserName;
    }


    @Override
    public String toString() {
        return  UserName + "," + GameName + "," + State + "\n";
    }

    public String getGameName() {
        return GameName;
    }

    public String getState() {
        return State;
    }

    public String getUserName() {
        return UserName;
    }
	
        
	
}
