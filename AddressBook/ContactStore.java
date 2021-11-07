package com.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactStore {
    private ArrayList<AddressBook> contactList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<AddressBook> getContactList() {
        return contactList;
    }

    public void add(AddressBook contact) {
        contactList.add(contact);
    }

   public void edit() {
        System.out.println("Enter name of contact you want to sell");
        String name = scanner.nextLine();
        for (AddressBook addressBook : contactList) {
            if (addressBook.getFirstName().equalsIgnoreCase(name)) {
                boolean check = true;
                while (check) {
                    System.out.println("Edit Options 1.firstName 2.lastName 3.address 4.city 5.state 6.zip 7.phoneNumber 8.email 9.exit");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1 -> {
                            System.out.println("Enter your new firstName :");
                            String firstName = scanner.nextLine();
                            addressBook.setFirstName(firstName);
                        }
                        case 2 -> {
                            System.out.println("Enter your new lastName : ");
                            String lastName = scanner.nextLine();
                            addressBook.setLastName(lastName);
                        }
                        case 3 -> {
                            System.out.println("Enter your new address :");
                            String address = scanner.nextLine();
                            addressBook.setAddress(address);
                        }
                        case 4 -> {
                            System.out.println("Enter your new city : ");
                            String city = scanner.nextLine();
                            addressBook.setCity(city);
                        }
                        case 5 -> {
                            System.out.println("Enter your new state :");
                            String state = scanner.nextLine();
                            addressBook.setCity(state);
                        }
                        case 6 -> {
                            System.out.println("Enter your new zip : ");
                            String zip = scanner.nextLine();
                            addressBook.setZipCode(zip);
                        }
                        case 7 -> {
                            System.out.println("Enter your new phoneNumber :");
                            String phoneNumber = scanner.nextLine();
                            addressBook.setPhoneNumber(phoneNumber);
                        }
                        case 8 -> {
                            System.out.println("Enter your new email : ");
                            String email = scanner.nextLine();
                            addressBook.setEmail(email);
                        }
                        default -> check = false;
                    }
                }
            }
        }
    }
}
