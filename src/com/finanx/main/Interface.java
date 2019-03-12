package com.finanx.main;

import java.util.*;

public class Interface {
    Database database = new Database();


    public boolean addClient() {

        Scanner scanner = new Scanner(System.in);
        final String NAME;
        final String EMAIL;
        final String MOBILENO;

        System.out.println("Enter your name: ");
        NAME = scanner.nextLine();
        System.out.println("Enter your Email: ");
        EMAIL = scanner.nextLine();
        System.out.println("Enter your mobile number without dashes: ");
        MOBILENO = scanner.nextLine();


        Client newClient = new Client(NAME, EMAIL, MOBILENO);

        // If client already exists, error
        if (database.CLIENTLIST.containsKey(newClient)) {
            System.out.println("The client already exists in the databse!");
            return false;
        }
        // If client does not exist, append to CLIENTLIST
        else {
            Map<Integer, List<Card>> ClientData = new HashMap<Integer, List<Card>>();
            List<Card> ListOfCards = new ArrayList<Card>();

            // ListOfCards = null;

            int clientId = database.CLIENTLIST.size() + 1;
            ClientData.put(clientId, ListOfCards);

            database.CLIENTLIST.put(newClient, ClientData);

            if (database.CLIENTLIST.containsKey(newClient)) {
                return true;
            } else {
                return false;
            }
        }
    }

    // remove CLIENT
    //

    public boolean removeClient() {
        return false;
    }


}
