package services.impl;

import dao.ContactDao;
import dao.impl.ContactDaoImpl;
import entity.Contact;
import exception.AdressBookException;
import exception.ResponseCode;
import services.ContactService;

import java.util.Scanner;

public class ContactServiceImpl implements ContactService {
    private ContactDaoImpl contactDaoImpl;

    public ContactServiceImpl(ContactDao contactDao) {
        this.contactDaoImpl = (ContactDaoImpl) contactDao;
    }

    public Contact addContact(Scanner scanner) throws AdressBookException {
        Contact contact = new Contact();
        System.out.println("Please, enter name of the contact: ");
        String name = scanner.next();
        contact.setName(name);
        System.out.println("Please, enter sir name of the contact: ");
        String sirName = scanner.next();
        contact.setSirName(sirName);
        System.out.println("Please, enter the phone number: ");
        String phoneNumber = scanner.next().replaceAll("[^0-9+]", "");
        contact.setPhoneNumber(phoneNumber);
        contactDaoImpl.saveContact(contact);
        System.out.println("We are happy, you have saved some contact in our app!");
        return contact;
    }

    @Override
    public Contact getContact(Scanner scanner) {
        System.out.println("Please enter the contact number: ");
        int id = scanner.nextInt();
        return contactDaoImpl.getContactById(id);
    }

    @Override
    public Contact updateContact(Scanner scanner) throws AdressBookException {
        if (contactDaoImpl.getStorege().length == 0) {
            throw new AdressBookException(ResponseCode.NO_INFORMATION, "There are no contacts saved here.");
        } else {
            contactDaoImpl.showContacts();
            System.out.println("Please enter the id of contact you want edit: ");
            int contactId = scanner.nextInt();
            Contact contact = contactDaoImpl.updateContactById(contactId);
            boolean exit = true;
            do {
                System.out.println("Choose the field to edit:");
                System.out.println("1 - update Name");
                System.out.println("2 - update sir name");
                System.out.println("3 - update phone number");
                System.out.println("0 - finish update");
                int numberOfMenu = scanner.nextInt();
                switch (numberOfMenu) {
                    case 1: {
                        System.out.println("Please, update the name of your contact:");
                        contact.setName(scanner.next());
                        break;
                    }
                    case 2: {
                        System.out.println("Please, update the sir name of your contact:");
                        contact.setSirName(scanner.next());
                        break;
                    }
                    case 3: {
                        System.out.println("Please, update the phone number of your contact:");
                        contact.setPhoneNumber(scanner.next());
                        break;
                    }
                    case 0: {
                        System.out.print("Your contact was updated: ");
                        System.out.println(contact.toString());
                        exit = false;
                        break;
                    }
                    default: {
                        System.out.println("Sorry, You entered wrong number of menu. Choose another number, please.");
                    }
                }
            } while (exit);
            return contact;
        }
    }

    @Override
    public void deleteContact(Scanner scanner) throws AdressBookException {
        if (contactDaoImpl.getStorege().length == 0) {
            throw new AdressBookException(ResponseCode.NO_INFORMATION, "There are no contacts saved here.");
        } else {
            contactDaoImpl.showContacts();
            System.out.println("Please enter the id of the contact you want to delete: ");
            int contactToDelete = scanner.nextInt();
            contactDaoImpl.deleteById(contactToDelete);
            System.out.println("Your contact was deleted successfully.");
        }
    }

    @Override
    public void showContacts() {
        contactDaoImpl.showContacts();
    }

    @Override
    public void deleteContactByEntity(Scanner scanner) {

    }
}
