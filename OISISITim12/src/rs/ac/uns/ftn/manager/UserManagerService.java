package rs.ac.uns.ftn.manager;

import rs.ac.uns.ftn.model.User;

import java.util.ArrayList;

public class UserManagerService {
    private ArrayList<User> users;

    public UserManagerService() {
        this.users = Helper.readingUsers();
    }

    //login

    public boolean login(String username, String password){
        for(User u : this.users){
            System.out.println(u);
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                return true;
            }
        }

        return false;
    }

    public boolean register(User user){
        for (User u : this.users){
            if (u.getUsername().equals(user.getUsername())){
                //vec imamo korisnika sa istim username-om
                return false;
            }
        }

        //sacuvamo korisnika u fajl
        this.users.add(user);
        Helper.writeUsers(users);
        return true;
    }
}
