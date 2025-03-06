// Exercício 1 - Implemente a hierarquia de classes ContaBancaria (superclasse), ContaCorrente (com senha, número, saldo e quantidade de transações realizadas) e ContaPoupanca (com senha, número, saldo e taxa de rendimento).

// quando uma ContaBancaria for criada, informe a senha da conta por parâmetro
// na classe ContaBancaria, crie os seguintes métodos abstratos (os métodos devem simular as situações acontecendo na conta corrente):
// saca(double valor)
// deposita(double valor)
// tiraExtrato()
// nesta mesma classe, crie o método alteraSenha, que recebe uma senha por parâmetro e deve confirmar a senha anterior (via teclado), e somente se a senha anterior estiver correta a senha recebida por parâmetro deve ser atribuída
// implemente os métodos abstratos nas classes ContaCorrente e ContaPoupanca
// crie os métodos de acesso para os atributos de ContaCorrente e ContaPoupanca

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
