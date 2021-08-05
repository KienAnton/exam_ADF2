package com.t2012e.entity;

public class Contact {
    private String name;
    private String phone;

    public Contact() {

    }

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString(){

        return String.format("%10s%10s%10s | %10s%15s%15s\n",
                "", name, "",
                "", phone, "");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
