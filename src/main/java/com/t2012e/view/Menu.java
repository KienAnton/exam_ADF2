package com.t2012e.view;

import com.t2012e.controller.ContactController;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public ContactController controller = new ContactController();
    public void generateMenu() {
        while (true){
            System.out.println("Address Book");
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
                    controller.addContact();
                    break;
                case 2:
                    System.out.println("Found contact with information:");
                    System.out.println(controller.findByName());
                    break;
                case 3:
                    controller.display();
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
