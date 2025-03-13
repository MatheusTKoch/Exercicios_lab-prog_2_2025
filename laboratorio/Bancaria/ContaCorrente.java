package Bancaria;
import java.util.Scanner;

public class ContaCorrente extends ContaBancaria {
    private int qtdTransacoes;

    public ContaCorrente(String senha) {
        super(senha);
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