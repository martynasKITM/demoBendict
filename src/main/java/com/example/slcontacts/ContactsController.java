package com.example.slcontacts;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ContactsController {

@FXML
    private TableView<Contact> contactTable;
    @FXML

    private TableColumn<Contact, String> nameColumn;
    @FXML

    private TableColumn<Contact, String> surnameColumn;
    @FXML

    private TableColumn<Contact, String> phoneNumberColumn;
    @FXML

    private TextField nameField;
    @FXML

    private TextField surnameField;
    @FXML

    private TextField phoneNrField;

    private static ObservableList<Contact> contacts = FXCollections.observableArrayList();


    public void initialize() {
        nameColumn.setCellValueFactory(cellData -> cellData.getValue().nameProperty());
        surnameColumn.setCellValueFactory(cellData -> cellData.getValue().surnameProperty());
        phoneNumberColumn.setCellValueFactory(cellData -> cellData.getValue().phoneNumberProperty());

        contactTable.setItems(contacts);


    }

    @FXML

    public void handleButtonClick(ActionEvent event) {

        String name = nameField.getText();
        String surname = surnameField.getText();
        String phoneNumber = phoneNrField.getText();
        System.out.println(name);


        contacts.add(new Contact(name, surname, phoneNumber));
    }

       @FXML
       public void handleSaveToCSV(ActionEvent event)  {
            String filepath = "contacts.csv";
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath))){
                bw.write("Name, surname, phone number");
                bw.newLine();
                for(Contact contact : contacts){

                        bw.write(contact.getName() + "," + contact.getSurname() + "," + contact.getPhoneNumber());
                        bw.newLine();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
            }
        }











}