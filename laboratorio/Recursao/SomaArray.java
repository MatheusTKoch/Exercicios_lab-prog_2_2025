package Recursao;

public class SomaArray {
    public static void recebeArray(double[][] array) throws IllegalArgumentException {
        if(array == null) {
            throw new IllegalArgumentException("Array nulo");
        }
        somaArray(array);
    }

    public static int A(int i){
        if(i > 10) return 0;
        int x = 5 + i;
        i += 3;
        System.out.println((x + A(i)));
        return x + A(i);
    }

    private static void imprimeArray(double valor) {
        System.out.println("Soma dos valores do array: " + valor);
    }

    private static double somaArray(double[][] array) {
        double soma = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                soma += array[i][j];
            }
        }
        imprimeArray(soma);
        return soma;
    }
}
