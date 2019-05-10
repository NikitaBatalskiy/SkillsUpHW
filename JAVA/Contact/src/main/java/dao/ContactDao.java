package dao;

import entity.Contact;
import exception.AdressBookException;

public interface ContactDao {
    void saveContact(Contact contact) throws AdressBookException;

    Contact getContactById(int contactId);

    Contact getContactByName(String name);

    Contact updateContact(Contact contact);

    void deleteById(int id);

    void showContacts();

    void deleteContactByEntity(Contact contact);
}
