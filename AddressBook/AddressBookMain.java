package com.AddressBook;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class AddressBookMain {
    static Dictionary<String, ArrayList<ContactStore>> dictionary  = new Hashtable<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the number of addressbooks ");
        int addressBookLimit = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= addressBookLimit; i++) {
            System.out.println("Enter address book name");
            String name = scanner.nextLine();
            ArrayList<ContactStore> arrayList = new <ContactStore>ArrayList();
            boolean check = true;
            while (check) {
                ContactStore contactStore = new ContactStore();
                System.out.printf("Enter 1.Add new Contact\n 2.Edit the Details\n 3.Delete the Contact\n 4.Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> {
                        contactStore.setContactDetails();
                        boolean checkDuplicate = contactStore.searchForDuplication(arrayList, contactStore);
                        if(!checkDuplicate)
                            arrayList.add(contactStore);
                        else
                            System.out.println("Contact already Exists");
                    }
                    case 2 -> contactStore.editDetails(arrayList);
                    case 3 -> contactStore.deleteDetails(arrayList);
                    case 4 -> check = false;
                }
            }
            dictionary.put(name, arrayList);
        }
        System.out.println(dictionary);
    }
}