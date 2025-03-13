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
        Scanner s = new Scanner(System.in);
		int quantContas = 0;
		ContaBancaria[] contas = new ContaBancaria[quantContas];
		
		while(quantContas <= 0){
			System.out.println("Quantas contas serão criadas?");
			quantContas = Integer.parseInt(s.nextLine());

			if(quantContas <= 0){
				System.out.println("Quantidade inválida. Digite um número maior que zero.");
			} else {
				for (int i = 0; i < quantContas; i++) {
					System.out.println("A conta sera corrente ou poupanca? Digite 1 para corrente e 2 para poupanca");
					int tipoConta = Integer.parseInt(s.nextLine());
					if(tipoConta == 1){
						System.out.println("Digite a senha da conta corrente:");
						String senha = s.nextLine();
						System.out.println("Digite o número da conta corrente:");
						int numero = Integer.parseInt(s.nextLine());
						System.out.println("Digite o saldo da conta corrente:");
						double saldo = Double.parseDouble(s.nextLine());
						System.out.println("Digite a quantidade de transações da conta corrente:");
						int qtdTransacoes = Integer.parseInt(s.nextLine());
						contas[i] = new ContaCorrente(senha, numero, saldo, qtdTransacoes);
					} else if(tipoConta == 2){
						System.out.println("Digite a senha da conta poupanca:");
						String senha = s.nextLine();
						System.out.println("Digite o número da conta poupanca:");
						int numero = Integer.parseInt(s.nextLine());
						System.out.println("Digite o saldo da conta poupanca:");
						double saldo = Double.parseDouble(s.nextLine());
						System.out.println("Digite a taxa de rendimento da conta poupanca:");
						double taxaRendimento = Double.parseDouble(s.nextLine());
						contas[i] = new ContaPoupanca(senha, numero, saldo, taxaRendimento);
					} else {
						System.out.println("Tipo de conta inválido. Digite 1 para corrente e 2 para poupanca");
						i--;
					}

				}
			}


		}
		

        
    }
}
