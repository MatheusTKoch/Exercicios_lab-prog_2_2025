// Exercício 1. Na classe que representa uma lista estática (classe criada em aula), implemente um método RECURSIVO que recebe um elemento por parâmetro e retorna a quantidade de vezes que este elemento aparece na lista. Você deve fazer os métodos público e privado. Você deve utilizar a seguinte assinatura do método público:

// public int contaElementos(E el) throws IllegalArgumentException

package Listas;

public class Atv1 {
    public static void main(String[] args) {
        StaticList<String> lista = new StaticList<>(10);
        lista.insert("a", 0);
        lista.insert("b", 1);
        lista.insert("a", 2);
        int quantidade = lista.contaElementos("a");
        System.out.println("Quantidade de elementos na lista: " + quantidade);
    }
}
