package recursao2;

public class Principal {
    public static int metodo(int n) throws IllegalArgumentException{
        if(n <= 0) throw new IllegalArgumentException();
        System.out.println(metodo_recursivo(n));
        return metodo_recursivo(n);
    }

    private static int metodo_recursivo(int n) {
        if(n == 1) return 2;
        return 3 * metodo_recursivo(n-1) + 1;
    }
    public static void main(String[] args) {
        metodo(2);
        metodo(3);
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