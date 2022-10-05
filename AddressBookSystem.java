package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookSystem {
    class Contacts {
        static ArrayList<String> contacts = new ArrayList<String>(7);

        static void createContact() {
            Scanner s1 = new Scanner(System.in);
            System.out.println("Enter the contact details  : ");
            System.out.println("Full Name Address City State Zipcode PhoneNo EmailId  : ");
            for (int i = 0; i < 7; i++) {
                String k = s1.nextLine();
                contacts.add(k);
            }
            System.out.println(" -------------------------------------------");
            System.out.println("contact details added :");
            System.out.println(contacts);
        }
        static void editContact() {
            Scanner sc = new Scanner(System.in);
            System.out.println(" ");
            System.out.println("Enter which detail you have to edit  : ");
            System.out.println("name or address or city or state or zip or phone or email  : ");

            /** editing specific detail which user want **/
            String detailToEdit = sc.nextLine();

            switch (detailToEdit) {
                case "full_name" :
                    System.out.println("Enter the name to edit  : ");
                    String fn = sc.nextLine();
                    contacts.set(0, fn);
                    break;
                case "address" :
                    System.out.println("Enter the address to edit  : ");
                    String a = sc.nextLine();
                    contacts.set(1, a);
                    break;
                case "city" :
                    System.out.println("Enter the name to edit  : ");
                    String city = sc.nextLine();
                    contacts.set(2, city);
                    break;
                case "state" :
                    System.out.println("Enter the name to edit  : ");
                    String state = sc.nextLine();
                    contacts.set(3, state);
                    break;
                case "zipcode" :
                    System.out.println("Enter the name to edit  : ");
                    String zc = sc.nextLine();
                    contacts.set(4, zc);
                    break;
                case "phone_no" :
                    System.out.println("Enter the name to edit  : ");
                    String pn = sc.nextLine();
                    contacts.set(5, pn);
                    break;
                case "email" :
                    System.out.println("Enter the name to edit  : ");
                    String email = sc.nextLine();
                    contacts.set(6, email);
                    break;
                default :
                    System.out.println("no edit match  : ");

            }

            System.out.println("----------------------------------------------------- ");
            System.out.println("edited contact details are :");
            System.out.println(contacts);

        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book System Program");
        Contacts.createContact();
    }
}
