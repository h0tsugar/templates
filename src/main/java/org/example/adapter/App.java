package org.example.adapter;

public class App {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.select();
        database.update();
        database.remove();
    }
}
