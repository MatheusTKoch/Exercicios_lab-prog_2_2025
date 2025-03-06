// Exercício 2 - Crie uma classe de teste para testar a hierarquia do exercício acima.

// pergunte (via teclado) quantas contas o usuário deseja criar e crie-as (com a utilização de arrays para armazenar as contas)
// a cada conta criada, pergunte ao usuário se trata-se de uma ContaCorrente ou de uma ContaPoupanca, e crie a conta de acordo com o informado pelo usuário
// após as contas terem sido criadas, informe a taxa de rendimento de cada ContaPoupanca armazenada
// realize saques, depósitos e extratos nestas contas
// imprima a quantidade de transações realizadas nas contas correntes e as taxas de rendimento das contas poupança

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		
		int quantContas = 0;
		
		while(quantContas <= 0){
			System.out.println("Quantas contas serão criadas?");
			quantContas = Integer.parseInt(s.nextLine());
		}
		
		ContaBancaria[] contas = new ContaBancaria[quantContas];

        
    }
}
