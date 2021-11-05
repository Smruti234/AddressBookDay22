package com.AddressBook;

public class Person_Details {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private int zip;
    private String phoneNumber;
    private String email;

    public void FirstName(String firstName) {
        this.firstName = firstName;
    }

    public void LastName(String lastName) {
        this.lastName = lastName;
    }

    public void Address(String address) {
        this.address = address;
    }

    public void City(String city) {
        this.city = city;
    }

    public void State(String state) {
        this.state = state;
    }

    public void Zip(int zip) {
        this.zip = zip;
    }

    public void PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void Email(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person_Details{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}


