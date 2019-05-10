package dao.impl;

import dao.ContactDao;
import entity.Contact;
import exception.AdressBookException;
import exception.ResponseCode;

import java.util.Objects;


public class ContactDaoImpl implements ContactDao {
    public static int generator = 0;
    private Contact[] storege = new Contact[10];

    public void saveContact(Contact contact) throws AdressBookException {

        for (Contact contactFromStorege : getStorege()) {
            if (Objects.nonNull(contactFromStorege)
                    && contact.getName().equals(contactFromStorege.getName())
                    && contact.getPhoneNumber().equals(contactFromStorege.getPhoneNumber())
                    && contact.getSirName().equals(contactFromStorege.getSirName()))
                throw new AdressBookException(ResponseCode.OBJECT_EXIST, "This contact already exists");
        }

        for (int argument = 1; argument <= storege.length; argument++) {
            if (storege[argument] == null) {
                generator = argument;
                contact.setId(generator);
                storege[argument] = contact;
                System.out.println("This contact was added to your contact book.");
                System.out.println(contact.toString());
                break;
            }
        }
    }

    public Contact getContactById(int contactId) {
        for (Contact storegeContact : getStorege()) {
            if (storegeContact.getId() == contactId) return storegeContact;
        }
        return null;
    }

    @Override
    public Contact getContactByName(String name) {
        for (Contact storeContacts : getStorege()) {
            if (storeContacts.getName().toLowerCase().equals(name.toLowerCase())) {
                return storeContacts;
            }
        }
        return null;
    }

    public Contact updateContact(Contact contact) {
        for (Contact storegeContact : getStorege()) {
            if (Objects.equals(storegeContact.getId(), contact.getId())) {
                storegeContact = contact;
                return storegeContact;
            }
        }
        return null;
    }
    public Contact updateContactById(int contactId) {
        for (Contact contact : getStorege()) {
            if (contact.getId() == contactId) {
                return contact;
            }
        }
        return null;
    }

    public void deleteById(int contactId) {
        for (Contact storegeContact : getStorege()) {
            if (storegeContact.getId() == contactId) {
                storegeContact = null;
            }
        }
    }

    public void showContacts() {
        for (Contact contact : getStorege()) {
            if (getStorege().length == 0){
                System.out.println("Sorry, you haven't added any contact yet.");
                break;
            }
            else if (Objects.nonNull(contact)) {
                System.out.println(contact.toString());
            }
        }
    }

    public void deleteContactByEntity(Contact contact) {
        for (Contact storegeContact : getStorege()) {
            if (storegeContact.equals(contact)) {
                storegeContact = null;
            }
        }
    }

    public Contact[] getStorege() {
        return storege;
    }
}
