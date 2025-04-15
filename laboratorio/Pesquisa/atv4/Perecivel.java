// Crie duas classes que são filhas de Produto: Perecivel e NaoPerecivel. Estas classes representam, respectivamente, produtos que são perecíveis e que não são perecíveis. Produtos perecíveis possuem uma data de validade (do tipo Data, criado por você anteriormente), enquanto produtos não-perecíveis possuem um inteiro que representa a quantidade em estoque. Crie um construtor, os métodos de acesso e o método toString para estas classes.
package Pesquisa.atv4;

public class Perecivel extends Produto {
    Data dataValidade;

    public Perecivel(String nome, String descricao, double valor, Data dataValidade) {
        super(nome, descricao, valor);
        this.dataValidade = dataValidade;
    }

    public Data getValidade() {
        return dataValidade;
    }

    public void setValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Nome do produto:" + getNome() + ", dados:" + getDescricao() + ", valor: R$" + getValor() + ", Data de Validade: " + getValidade();
    }
}
