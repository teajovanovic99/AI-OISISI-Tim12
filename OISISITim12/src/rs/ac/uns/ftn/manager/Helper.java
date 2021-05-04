package rs.ac.uns.ftn.manager;

import rs.ac.uns.ftn.model.Role;
import rs.ac.uns.ftn.model.Ticket;
import rs.ac.uns.ftn.model.User;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Helper {

    //iscitavnje korisnika

    public static ArrayList<User> readingUsers(){
        ArrayList<User> users = new ArrayList<>();
        //za sad dummy podaci
        users.add(new User("mikamikic", "1111", "Mika", "Mikic", Role.USER, new ArrayList<>()));
        users.add(new User("peraperic", "1111", "Pera", "Peric", Role.USER, new ArrayList<>()));


        try {
            File myObj = new File("users.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
                //ovde sad treba splitovati liniju i napraviti korisnik
                User u = createUser(data);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return users;
    }

    private static User createUser(String data) {
        User u = new User();
        //                                              opcioni deo
        //jedna linija je mikamikic|1111|Mika|Mikic|USER|id1; id2..
        String[] tokeni = data.split("\\|");
//        System.out.println(tokeni[0]);
        u.setUsername(tokeni[0].trim());
        u.setPassword(tokeni[1].trim());
        u.setName(tokeni[2].trim());
        u.setSurname(tokeni[3].trim());
        u.setRole(Role.valueOf(tokeni[4].trim()));
        if (tokeni[5].equals("")){
            System.out.println("nema karti");
            u.setTickets(new ArrayList<>());
        }else {
            //imaju karte sad splitujemo po ;
            String[] ticket_tokens = tokeni[5].trim().split(";"); //niz id-eva karti i te karte treba da se pronadju u listi karata
            ArrayList<Ticket> tickets = readingTickets();

        }

        return u;
    }

    private static ArrayList<Ticket> readingTickets() {
        return  null;
    }

    public static void writeUsers(ArrayList<User> users){
        //upisu korisnika u fajl
        String zapis = "";
        for(User u : users){
            zapis += u.getUsername() +"|"+u.getPassword()+"|"+u.getName()+"|"+u.getSurname()+"|"+u.getRole().toString()+"|";
            for (Ticket t : u.getTickets()){
                zapis += t.getId() +";" ;
            }
            zapis += "\n";
        }
        try {
            FileWriter myWriter = new FileWriter("users.txt");
            myWriter.write(zapis);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
