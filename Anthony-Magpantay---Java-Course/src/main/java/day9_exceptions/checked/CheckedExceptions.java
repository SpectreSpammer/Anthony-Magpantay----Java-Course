package day9_exceptions.checked;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class CheckedExceptions {

    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        new Scanner(file);
    }

    public static void connectDatabase(){

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sampleDb","admin","admin");
        } catch (SQLException e) {
            System.out.println("Database connection failed: " + e.getMessage());
        }finally {
            System.out.println("Closing the database.");
        }
    }
}
