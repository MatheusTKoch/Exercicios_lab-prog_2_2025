package Bancaria;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String senha) {
        super(senha);
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    @Override
    public void saca(double valor) {
        System.out.println("Sacando " + valor + " da conta poupança");
    }

    @Override 
    public void deposita(double valor) {
        System.out.println("Depositando " + valor + " na conta poupança");
    }

    @Override
    public void tiraExtrato() {
        System.out.println("Extrato da conta poupança");
    }

    
}
