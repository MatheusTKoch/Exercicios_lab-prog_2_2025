package Arquivos;

public class Vestuario extends Produto{
    private int quantEstoque;

    public Vestuario(double preco, String descricao, String tipo, int quantEstoque) {
        super(preco, descricao, tipo);
        this.quantEstoque = quantEstoque;
    }

    public void setQuantidadeEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public int getQuantidadeEstoque() {
        return quantEstoque;
    }
}
