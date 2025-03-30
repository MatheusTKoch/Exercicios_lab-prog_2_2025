//Crie uma classe TimeCampeonato, que possui um nome e um saldo de gols. Crie o método construtor e métodos de acesso dos atributos.
package recursao2;

public class TimeCampeonato {
    private String nome;
    private int saldoGols;

    public TimeCampeonato(String nome, int saldoGols) {
        this.nome = nome;
        this.saldoGols = saldoGols;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSaldo(int saldoGols) {
        this.saldoGols = saldoGols;
    }

    public int getSaldo() {
        return saldoGols;
    }
}