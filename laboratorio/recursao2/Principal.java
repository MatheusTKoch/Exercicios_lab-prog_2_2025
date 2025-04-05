package recursao2;

public class Principal {
    public static void metodoRecursivo(int x) {
        if (x == 0)
            System.out.println("Fim do programa");
        else
            metodoRecursivo(x-3);
        System.out.println(x);
   }
    public static void main(String[] args) {
        metodoRecursivo(6);
        // // Criar uma instância do campeonato
        // Campeonato campeonato = new Campeonato();
        
        // // Ler o arquivo times.txt
        // campeonato.leArquivo("times.txt");
        
        // // Encontrar o time com maior saldo de gols
        // TimeCampeonato timeMaiorSaldo = campeonato.timeMaiorSaldoGols();
        
        // // Imprimir o resultado
        // if (timeMaiorSaldo != null) {
        //     System.out.println("Time com maior saldo de gols:");
        //     System.out.println("Nome: " + timeMaiorSaldo.getNome());
        //     System.out.println("Saldo de gols: " + timeMaiorSaldo.getSaldo());
        // } else {
        //     System.out.println("Não há times no campeonato.");
        // }
        
        // // Imprimir todos os times e seus saldos
        // System.out.println("\nTodos os times do campeonato:");
        // TimeCampeonato[] times = campeonato.getTimeCampeonato();
        // if (times != null) {
        //     for (TimeCampeonato time : times) {
        //         System.out.println(time.getNome() + ": " + time.getSaldo() + " gols");
        //     }
        // }
    }
}