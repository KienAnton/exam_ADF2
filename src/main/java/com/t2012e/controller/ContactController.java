package com.t2012e.controller;

import com.t2012e.entity.Contact;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

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
        contact = new Contact(name, phone);
        list.add(contact);
    }

    public String findTelephoneNumber() {
        System.out.println("Pleaet enter name to search: ");
        String name = scanner.nextLine();
        String phone;
        phone = hashMap1.get(name);
        return phone;
    }


    public void display(HashMap<String, String> hashMap) {
        Set<String> keySet = hashMap.keySet();
        System.out.println("Address Book");
        for (String key : keySet) {
            System.out.println(key + " - " + hashMap.get(key));
        }
    }

    public HashMap<String, String> save(){
        for (int i = 0; i < list.size(); i++) {
            String key = list.get(i).getName();
            String phone = list.get(i).getPhone();
            hashMap1.put(key, phone);
        }
        return hashMap1;
    }
}
