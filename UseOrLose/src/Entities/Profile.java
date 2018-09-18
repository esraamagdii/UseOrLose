package Entities;


public class Profile {

    String Name ;
    String Password ;
    String Email ;
    String Gender ;
    String accountType ;
    int Age ;

    public Profile() {
    }

    public Profile(String Name, String Password, String Email, String Gender, String accountType, int Age) {
        this.Name = Name;
        this.Password = Password;
        this.Email = Email;
        this.Gender = Gender;
        this.accountType = accountType;
        this.Age = Age;
    }
    
    @Override
    public String toString() {
        return Name + "," + Password + "," + Email + "," + Gender + "," + accountType + "," + Age + "\n" ;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
    
    
    
   
}
