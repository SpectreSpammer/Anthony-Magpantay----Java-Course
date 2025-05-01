package day11_FileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.logging.Logger;

public class MainSerialization {

    public static void main(String[] args)  {

        Logger LOGGER = Logger.getLogger(MainSerialization.class.getName());

        EmployeeIO employee = new EmployeeIO();
        employee.name = "Anthony Magpantay";
        employee.address = "Canada";

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\Mugiwara\\Downloads\\Test\\Anthony.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(employee);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Serialized data is saved in the Test directory as Anthony Magpantay.txt");
            LOGGER.info("The file has been created successfull as Anthony Magpantay.txt");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error in creating the file");
        }

    }
}
