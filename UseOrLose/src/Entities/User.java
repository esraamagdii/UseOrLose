package Entities;


public class User {
	Profile profile ;

	public User(Profile profile) {
		super();
		this.profile = profile;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	} 
	
}
