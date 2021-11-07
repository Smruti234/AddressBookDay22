package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook contact = new AddressBook();
        ContactStore contactStore = new ContactStore();
        UserInterface userInterface = new UserInterface();
        Scanner scanner = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Enter choice 1.Add the new contact\n 2.Edit Existing contact\n 3.exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1 -> {
                    AddressBook newContact = new AddressBook();
                    userInterface.enterDetails(newContact);
                    contactStore.add(newContact);
                    System.out.println("Contact List after add");
                    userInterface.print(contactStore.getContactList());
                }
                case 2 -> {
                    contactStore.edit();
                    System.out.println("Contact List after edit");
                    userInterface.print(contactStore.getContactList());
                }
                case 3 ->
                        check = false;
            }
        }
    }
}


