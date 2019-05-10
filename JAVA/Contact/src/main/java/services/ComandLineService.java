package services;

import exception.AdressBookException;
import exception.ResponseCode;

import java.util.Scanner;

public interface ComandLineService {

    static void showMenu() {
        System.out.println("1. Add contact;");
        System.out.println("2. Update contact;");
        System.out.println("3. Delete contact;");
        System.out.println("4. Show all contacts;");
        System.out.println("0. Exit;");
    }

    static void run(Scanner scan, ContactService service) {
        boolean exit = true;
        do {
            try {
                System.out.println("Chose what you wish: ");
                showMenu();
                int numberOfMenu = scan.nextInt();
                switch (numberOfMenu) {
                    case 1: {
                        service.addContact(scan);
                        break;
                    }
                    case 2: {
                        service.updateContact(scan);
                        break;
                    }
                    case 3: {
                        service.deleteContact(scan);
                        break;
                    }
                    case 4: {
                        service.showContacts();
                        break;
                    }
                    case 0: {
                        System.out.println("Thank you for using our app. Good bye.");
                        exit = false;
                        break;
                    }
                    default: {
                        System.out.println("Sorry, you entered wrong number of menu. Chose another number.");
                        break;
                    }
                }
            } catch (AdressBookException e) {
                if (e.getCode().equals(ResponseCode.NOT_FOUND)) {
                    System.out.println("Sorry, you entered wrong number of operation.");
                } else if (e.getCode().equals(ResponseCode.OBJECT_EXIST)) {
                    System.out.println("Sorry, this contact already exists.");
                }
            }
        }while (exit);
    }
}
