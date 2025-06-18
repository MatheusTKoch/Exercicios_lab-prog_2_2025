package w3schools;

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
    public static void main(String[] args) {
        int numTest = 6;
        checkNum(numTest);
    }
}
