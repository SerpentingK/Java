package Ej3;

import java.util.ArrayList;

public class ContactController {
    private ArrayList<Contact> contacts;
    private ContactView view;

    public ContactController(ArrayList<Contact> contacts, ContactView view) {
        this.contacts = contacts;
        this.view = view;
    }

    public void addContact(String name, String phoneNumber, String email, int age) {
        contacts.add(new Contact(name, phoneNumber, email, age));
    }

    public void displayContacts() {
        view.displayContacts(contacts);
    }
}
