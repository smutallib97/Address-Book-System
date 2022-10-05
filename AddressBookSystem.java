package com.bridgelabz;

import java.util.ArrayList;

public class AddressBookSystem {
    class Contacts {
        static void createContact(String full_name, String address, String city, String state, String zipCode, String mobile_No, String email) {
            ArrayList<String> firstContact = new ArrayList<String>(7);

            firstContact.add(full_name);
            firstContact.add(address);
            firstContact.add(city);
            firstContact.add(state);
            firstContact.add(zipCode);
            firstContact.add(mobile_No);
            firstContact.add(email);

            System.out.println(firstContact );

        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Program");
        Contacts.createContact("Sayyed Mutallib","Koregaon Bhima","Pune","Maharashtra","412216","9518553297","smutallib97@gmail.com");
    }
}
