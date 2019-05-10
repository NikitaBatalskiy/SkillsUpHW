package services;

import entity.Contact;
import exception.AdressBookException;

import java.util.Scanner;

public interface ContactService {
    Contact addContact(Scanner scanner) throws AdressBookException;

    Contact getContact(Scanner scanner);

    Contact updateContact(Scanner scanner) throws AdressBookException;

    void deleteContact(Scanner scanner) throws AdressBookException;

    void showContacts();

    void deleteContactByEntity(Scanner scanner);

}
