package app;

import java.util.HashMap;

public class App {
    private static App instance;
    private HashMap<String,User> Users;

    private App(){
        Users = new HashMap<>();
    }

    public static App getInstance(){
        if(instance == null){
            instance = new App();
        }
        return instance;
    }

    public boolean addUsers(User u){
        this.Users.put(u.getStudentID(), u);
        return true;
    }

    public boolean removeUsers(User u){
        String id = u.getStudentID();
        if(!this.Users.containsKey(id)){
            return false;
        }
        this.Users.remove(id);
        return true;
    }

    public User getUser(String studentID){
        if(!this.Users.containsKey(studentID)){
            return null;
        }
        return this.Users.get(studentID);

    }
}
