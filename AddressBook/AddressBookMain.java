package com.AddressBook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        Person_Details person = new Person_Details();
        person.FirstName("Smruti");
        person.LastName("Lenka");
        person.Email("lenkasmruti123@gmail.com");
        person.State("ODISHA");
        person.Address("Artung");
        person.PhoneNumber("7504614661");
        person.Zip(756046);
        person.City("bhadrak");
        System.out.println(person.toString());
    }
}
