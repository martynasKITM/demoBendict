package com.example.slcontacts;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Contact {

    private final SimpleStringProperty Name = new SimpleStringProperty();

    private final SimpleStringProperty Surname = new SimpleStringProperty();

    private final SimpleStringProperty PhoneNumber = new SimpleStringProperty();

    public Contact(String Name, String Surname, String Number) {
        this.Name.set(Name);
        this.Surname.set(Surname);
        this.PhoneNumber.set(Number);

    }

    public String getName() {
        return Name.get();
    }

    public SimpleStringProperty nameProperty() {
        return Name;
    }

    public void setName(String name) {
        this.Name.set(name);
    }

    public String getSurname() {
        return Surname.get();
    }

    public SimpleStringProperty surnameProperty() {
        return Surname;
    }

    public void setSurname(String surname) {
        this.Surname.set(surname);
    }

    public String getPhoneNumber() {
        return PhoneNumber.get();
    }

    public SimpleStringProperty phoneNumberProperty() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber.set(phoneNumber);
    }
}
