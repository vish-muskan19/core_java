package java_tutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class v111_file {
    public static void main(String[] args) {

        // Creating a new file
//        File myFile = new File("v_111_file.txt");
//        try {
//            myFile.createNewFile();
//        }
//        catch (IOException e) {
//            System.out.println("Unable to create this file");
//            e.printStackTrace();
//        }

        // Writing to a file
//        try {
//            FileWriter fileWriter= new FileWriter("v_111_file.txt");
//            fileWriter.write("This is our 1st file from this java course\nOkay now bye");
//            fileWriter.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        //Reading a file
//        File myfile = new File("v_111_file.txt");
//        try {
//            Scanner sc=new Scanner(myfile);
//            while (sc.hasNextLine()){
//                String line= sc.nextLine();
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        //Deleting a file
        File myfile =new File("v_111_file.txt");
        if (myfile.delete()){
            System.out.println("I have delete: "+myfile.getName());
        }
        else {
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
