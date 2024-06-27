package Ej2;

import java.util.Scanner;

public class ContactView {
    private Scanner scanner;

    public ContactView() {
        scanner = new Scanner(System.in);
    }

    public String[] getContactInfo() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        return new String[]{name, phoneNumber, email};
    }

    public void displayContact(Contact contact) {
        System.out.println(contact);
    }
}
