// Crie uma classe Data, que possui um dia, um mês e um ano como atributos. Crie um construtor, os métodos de acesso e o método toString para esta classe.
package Pesquisa.atv4;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    } 

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    } 

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data completa" + getDia() + "/" + getMes() + "/" + getAno();
    }
}
