package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        return st;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        ArrayList<String> addressList = new ArrayList<>();

        Person_Details personOne = new Person_Details();
        System.out.println("Please Enter the Name :");
        personOne.setFirstName(userInput());
        System.out.println("Please Enter Last Name : ");
        personOne.setLastName(userInput());
        System.out.println("Please Enter Address : ");
        personOne.setAddress(userInput());
        System.out.println("Please Enter City : ");
        personOne.setCity(userInput());
        System.out.println("Please Enter State : ");
        personOne.setState(userInput());
        System.out.println("Please Enter Zip Code : ");
        personOne.setZipCode(userInput());
        System.out.println("Please Enter Phone Number : ");
        personOne.setPhoneNumber(userInput());
        System.out.println("Please Enter Email : ");
        personOne.setEmail(userInput());
        System.out.println(personOne);

        System.out.println("Enter the Second Person Details");

        Person_Details personTwo = new Person_Details();
        System.out.println("Please Enter the Name :");
        personTwo.setFirstName(userInput());
        System.out.println("Please Enter Last Name : ");
        personTwo.setLastName(userInput());
        System.out.println("Please Enter Address : ");
        personTwo.setAddress(userInput());
        System.out.println("Please Enter City : ");
        personTwo.setCity(userInput());
        System.out.println("Please Enter State : ");
        personTwo.setState(userInput());
        System.out.println("Please Enter Zip Code : ");
        personTwo.setZipCode(userInput());
        System.out.println("Please Enter Phone Number : ");
        personTwo.setPhoneNumber(userInput());
        System.out.println("Please Enter Email : ");
        personTwo.setEmail(userInput());
        System.out.println(personTwo);

    }
}





