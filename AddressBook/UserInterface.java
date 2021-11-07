package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    void print(ArrayList<AddressBook> arrayList) {
        for (AddressBook s : arrayList) {
            System.out.println(s);
        }
    }

    void enterDetails(AddressBook contact) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstName");
        contact.setFirstName(sc.nextLine());
        System.out.println("Enter lastName");
        contact.setLastName(sc.nextLine());
        System.out.println("Enter Address");
        contact.setAddress(sc.nextLine());
        System.out.println("Enter city");
        contact.setCity(sc.nextLine());
        System.out.println("Enter state");
        contact.setState(sc.nextLine());
        System.out.println("Enter Zip Code");
        contact.setZipCode(sc.nextLine());
        System.out.println("Enter PhoneNumber");
        contact.setPhoneNumber(sc.nextLine());
        System.out.println("Enter Email");
        contact.setEmail(sc.nextLine());
    }
}
