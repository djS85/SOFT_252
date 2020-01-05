package users;

public class Patient implements User {

    private String username;
    private String first_name;
    private String last_name;
    private String address;
    
    private int ID;
    
    public Patient() {
    
        
    
    }

    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
