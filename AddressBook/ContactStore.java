package com.AddressBook;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactStore extends AddressBook {
    Scanner scanner = new Scanner(System.in);

    public void setContactDetails() {
        System.out.println("enter the First Name");
        setFirstName(scanner.nextLine());
        System.out.println("enter the Last Name");
        setLastName(scanner.nextLine());
        System.out.println("enter the Address Name");
        setAddress(scanner.nextLine());
        System.out.println("Enter city");
        setCity(scanner.nextLine());
        System.out.println("enter the State Name");
        setState(scanner.nextLine());
        System.out.println("enter the Phone Number");
        setPhoneNumber(scanner.nextLine());
        System.out.println("enter the ZipCode");
        setZip(scanner.nextLine());
        System.out.println("enter the Email");
        setEmail(scanner.nextLine());
    }

    public void editDetails(ArrayList<ContactStore> contact) {
        System.out.println("Enter the name to edit");
        String name = scanner.nextLine();
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFirstName().equals(name)) {
                boolean check = true;
                while (check) {
                    System.out.printf("enter 1.First Name\n 2.Last Name\n 3.Address\n 4.City\n 5.State\n 6.PhoneNumber\n 7.PinCode\n 8.Email\n 9.Exit");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.println("enter new first name");
                            String firstName = scanner.nextLine();
                            contact.get(i).setFirstName(firstName);
                            break;
                        case 2:
                            System.out.println("enter the new Last name");
                            String lastName = scanner.nextLine();
                            contact.get(i).setLastName(lastName);
                            break;
                        case 3:
                            System.out.println("enter new Address");
                            String address = scanner.nextLine();
                            contact.get(i).setAddress(address);
                            break;
                        case 4:
                            System.out.println("enter new City");
                            String city = scanner.nextLine();
                            contact.get(i).setCity(city);
                            break;
                        case 5:
                            System.out.println("enter new State");
                            String state = scanner.nextLine();
                            contact.get(i).setState(state);
                            break;
                        case 6:
                            System.out.println("enter new PhoneNumber");
                            String phoneNumber = scanner.nextLine();
                            contact.get(i).setPhoneNumber(phoneNumber);
                            break;
                        case 7:
                            System.out.println("enter new PinCode");
                            String pin = scanner.nextLine();
                            contact.get(i).setZip(pin);
                            break;
                        case 8:
                            System.out.println("enter new Email");
                            String email = scanner.nextLine();
                            contact.get(i).setEmail(email);
                            break;
                        case 9:
                            check = false;
                    }
                }

            } else
                System.out.println("Your name is not matched");
        }
    }

    public void deleteDetails(ArrayList<ContactStore> contact) {
        System.out.println("enter the name");
        String name = scanner.nextLine();
        for (int i = 0; i < contact.size(); i++) {
            if (contact.get(i).getFirstName().equals(name)) {
                contact.remove(i);
            }
        }
    }

    public boolean searchForDuplication(ArrayList<ContactStore> contactStores, ContactStore contact) {
        boolean check = false;
        for (ContactStore contactStore : contactStores) {
            if (contact.getFirstName().equalsIgnoreCase(contactStore.getFirstName()))
                check = true;
        }
        return check;
    }

    public static void search(Hashtable<Integer, ArrayList<ContactStore>> dictionary){
        System.out.println("Enter state name");
        Scanner scanner = new Scanner(System.in);
        String state = scanner.nextLine();
        System.out.println("Enter city name");
        String city = scanner.nextLine();
        long count1 = 0;
        long count2 = 0;
        System.out.println("Persons with State name :" + state);
        for (int i = 1; i <= dictionary.size(); i++) {
            List<ContactStore> personWithState = dictionary.get(i).stream().filter(s -> s.getState().equalsIgnoreCase(state)).collect(Collectors.toList());
            System.out.println(personWithState);
            long count = dictionary.get(i).stream().filter(s -> s.getState().equalsIgnoreCase(state)).count();
            count1 = count1 + count;
        }
        System.out.println("No.of Persons in State " + state + " are " + count1);
        System.out.println("Persons with City name :" + city);
        for (int i = 1; i <= dictionary.size(); i++){
            List<ContactStore> personWithCity = dictionary.get(i).stream().filter(c -> c.getCity().equalsIgnoreCase(city)).collect(Collectors.toList());
            System.out.println(personWithCity);
            long count = dictionary.get(i).stream().filter(c -> c.getCity().equalsIgnoreCase(city)).count();
            count2 = count2 + count;
        }
        System.out.println("No.of persons in City " + city + " are " + count2);
    }

    public static void sort(Hashtable<Integer,ArrayList<ContactStore>> dictionary){
        for (int i = 1; i <= dictionary.size(); i++){
            List<ContactStore> list = dictionary.get(i).stream().sorted(Comparator.comparing(AddressBook::getFirstName)).collect(Collectors.toList());
            System.out.println(list);
        }
    }
}
