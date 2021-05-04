package rs.ac.uns.ftn.manager;


import rs.ac.uns.ftn.model.Role;
import rs.ac.uns.ftn.model.User;

import java.util.ArrayList;

public class MainClass {

    public static void main(String[] args) {
        //ovde ce poceti izvrsavanje aplikacije
        UserManagerService userManagerService = new UserManagerService();
        boolean isLogin = userManagerService.login("peraperic", "1111");
        String login = isLogin ? "je ulogovan" : "nije ulogovan";
        System.out.println("Korisnik " + login );

        User newUser = new User("mm", "1111", "mara", "maric", Role.USER, new ArrayList<>());

        boolean reg = userManagerService.register(newUser);
        System.out.println("Registrovan korisnik " + reg);



    }
}
