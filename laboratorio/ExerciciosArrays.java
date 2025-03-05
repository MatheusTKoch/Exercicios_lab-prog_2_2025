import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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

    static void exercicio1c() {
        int[][] num = new int[6][6];
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    num[i][j] = i;
                    System.out.print(num[i][j] + " ");
                }
                    System.out.println();
                }
    }

    static void exercicio1d() {
        int[][] num = {{-1, -1, -1, -1, -1, -1}, {0,  0,  0,  0,  0,  0}};
        for (int i = 0; i < 4; i++) {
            for( int[] row : num) {
                for (int j : row) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        System.out.println(num[0][0] + " " + num[0][1] + " " + num[0][2] + " " + num[0][3] + " " + num[0][4] + " " + num[0][5]);
    }

    static void retornaMatriz(int tamMatriz) {
        int[] matriz = new int[tamMatriz];
        Random rand = new Random();
        for (int i = 0; i < tamMatriz; i++) {
            int numRandom = rand.nextInt(100);
            matriz[i] = numRandom;
        }

        System.out.println(Arrays.toString(matriz));
    }
                
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o tamanho da matriz: ");
            int tamMatriz = scan.nextInt();
            retornaMatriz(tamMatriz);
    }
}