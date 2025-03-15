package Bancaria;

public class TesouroDireto implements Rentavel {
    private double valorInvestido;
    private double valorAtual;

    public TesouroDireto(double valorInvestido, double valorAtual) {
        this.valorInvestido = valorInvestido;
        this.valorAtual = valorAtual;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    @Override
    public double calculaRendimento() {
        return (getValorAtual() - getValorInvestido());
    }
}
