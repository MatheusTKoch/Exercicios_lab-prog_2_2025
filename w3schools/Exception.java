package w3schools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Exercicios retirados de https://www.w3resource.com/java-exercises/exception/index.php
public class Exception {
    //Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
    public static void checkInt(int num) throws OddException {
        if (num % 2 != 0) {
            throw new OddException(num + " is odd");
        }
    };
    
    public static void checkNum(int num) {
        try {
            checkInt(num);
            System.out.println("Number is even!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    //Write a Java program to create a method that reads a file and throws an exception if the file is not found.
    public static void checkFile(String path) {
        try {
            readFile(path);  
        } catch (FileNotFoundException e) {
            System.out.println("Error - " + e.getMessage());;
        }
    }

    public static void readFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String data = scanner.nextLine();
            System.out.println(data);
        }
        scanner.close();
    }
    public static void main(String[] args) {
        checkFile("test.txt");
    }
}
