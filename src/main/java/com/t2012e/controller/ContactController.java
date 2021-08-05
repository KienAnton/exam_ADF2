package com.t2012e.controller;

import com.t2012e.entity.Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ContactController {
    Scanner scanner = new Scanner(System.in);
    public HashMap<String, String> hashMap1 = new HashMap<>();
    public ArrayList<Contact> list = new ArrayList<>();
    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Please enter name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter phone: ");
        String phone = scanner.nextLine();
        Contact contact1 = new Contact(name, phone);
        list.add(contact1);
    }

    public void display(){
        {
            System.out.printf("%10s%10s%10s | %10s%15s%10s\n",
                    "", "Name", "",
                    "", "Phone", "");
            System.out.println("--------------------------------------------------------------------------------");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).toString());
            }
        }
    }


    public Contact findByName() {
        System.out.println("Pleaet enter name to search: ");
        String name = scanner.nextLine();
        Contact contact = null;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getName().equals(name)) {
                contact = list.get(i);
                break;
            }
        }
        return contact;
    }

    public HashMap<String, String> hashMap(){
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i).getName();
            String phone = list.get(i).getPhone();
            hashMap1.put(key, phone);
        }
        return hashMap1;
    }
}
