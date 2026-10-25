package com.example.demo;



public class User implements Notifiable {

    private String id;
    private String name;
    private String email;
    private int phone;

    public User(String id, String name, String email, int phone){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void sendNotification(String message){
        System.out.println( message +" "+ email + "Bạn nhận đc 1 thông báo " );
    }
}

