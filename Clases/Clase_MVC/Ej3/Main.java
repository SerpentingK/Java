package Ej3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Contact> contacts = new ArrayList<>();
        ContactView view = new ContactView();
        ContactController controller = new ContactController(contacts, view);
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Agregar contactos
            controller.addContact("John Doe", "123456789", "john.doe@example.com", 30);
            controller.addContact("Jane Smith", "987654321", "jane.smith@example.com", 25);

            System.out.println("Ingrese los datos de un nuevo contacto:");
            String[] datos = view.getContactInfo(scanner);
            controller.addContact(datos[0], datos[1], datos[2], Integer.parseInt(datos[3]));

            // Mostrar contactos
            controller.displayContacts();
        } catch (NumberFormatException e) {
            System.out.println("Error: formato de edad incorrecto.");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Cerrar el Scanner
            scanner.close();
        }
    }
}
