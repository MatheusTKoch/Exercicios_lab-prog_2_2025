package Recursao;

public class Array {

    public static void imprimeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] arrayInvertida(int[] array) {
        int[] arrayInvertida = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arrayInvertida[i] = array[array.length - 1 - i];
        }
        imprimeArray(arrayInvertida);
        return arrayInvertida;
    }
}
