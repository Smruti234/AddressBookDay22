package com.AddressBook;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to AddressBook Program");
        Dictionary dictionary = new Hashtable();
        System.out.println("Enter number of addressbooks u want to create");
        Scanner scanner = new Scanner(System.in);
        int noOfAddressBooks = scanner.nextInt();
        for (int i = 0; i < noOfAddressBooks; i++) {
            System.out.println("enter name of addressbook");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();

            AddressBook addressBook1 = new AddressBook();

            ContactStore contactStore = new ContactStore();
            UserInterface user = new UserInterface();

            boolean check = true;
            while (check) {
                System.out.println(
                        "Enter choice 1.Add the new contact\n 2.Edit Existing contact\n 3.Remove the contact\n ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> {
                        AddressBook addressBook = new AddressBook();
                        user.enterDetails(addressBook);
                        contactStore.add(addressBook);
                        System.out.println("Contact after adding");
                        user.print(contactStore.getContactList());
                    }
                    case 2 -> {
                        contactStore.edit();
                        System.out.println("Contact List after edit");
                        user.print(contactStore.getContactList());
                    }
                    case 3 -> {
                        contactStore.remove();
                        System.out.println("Contact List after deletion");
                        user.print(contactStore.getContactList());
                    }
                    default -> check = false;
                }

            }
            dictionary.put(name, addressBook1);
        }
    }
}