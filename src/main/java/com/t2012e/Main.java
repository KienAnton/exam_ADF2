package com.t2012e;

import com.t2012e.controller.ContactController;
import com.t2012e.entity.Contact;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        ContactController contactController = new ContactController();
        while (true){
            System.out.println("----------------------------");
            System.out.println("1. Add new contact.");
            System.out.println("2. Find a contact by name.");
            System.out.println("3. Display contacts.");
            System.out.println("4. Exit");
            System.out.println("----------------------------");
            System.out.println("Please enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    contactController.addContact();
                    contactController.save();
                    break;
                case 2:
                    System.out.println("Found phone number: " + contactController.findTelephoneNumber());;
                    break;
                case 3:
                    contactController.display(contactController.save());
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice. Please choose between 1-4");
                    break;
            }
            if (choice == 0){
                break;
            }
        }
    }
}
