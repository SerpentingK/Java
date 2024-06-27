package Ej2;

public class Main {
    public static void main(String[] args) {
        ContactView view = new ContactView();
        String[] contactInfo = view.getContactInfo();
        Contact contact = new Contact(contactInfo[0], contactInfo[1], contactInfo[2]);
        ContactController controller = new ContactController(contact, view);

        // Mostrar contacto ingresado
        controller.updateView();
    }
}

