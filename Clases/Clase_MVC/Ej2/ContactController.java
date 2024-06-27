package Ej2;

public class ContactController {
    private Contact model;
    private ContactView view;

    public ContactController(Contact model, ContactView view) {
        this.model = model;
        this.view = view;
    }

    public void updateContact(String name, String phoneNumber, String email) {
        model = new Contact(name, phoneNumber, email);
    }

    public void updateView() {
        view.displayContact(model);
    }
}

