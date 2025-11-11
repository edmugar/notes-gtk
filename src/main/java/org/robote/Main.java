package org.robote;

import org.robote.notes.data.DataBase;

public class Main {
    public static void main(String[] args) {
        DataBase dbConnection = new DataBase();
        dbConnection.Connect();
    }
}