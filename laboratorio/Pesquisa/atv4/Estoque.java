// Crie uma classe chamada Estoque, que possui um array de Produto como atributo. No construtor de Estoque, receba o array de Produto. Crie os métodos de acesso e o toString para esta classe.
// Na classe Estoque, crie um método chamado ordenaProdutosPorValor, que ordena o array de produtos por valor (do menor ao maior), utilizando Inserção Direta.
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
}
