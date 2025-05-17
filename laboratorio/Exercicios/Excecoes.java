package Exercicios;
// Exercício 1. Sabendo disto, altere os métodos abaixo para que uma exceção do tipo IllegalArgumentException seja lançada e tratada quando o valor for inválido. IllegalArgumentException é uma Runtime Exception do Java e indica que o método "não gostou" do que foi passado.

// public void aumentaTemperatura(double tempMais){
//      this.temperatura += tempMais;
// }
// public void diminuiTemperatura(double tempMenos){
//      this.temperatura -= tempMenos;
// }
// Exercício 2. Como ficaria o método main para chamar os dois métodos do Exercício 1?

// Exercício 3. Altere os métodos do Exercício 1 para que a exceção seja lançada mas não seja tratada dentro do método.

// Exercício 4. Como ficaria o método main para chamar estes dois métodos com esta alteração?
import java.util.Scanner;

public class Excecoes {
    private double temperatura;

    public Excecoes(double temperatura) {
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void aumentaTemperatura(double tempMais){
        this.temperatura += tempMais;
    }
    public void diminuiTemperatura(double tempMenos){
        this.temperatura -= tempMenos;
    }

    public static void main(String[] args) throws IllegalArgumentException {
        try (Scanner scan = new Scanner(System.in)) {
            Excecoes temp = new Excecoes(0);
            System.out.println("Digite o valor a ser somado: ");
            double tempMais = scan.nextDouble();
            temp.aumentaTemperatura(tempMais);
            System.out.println("Digite o valor a ser subtraído: ");
            double tempMenos = scan.nextDouble();
            temp.diminuiTemperatura(tempMenos);
            System.out.println("Temperatura final: " + temp.getTemperatura());
        } catch (IllegalArgumentException e) {
            System.out.println("Valor inválido: " + e.getMessage());
        } finally {
            System.out.println("Fim do programa");
        }
    }
}
