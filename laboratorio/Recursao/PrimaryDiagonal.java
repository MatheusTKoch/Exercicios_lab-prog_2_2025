package Recursao;

public class PrimaryDiagonal {
    public static int printPrimaryDiagonal(int[][] m) throws IllegalArgumentException, MatrixNotPossibleException{
        if(m == null) throw new IllegalArgumentException();
        if(m.length != m[0].length) throw new MatrixNotPossibleException();
        return 0;
    }
}
