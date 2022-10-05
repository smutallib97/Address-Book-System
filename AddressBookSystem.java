package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
    class Contacts {
        static void createContact() {
            ArrayList<String> firstContact = new ArrayList<String>(7);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the contact details  : ");
            System.out.println("Name Address City State Zipcode PhoneNo EmailId  : ");
            for (int i = 0; i < 7; i++) {
                String k = sc.nextLine();
                firstContact.add(k);
            }
            System.out.println(firstContact );
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Program");
        Contacts.createContact();
    }
}
