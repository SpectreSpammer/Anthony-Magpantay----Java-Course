package day11_FileIO;

import java.io.*;
import java.util.logging.Logger;

public class MainDeserialization {

    public static void main(String[] args)  {

        Logger LOGGER = Logger.getLogger(MainDeserialization.class.getName());

        EmployeeIO employee = null;


        try{
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Mugiwara\\Downloads\\Test\\Anthony.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            employee = (EmployeeIO) objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            System.out.println("Deserialized Anthony.txt");
            System.out.println("First Name: " + employee.name);
            System.out.println("Address: " + employee.address);

            System.out.println("Serialized data is read in the Test directory as Anthony.txt");
            LOGGER.info("The file has been read successfull as Anthony Magpantay.txt");
        }catch (IOException  | ClassNotFoundException e){
            e.printStackTrace();
            System.out.println("Error in reading the file");
        }

    }
}
