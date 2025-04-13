//Exercicios retirados de https://www.w3resource.com/java-exercises/recursive/index.php
package w3schools;

public class Exercises {
    //Write a Java recursive method to calculate the factorial of a given positive integer.
    public static int fatorialInt(int num) {
        if (num == 0) {
            return 1;
        }

        return num * fatorialInt(num - 1);
    }

    //Write a Java recursive method to calculate the sum of all numbers from 1 to n.
    public static int somaNum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + somaNum(n - 1);
    }
    public static void main(String[] args) {
        int somaNum = somaNum(4);
        System.out.println(somaNum);
    }
}
