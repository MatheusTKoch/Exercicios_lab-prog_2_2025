package Recursao;

public class MenorPosicao {
    public static int encontraPosicaoMenorValor(int[] v) throws IllegalArgumentException{
		if(v == null) throw new IllegalArgumentException();
		return encontraPosicaoMenorValor(v, 1, 0);
	}
	
	private static int encontraPosicaoMenorValor(int[] v, int i, int posicaoMenor){
		if(i >= v.length) return posicaoMenor;
		if(v[i] < v[posicaoMenor])
			posicaoMenor = i;
		return encontraPosicaoMenorValor(v, i+1, posicaoMenor);
	}
}
