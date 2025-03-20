package Recursao;

public class Principal {
    public static void main(String[] args) throws IllegalArgumentException, MatrixNotPossibleException {
        // ArrayInvertido.arrayInvertida(new int[]{1, 2, 3, 4, 5});
        // SomaArray.recebeArray(new double[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        // MenorPosicao.encontraPosicaoMenorValor(new int[]{23, 35, 16, 8, 13, 11, 10, 20, 9, 12});
        PrimaryDiagonal.validatePrimaryDiagonal(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
    }
}
