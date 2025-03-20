package Recursao;

public class PrimaryDiagonal {
    public static void validatePrimaryDiagonal(int[][] m) throws IllegalArgumentException, MatrixNotPossibleException{
        if(m == null) throw new IllegalArgumentException();
        if(m.length != m[0].length) throw new MatrixNotPossibleException();
        getPrimaryDiagonal(m, 0);
    }

    private static int[] getPrimaryDiagonal(int[][] m, int j) {
        int[] primaryDiagonal = new int[m.length];
        if(j == m.length) return primaryDiagonal;
        for(int i = 0; i < m.length; i++){
            primaryDiagonal[i] = m[i][i];
            System.out.println(primaryDiagonal[i]);
        }
        return getPrimaryDiagonal(m, j + 1);
    }
}
