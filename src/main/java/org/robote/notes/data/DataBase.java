package org.robote.notes.data;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String URL(){
        File file=new File("database.sql");
        try {
           if(file.exists()){
               System.out.println("Database file exists");
               return file.getAbsolutePath();
           }else{
               file.createNewFile();
               System.out.println("Database file created successfully");
               return file.getAbsolutePath();
           }
        }catch (Exception ex){
            System.out.println("Error"+ ex);
        }
        return "";
    }

    public void Connect(){
        try {
            connection= DriverManager.getConnection("jdbc:sqlite:"+ URL());
            if(connection!=null){
                System.out.println("Connection successfully");

            }
        }catch (Exception ex){
            System.out.println("Error: "+ ex);
        }
    }
}
