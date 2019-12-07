package exercise09;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.*;

public class AddressBook extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        GridPane gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(2);
        gridPane.setPadding(new Insets(10, 10, 10, 10));
        Label nameLabel = new Label("Name:");
        Label streetLabel = new Label("Street:");
        Label cityLabel = new Label("City:");
        Label stateLabel = new Label("State:");
        Label ziplabel = new Label("Zip:");
        TextField nameField = new TextField();
        TextField streetField = new TextField();
        TextField cityField = new TextField();
        TextField stateField = new TextField();
        TextField zipField = new TextField();
        Button addBtn = new Button("Add");
        Button firstBtn = new Button("First");
        Button nextBtn = new Button("Next");
        Button previousBtn = new Button("Previous");
        Button lastBtn = new Button("Last");
        Button updateBtn = new Button("Update");

        HBox hBox = new HBox(20, addBtn, firstBtn, nextBtn, previousBtn, lastBtn, updateBtn);
        hBox.setAlignment(Pos.CENTER);

        gridPane.add(nameLabel, 0, 0, 1, 1);
        gridPane.add(nameField, 1, 0, 5, 1);
        gridPane.add(streetLabel, 0, 1, 1, 1);
        gridPane.add(streetField, 1, 1, 5, 1);
        gridPane.add(cityLabel, 0, 2);
        gridPane.add(cityField, 1, 2);
        gridPane.add(stateLabel, 2, 2);
        gridPane.add(stateField, 3, 2);
        gridPane.add(ziplabel, 4, 2);
        gridPane.add(zipField, 5, 2);
        gridPane.add(hBox, 0, 3, 6, 1);
        File file = new File("src/exercise09/address.dat");


        addBtn.setOnAction(event -> {

            try {

                RandomAccessFile accessFile = new RandomAccessFile(file, "rw");
                accessFile.seek(accessFile.length());
                String name = nameField.getText();
                String street = streetField.getText();
                String city = cityField.getText();
                String state = stateField.getText();
                String zip = zipField.getText();
                Address address = new Address(name, street, city, state, zip);

                accessFile.writeUTF(address.getName());
                accessFile.writeUTF(address.getStreet());
                accessFile.writeUTF(address.getCity());
                accessFile.writeUTF(address.getState());
                accessFile.writeUTF(address.getZip());


            } catch (IOException e) {
                e.printStackTrace();
            }


        });

        firstBtn.setOnAction(event -> {


            try {

                RandomAccessFile raf = new RandomAccessFile(file, "r");
                raf.seek(0);
                nameField.setText(raf.readUTF());
                streetField.setText(raf.readUTF());
                cityField.setText(raf.readUTF());
                stateField.setText(raf.readUTF());
                zipField.setText(raf.readUTF());

            } catch (IOException e) {
                e.printStackTrace();
            }


        });

        lastBtn.setOnAction(event -> {

            try {

                RandomAccessFile raf = new RandomAccessFile(file, "r");
                int counter = 0;
                while (raf.getFilePointer() <= raf.length()) {
                    counter++;
                    System.out.println(raf.readUTF());
                    System.out.println("file pointer:" + raf.getFilePointer());
                    System.out.println("file length:" + raf.length());
                }
                raf.seek(0);

                for (int i = 0; i < counter - 5; i++) {
                    raf.readUTF();
                }

                nameField.setText(raf.readUTF());
                streetField.setText(raf.readUTF());
                cityField.setText(raf.readUTF());
                stateField.setText(raf.readUTF());
                zipField.setText(raf.readUTF());


            } catch (IOException e) {

                e.printStackTrace();
            }


        });

        nextBtn.setOnAction(event -> {
            try {
                RandomAccessFile raf = new RandomAccessFile(file, "r");
                String s;
                while (!(s = raf.readUTF()).equals(nameField.getText())) {
                }
                long pointer = raf.getFilePointer();
                for (int i = 0; i < 4; i++) {
                    raf.readUTF();
                }
                nameField.setText(raf.readUTF());
                streetField.setText(raf.readUTF());
                cityField.setText(raf.readUTF());
                stateField.setText(raf.readUTF());
                zipField.setText(raf.readUTF());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


        });

        previousBtn.setOnAction(event -> {
            try {
                RandomAccessFile raf = new RandomAccessFile(file, "r");
                String s;
                while (!(s = raf.readUTF()).equals(nameField.getText())) {
                    System.out.println(s);
                }
                System.out.println("file pointer :" + raf.getFilePointer());
                for (int i = 0; i < 6; i++) {
                    raf.seek(raf.getFilePointer() - 7);
                }
                nameField.setText(raf.readUTF());
                streetField.setText(raf.readUTF());
                cityField.setText(raf.readUTF());
                stateField.setText(raf.readUTF());
                zipField.setText(raf.readUTF());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        updateBtn.setOnAction(event -> {
            try {
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                int counter = 0;
                while (!(raf.readUTF()).equals(nameField.getText())) {
                    counter++;
                }

                for (int i = 0; i < counter; i++) {
                    raf.readUTF();

                }
                System.out.println("length :" + raf.length());
                System.out.println("file pointer" + raf.getFilePointer());


                raf.writeUTF(nameField.getText());
                raf.writeUTF(streetField.getText());
                raf.writeUTF(cityField.getText());
                raf.writeUTF(stateField.getText());
                raf.writeUTF(zipField.getText());

            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        primaryStage.setTitle("Address Book");
        primaryStage.setScene(new Scene(gridPane));
        primaryStage.show();
    }


    class Address implements Serializable {

        String name;
        String street;
        String city;
        String state;
        String zip;

        public Address(String name, String street, String city, String state, String zip) {
            this.name = name;
            this.street = street;
            this.city = city;
            this.state = state;
            this.zip = zip;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }
    }
}
