public class ExerciciosArrays {
    static void exercicio1a() {
        int[][] num = { {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, {0, 1, 2, 3, 4, 5, 6, 7, 8, 9} };
        for (int[] row : num) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    static void exercicio1b() {
        int[][] num = {{0, 1, 4, 9, 16, 25, 36, 49, 64, 81}, {0, 1, 4, 9, 16, 25, 36, 49, 64, 81}, {0, 1, 4, 9, 16, 25, 36, 49, 64, 81}};
        for( int[] row : num) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
            }
        }
    
    public static void main(String[] args) {
        exercicio1a();
        exercicio1b();
    }
}