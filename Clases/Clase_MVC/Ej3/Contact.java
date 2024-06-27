package Ej3;


public class Contact {
    private String name;
    private String phoneNumber;
    private String email;
    private int age;

    public Contact(String name, String phoneNumber, String email, int age) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email + ", Age: " + age;
    }
}
