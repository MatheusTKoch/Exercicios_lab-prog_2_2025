// Crie uma classe chamada Estoque, que possui um array de Produto como atributo. No construtor de Estoque, receba o array de Produto. Crie os métodos de acesso e o toString para esta classe.

package Pesquisa.atv4;

public class Estoque {
    Produto[] arrayProduto;

    public Estoque(Produto[] arrayProduto) {
        this.arrayProduto = arrayProduto;
    }

    public Produto[] getArrayProduto() {
        return arrayProduto;
    }

    public void setArrayProduto(Produto[] arrayProduto) {
        this.arrayProduto = arrayProduto;
    }

    @Override
    public String toString() {
        return "Lista de produtos: " + getArrayProduto();
    }

    // Na classe Estoque, crie um método chamado ordenaProdutosPorValor, que ordena o array de produtos por valor (do menor ao maior), utilizando Inserção Direta.
    public Produto[] ordenaProdutosPorValor() {
        int n = arrayProduto.length;
        for (int i = 1; i < n; i++) {
            Produto key = arrayProduto[i];
            int j = i - 1;
            while (j >= 0 && arrayProduto[j].getValor() > key.getValor()) {
                arrayProduto[j + 1] = arrayProduto[j];
                j = j - 1;
            }
            arrayProduto[j + 1] = key;
        }
        return arrayProduto;
    }

    // Na classe Estoque, crie um método chamado produtosNaoPereciveis, que retorna um array de objetos da classe Perecivel, contendo todos os produtos perecíveis que estão no array de produtos.
    public Perecivel[] produtosNaoPereciveis() {
        int count = 0;
        for (Produto produto : arrayProduto) {
            if (produto instanceof Perecivel) {
                count++;
            }
        }
        
        Perecivel[] pereciveis = new Perecivel[count];
        int index = 0;
        for (Produto produto : arrayProduto) {
            if (produto instanceof Perecivel) {
                pereciveis[index++] = (Perecivel) produto;
            }
        }
        
        return pereciveis;
    } 

    // Na classe Estoque, crie um método chamado ordenaProdutosPereciveisPorQuantidade, que recebe um array de objetos da classe Perecivel e ordena os produtos deste array em ordem decrescente de quantidade em estoque, utilizando Seleção Direta.
    public Perecivel[] ordenaProdutosPereciveisPorQuantidade(Perecivel[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j].getEstoque() > array[maxIdx].getEstoque()) {
                    maxIdx = j;
                }
            }
            Perecivel temp = array[maxIdx];
            array[maxIdx] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
