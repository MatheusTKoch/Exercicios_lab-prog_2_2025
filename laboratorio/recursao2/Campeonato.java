//Crie uma classe Campeonato, que possui um array de TimeCampeonato. Crie o construtor e métodos de acesso do atributo. No construtor, não inicialize o array, pois ainda não sabemos o tamanho dele.

// Na classe Campeonato, crie um método chamado leArquivo, que recebe uma String filename. Este método lê um arquivo chamado filename e popula o array de TimeCampeonato de acordo com o conteúdo do arquivo. O conteúdo do arquivo está no seguinte formato (assuma que o nome do time NÃO terá espaços):

// Grêmio 5 x 0 Internacional
// Santos 2 x 3 Cruzeiro
// PSG 1 x 4 Grêmio
// Barcelona 2 x 3 RealMadrid


package recursao2;

public class Campeonato {
    private TimeCampeonato[] times;
    private String fileString;

    public Campeonato() {

    }

    public void setTimeCampeonato(TimeCampeonato[] times) {
        this.times = times;
    }

    public TimeCampeonato[] getTimeCampeonato() {
        return times;
    }

    public void leArquivo(String fileString) {
        
    }
}
