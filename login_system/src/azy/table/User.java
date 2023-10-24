package azy.table;

public class User {
    private String Username;
    private String pass;
    public User(){
    	
    }    
    public User(String Username,String pass){
        this.Username = Username;
        this.pass = pass;
    }
    public String getUsername() {
        return Username;
    }

    public String getPass() {
        return pass;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
