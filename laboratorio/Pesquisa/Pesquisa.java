package Pesquisa;

public class Pesquisa {
    //Faça uma versão recursiva do método de Pesquisa Sequencial para arrays não-ordenados visto em aula. 
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
    public static void main(String[] nums) {
        int[] vet = {1, 2, 4, 5, 12, 1289, 1, 23};
        System.out.println(pesquisaNum(vet, 23));
    }
    
}
