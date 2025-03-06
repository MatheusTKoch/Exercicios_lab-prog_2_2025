// Considere as seguintes informações: 

// - você deve criar uma classe abstrata chamada Produto. Os tipos de produto são Alimento, Vestuário e Eletrodomésticos. Cada tipo de produto possui 3 informações iguais (nome, descrição, preço), e cada um deles possui uma informação extra: alimentos possuem uma data de validade; produtos de vestuário possuem uma quantidade em estoque; eletrodomésticos possuem um valor adicional de IPI.

// - crie uma classe Estoque, que tem um array de Produto como atributo. Esta classe deve possuir um método chamado preencheEstoque, que recebe o nome do arquivo de produtos como parâmetro. Neste método, o arquivo de produtos deve ser lido o método deve armazenar todas as informações do arquivo no array do tipo Produto, onde cada posição terá ou um Alimento, ou um Vestuario ou um Eletrodomestico. 

// - Na classe Principal (no método main), solicite via teclado o nome do arquivo que contém as informações dos produtos e preencha o estoque. Crie um arquivo chamado info.txt com as seguintes informações:

// a) o alimento mais caro

// b) o eletrodoméstico mais barato

// c) o nome e a quantidade em estoque de todos os produtos de vestuário 

package Arquivos;

public abstract class Produto {
    private String nome;
    private String descricao;
    private double preco;

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private void setPreco(double preco) {
        this.preco = preco;
    }
}
