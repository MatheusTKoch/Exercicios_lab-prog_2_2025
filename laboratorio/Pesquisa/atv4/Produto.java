// Crie uma classe abstrata chamada Produto. Um produto possui um nome, uma descrição e um valor. Crie os métodos de acesso e o método toString para esta classe.
package Pesquisa.atv4;

public abstract class Produto {
    String nome;
    String descricao;
    double valor;

    public Produto(String nome, String descricao, double valor) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nome do produto:" + getNome() + ", dados:" + getDescricao() + ", valor: R$" + getValor(); 
    }
}
