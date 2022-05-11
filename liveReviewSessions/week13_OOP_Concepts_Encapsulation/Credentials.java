package week13_OOP_Concepts_Encapsulation;

public class Credentials {

    private String userName = "A12345678";
    private String password = "Cydeo123";

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String newPassword) {
        if(true) {
            this.password = newPassword;
        }
        System.exit(-1);
    }

}
