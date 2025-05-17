// Exercício 1 - Implemente a hierarquia de classes ContaBancaria (superclasse), ContaCorrente (com senha, número, saldo e quantidade de transações realizadas) e ContaPoupanca (com senha, número, saldo e taxa de rendimento).
// quando uma ContaBancaria for criada, informe a senha da conta por parâmetro
// na classe ContaBancaria, crie os seguintes métodos abstratos (os métodos devem simular as situações acontecendo na conta corrente):
// saca(double valor)
// deposita(double valor)
// tiraExtrato()
// nesta mesma classe, crie o método alteraSenha, que recebe uma senha por parâmetro e deve confirmar a senha anterior (via teclado), e somente se a senha anterior estiver correta a senha recebida por parâmetro deve ser atribuída
// implemente os métodos abstratos nas classes ContaCorrente e ContaPoupanca
// crie os métodos de acesso para os atributos de ContaCorrente e ContaPoupanca
// Exercício 2 - Crie uma classe de teste para testar a hierarquia do exercício acima.

// pergunte (via teclado) quantas contas o usuário deseja criar e crie-as (com a utilização de arrays para armazenar as contas)
// a cada conta criada, pergunte ao usuário se trata-se de uma ContaCorrente ou de uma ContaPoupanca, e crie a conta de acordo com o informado pelo usuário
// após as contas terem sido criadas, informe a taxa de rendimento de cada ContaPoupanca armazenada
// realize saques, depósitos e extratos nestas contas
// imprima a quantidade de transações realizadas nas contas correntes e as taxas de rendimento das contas poupança
// Exercício 3 - Crie uma interface chamada Rentavel, que representa tipos de objetos que possuem alguma taxa de rentabilidade. Nesta interface, coloque o método calculaRendimento, que não recebe parâmetros e retorna um double. Em seguida, altere a classe ContaPoupanca para indicar que ela é rentável, e implemente o(s) método(s) necessários de acordo com as informações da própria classe.

// Exercício 4 - Pense em outro objeto que pode implementar a interface Rentavel, e crie-o.

// Exercício 5 - No main criado anteriormente, crie um array de Rentavel e inclua alguns possívels objetos neste array. Imprima as informações do rendimento de cada um dos objetos armazenados no array.
package Bancaria;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args){
		int quantContas = 0;
		
		try (Scanner s = new Scanner(System.in)) {
			while(quantContas <= 0){
			System.out.println("Quantas contas serão criadas?");
			quantContas = Integer.parseInt(s.nextLine());
		}
		
		ContaBancaria[] contas = new ContaBancaria[quantContas];

		for(int i=0; i<contas.length; i++){
			System.out.println("Digite 1 para Conta Corrente ou outro valor para Conta Poupança:");
			contas[i] = Integer.parseInt(s.nextLine()) == 1 ? new ContaCorrente("123456") : new ContaPoupanca("123456");
		}

        for(ContaBancaria cb: contas){
			cb.setNumero((int)(Math.random()*10000+1));
		}
			
		for(ContaBancaria cb: contas){
			if(cb instanceof ContaPoupanca){
				((ContaPoupanca) cb).setTaxaRendimento(Math.random());
			}
		}

		for(ContaBancaria cb: contas){
			cb.deposita(Math.random()*500);
			cb.saca(Math.random()*100);
			cb.tiraExtrato();
		}

		for(ContaBancaria cb: contas) {
			if(cb instanceof ContaPoupanca)
				System.out.println("Taxa de rendimento da poupança "+cb.getNumero()+": "+((ContaPoupanca) cb).getTaxaRendimento());
			else if(cb instanceof ContaCorrente)
				System.out.println("Quantidade de transações da conta corrente "+cb.getNumero()+": "+((ContaCorrente)cb).getQuantTransacoes());
		}
		
		Rentavel[] rentaveis = new Rentavel[(int)(Math.random()*10+1)];
		for(int i=0; i<rentaveis.length; i++)
			rentaveis[i] = Math.random() < 0.5 ? new ContaPoupanca("123456") : new TesouroDireto(200, 300);
			
		for(Rentavel r: rentaveis)
			System.out.println("Rendimento: R$" + r.calculaRendimento());
		}
	}
}
