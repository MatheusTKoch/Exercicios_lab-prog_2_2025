package programacao.lists;

public class Exercicio {
    // Exercício 1: Em uma classe qualquer, implemente o método chamado convertToInt, que recebe uma lista simplesmente encadeada que armazena apenas números inteiros positivos (objetos do tipo Integer).
    // Este método deve, ao receber esta lista como parâmetro, retornar o número representado pela lista.
    public static int convertToInt(SinglyLinkedList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }

        int result = 0;
        int size = list.numElements();

        for (int i = 0; i < size; i++) {
            result = result * 10 + list.get(i);
        }

        return result;
    }

    // Exercício 2: Implemente, em uma classe qualquer, um método recursivo que soma todos os elementos contidos em uma lista simplesmente encadeada de inteiros recebida por parâmetro.
    public static int sumSinglyList(SinglyLinkedList<Integer> list) throws IllegalArgumentException {
        if(list == null) throw new IllegalArgumentException();
        return sumSinglyList(list, 0, 0);
    }

    private static int sumSinglyList(SinglyLinkedList<Integer> list, int res, int posicao) {
        if (posicao >= list.numElements()) {
            return res;
        }
        return sumSinglyList(list, res + list.get(posicao), posicao + 1);
    }
    public static void main(String[] args) {
        
    }
}
