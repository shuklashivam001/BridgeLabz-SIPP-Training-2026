package oops_practice.oops_practice.gcr_codebase.collections.story_based;

import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBook {

    static ArrayList<Contact> contactList = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneSet = new HashSet<>();

    static void addContact(String name, String phone, String email) {

        if (phoneSet.contains(phone)) {
            System.out.println("Duplicate phone number not allowed.");
            return;
        }

        Contact c = new Contact(name, phone, email);

        contactList.add(c);
        contactMap.put(name, c);
        phoneSet.add(phone);

        System.out.println("Contact added.");
    }

    static void searchContact(String name) {

        Contact c = contactMap.get(name);

        if (c != null) {
            System.out.println("Name : " + c.name);
            System.out.println("Phone: " + c.phone);
            System.out.println("Email: " + c.email);
        } else {
            System.out.println("Contact not found.");
        }
    }

    static void deleteContact(String name) {

        Contact c = contactMap.remove(name);

        if (c != null) {
            contactList.remove(c);
            phoneSet.remove(c.phone);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    static void displayContacts() {

        Collections.sort(contactList, new Comparator<Contact>() {
            public int compare(Contact c1, Contact c2) {
                return c1.name.compareToIgnoreCase(c2.name);
            }
        });

        System.out.println("\nContact List");

        for (Contact c : contactList) {
            System.out.println(c.name + "  " + c.phone + "  " + c.email);
        }
    }

    public static void main(String[] args) {

        addContact("Rahul", "9876543210", "rahul@gmail.com");
        addContact("Ankit", "9999999999", "ankit@gmail.com");
        addContact("Aman", "8888888888", "aman@gmail.com");

        addContact("Rohit", "9876543210", "rohit@gmail.com");

        System.out.println();

        searchContact("Rahul");

        System.out.println();

        deleteContact("Ankit");

        displayContacts();
    }
}