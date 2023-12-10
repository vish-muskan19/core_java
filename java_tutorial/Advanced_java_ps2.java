package java_tutorial;

import java.io.FileWriter;
import java.io.IOException;

//1: Create a class and a method with deprecated annotation. What is its effect on program execution?
class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

interface MyInt{
    void display();
}

public class Advanced_java_ps2 {

    public static void main(String[] args) {
//        @SuppressWarnings("deprecation") //2
//        MyDeprecated d = new MyDeprecated(); //1
//        d.meth1();

// 3: Create an interface and generate an instance from it.
//        MyInt i = () -> System.out.println("I am display");

// 4: Write a Java program to generate a multiplication table of a given number and write it to a file.
        int i = 5;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("MultiplicationTable.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

