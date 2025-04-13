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

    public static void main(String[] args) {
        int resultado = fatorialInt(4);
        System.out.println(resultado);
    }
}
