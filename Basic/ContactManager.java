package com.madesh.demo;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    
    private static ArrayList<Contactt> contacts = new ArrayList<>();

    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    viewContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    deleteContact();
                    break;
                case 5:
                    System.out.println("Exiting the system...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    
    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email address: ");
        String email = scanner.nextLine();

        Contactt contact = new Contactt(name, phoneNumber, email);
        contacts.add(contact);

        System.out.println("Contact added successfully!");
    }

    
    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            System.out.println("\n--- Contacts ---");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("\nContact " + (i + 1) + ":");
                System.out.println(contacts.get(i));
            }
        }
    }

    
    private static void updateContact() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available to update.");
            return;
        }

        System.out.print("Enter the index of the contact to update (1 to " + contacts.size() + "): ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); 

        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid index.");
            return;
        }

        Contactt contact = contacts.get(index);

        System.out.println("Updating Contact: " + contact.getName());

        System.out.print("Enter new name (leave blank to keep current): ");
        String newName = scanner.nextLine();
        if (!newName.isEmpty()) {
            contact.setName(newName);
        }

        System.out.print("Enter new phone number (leave blank to keep current): ");
        String newPhoneNumber = scanner.nextLine();
        if (!newPhoneNumber.isEmpty()) {
            contact.setPhoneNumber(newPhoneNumber);
        }

        System.out.print("Enter new email (leave blank to keep current): ");
        String newEmail = scanner.nextLine();
        if (!newEmail.isEmpty()) {
            contact.setEmail(newEmail);
        }

        System.out.println("Contact updated successfully!");
    }

    
    private static void deleteContact() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available to delete.");
            return;
        }

        System.out.print("Enter the index of the contact to delete (1 to " + contacts.size() + "): ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); 

        if (index < 0 || index >= contacts.size()) {
            System.out.println("Invalid index.");
            return;
        }

        contacts.remove(index);
        System.out.println("Contact deleted successfully!");
    }
}
