package Pesquisa;

public class Pesquisa {
    // Faça uma versão recursiva do método de Pesquisa Sequencial para arrays
    // não-ordenados visto em aula.
    public static int pesquisaNum(int[] vetor, int num) {
        return pesquisaNum(vetor, num, 0);
    }

    private static int pesquisaNum(int[] vetor, int num, int i) {
        if (i >= vetor.length) {
            return -1;
        }
        if (vetor[i] == num) {
            return i;
        }
        return pesquisaNum(vetor, num, i + 1);
    }

    // Faça uma versão recursiva do método de Pesquisa Sequencial para arrays
    // ordenados visto em aula.
    public static int pesqSeqOrd(int[] vetor, int num) {
        return pesqSeqOrd(vetor, num, 0);
    }

    private static int pesqSeqOrd(int[] vetor, int num, int i) {
        if ((i < vetor.length) && (vetor[i] <= num) && (vetor[i] == num)) {
            return i;
        }  
        return pesqSeqOrd(vetor, num, i + 1);
    }
    public static void main(String[] nums) {
        int[] vet = { 1, 2, 4, 5, 12, 23, 43};
        System.out.println(pesqSeqOrd(vet, 43));
    }

}
