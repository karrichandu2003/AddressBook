package service;

import model.Contact;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class Addressbookservice {
    ArrayList<Contact> contacts=new ArrayList<Contact>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }
}
