package com.company;

public class User {
    private static int userCount = 0;
    private String firstName;
    private String lastName;
    private String address;
    private int userId;

    User(String firstName, String lastName, String address, int userId) {
        int var10000 = userCount++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String toString() {
        return this.lastName + ", " + this.firstName + ", " + this.userId + ", " + this.address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public int getUserId() {
        return this.userId;
    }
}