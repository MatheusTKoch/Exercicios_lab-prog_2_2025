// Exercício 1 - Implemente a hierarquia de classes ContaBancaria (superclasse), ContaCorrente (com senha, número, saldo e quantidade de transações realizadas) e ContaPoupanca (com senha, número, saldo e taxa de rendimento).

// quando uma ContaBancaria for criada, informe a senha da conta por parâmetro
// na classe ContaBancaria, crie os seguintes métodos abstratos (os métodos devem simular as situações acontecendo na conta corrente):
// saca(double valor)
// deposita(double valor)
// tiraExtrato()
// nesta mesma classe, crie o método alteraSenha, que recebe uma senha por parâmetro e deve confirmar a senha anterior (via teclado), e somente se a senha anterior estiver correta a senha recebida por parâmetro deve ser atribuída
// implemente os métodos abstratos nas classes ContaCorrente e ContaPoupanca
// crie os métodos de acesso para os atributos de ContaCorrente e ContaPoupanca

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