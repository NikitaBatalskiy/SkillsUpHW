package services.impl;

import dao.impl.ContactDaoImpl;
import services.ComandLineService;
import services.ContactService;

import java.util.Scanner;

public class ComandLineServiceImpl implements ComandLineService {
    private static final Scanner scan = new Scanner(System.in);
    private static final ContactService service = new ContactServiceImpl(new ContactDaoImpl());

    //    private static final ContactDaoImpl contactDao = new ContactDaoImpl();
    public static void start() {
        ComandLineService.run(scan, service);
    }

//    public static void run() {
//        boolean exit = true;
//        do {
//            try {
//                System.out.println("Chose what you wish: ");
//                showMenu();
//                int numberOfMenu = scan.nextInt();
//                switch (numberOfMenu) {
//                    case 1: {
//                        service.addContact(scan);
//                        break;
//                    }
//                    case 2: {
//                        System.out.println("Inpute id of the contact you want to update: ");
//                        int Id = scan.nextInt();
//                        contactDao.updateContactById(Id);
//                        break;
//                    }
//                    case 3: {
//                        System.out.println("Inpute id of the contact you want to delete: ");
//                        int Id = scan.nextInt();
//                        service.deleteById(Id);
//                        break;
//                    }
//                    case 4: {
//                        System.out.println("There are all the contacts: ");
//                        contactDao.showContacts();
//                        break;
//                    }
//                    case 0: {
//                        System.out.println("Thank you for using our app. Good bye.");
//                        exit = false;
//                        break;
//                    }
//                    default: {
//
//                        throw new AdressBookException(ResponseCode.WRONG_DATA_TYPE, "Sorry, you entered wrong number.")
//
//                    }
//                }
//            } catch (AdressBookException e) {
//                System.out.println(e.getCode());
//            }
//        }
//        while (exit);
//    }
}
