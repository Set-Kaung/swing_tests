package app;


public class User {
    private String StudentID;
    private char[] Password;


    public User(String studentID, char[] password) {
        this.StudentID = studentID;
        this.Password = password;
    }
    public String getStudentID() {
        return StudentID;
    }
    public void setStudentID(String studentID) {
        StudentID = studentID;
    }
    public char[] getPassword() {
        return Password;
    }
    public void setPassword(char[] password) {
        Password = password;
    }

    
}
