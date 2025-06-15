//Exercicios retirados de https://www.w3resource.com/java-exercises/recursive/index.php
package w3schools;

public class Recursive {
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

    //Write a Java recursive method to find the length of a given string.
    public static int tamString(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        
        return 1 + tamString(str.substring(1));
    }

    //Write a Java recursive method to check if a given string is a palindrome.
    public static boolean checarPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");
        
        if (str.length() <= 1) {
            return true;
        }
        
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        
        return checarPalindrome(str.substring(1, str.length() - 1));
    }

    //Write a Java recursive method to count the number of occurrences of a specific element in an array.
    public static int numOcurrences(String[] arr, String target, int pos) {
        if (pos >= arr.length) {
            return 0;
        }
        return (arr[pos].equals(target) ? 1 : 0) + numOcurrences(arr, target, pos + 1);
    }

    public static void main(String[] args) {
        
    }
}
