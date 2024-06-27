package Ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactView {
    private Scanner scanner;
    

    public ContactView() {
        scanner = new Scanner(System.in);
    }

    public String[] getContactInfo(Scanner scanner) {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());
        return new String[]{name, phoneNumber, email, String.valueOf(age)};
    }

    public void displayContacts(ArrayList<Contact> contacts) {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
