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

public abstract class ContaBancaria {
    private String senha;
    private int numero;
    private double saldo;

    public ContaBancaria(String senha) {
		this.senha = senha;
	}
	
	public ContaBancaria(String senha, int numero) {
		this.senha = senha;
		this.numero = numero;
	}

	public ContaBancaria(String senha, int numero, double saldo) {
		this.senha = senha;
		this.numero = numero;
		this.saldo = saldo;
	}

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public abstract void saca(double valor);
    public abstract void deposita(double valor);
    public abstract void tiraExtrato();

    public boolean alteraSenha(String senha){
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a senha anterior:");
		if(s.nextLine().equals(this.senha)){
			this.senha = senha;
			return true;
		}
		return false;
	}
}
