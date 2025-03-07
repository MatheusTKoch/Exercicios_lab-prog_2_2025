package Arquivos;

public class Eletrodomestico extends Produto {
    private double valorIPI;

    public Eletrodomestico(double preco, String descricao, String tipo, double valorIPI) {
        super(preco, descricao, tipo);
        this.valorIPI = valorIPI;
    }

    public void setValorIPI(double valorIPI) {
        this.valorIPI = valorIPI;
    }

    public double getValorIPI() {
        return valorIPI;
    }
}
