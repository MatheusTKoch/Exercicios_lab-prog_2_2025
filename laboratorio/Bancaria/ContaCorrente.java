package Bancaria;

public class ContaCorrente extends ContaBancaria {
    private int qtdTransacoes;

    public ContaCorrente(String senha, int qtdTransacoes) {
        super(senha);
        this.qtdTransacoes = qtdTransacoes;
    }

    public ContaCorrente(String senha, int numero, double saldo, int qtdTransacoes) {
        super(senha, numero, saldo);
        this.qtdTransacoes = qtdTransacoes;
    }

    public void setQtdTransacoes(int qtdTransacoes) {
        this.qtdTransacoes = qtdTransacoes;
    }

    public int getQtdTransacoes() {
        return qtdTransacoes;
    }

    @Override
    public void saca(double valor) {
        System.out.println("Sacando " + valor + " da conta corrente");
    }

    @Override
    public void deposita(double valor) {
        System.out.println("Depositando " + valor + " na conta corrente");
    }

    @Override
    public void tiraExtrato() {
        System.out.println("Extrato da conta corrente");
    }

    
}