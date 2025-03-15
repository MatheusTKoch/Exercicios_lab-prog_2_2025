package Recursao;

public class SomaArray {
    public static void recebeArray(double[][] array) throws IllegalArgumentException {
        if(array == null) {
            throw new IllegalArgumentException("Array nulo");
        }
        somaArray(array);
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
