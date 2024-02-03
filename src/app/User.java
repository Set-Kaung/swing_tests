package app;


public class User {
    private String StudentID;
    private char[] password;

    public User(String StudentID, char[] password){
        this.StudentID = StudentID;
        this.password = password;
    }

    public String getStudentID() {
        return StudentID;
    }
    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }
    public char[] getPassword() {
        return password;
    }
    public void setPassword(char[] password) {
        this.password = password;
    }


    // public void setID(UUID iD) {
    //     ID = iD;
    // }
    
    
}
