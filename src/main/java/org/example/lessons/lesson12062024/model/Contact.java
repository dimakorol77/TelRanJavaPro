package org.example.lessons.lesson12062024.model;



public class Contact {
    private int id = 0;
    private String name;
    private String phoneNumber;
    private String email;


    public Contact( String name, String phoneNumber, String email) {
        this.id++;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
