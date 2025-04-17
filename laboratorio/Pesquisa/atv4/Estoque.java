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
}
