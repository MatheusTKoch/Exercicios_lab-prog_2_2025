// Considere as seguintes informações: 

// - você deve criar uma classe abstrata chamada Produto. Os tipos de produto são Alimento, Vestuário e Eletrodomésticos. Cada tipo de produto possui 3 informações iguais (nome, descrição, preço), e cada um deles possui uma informação extra: alimentos possuem uma data de validade; produtos de vestuário possuem uma quantidade em estoque; eletrodomésticos possuem um valor adicional de IPI.

// - crie uma classe Estoque, que tem um array de Produto como atributo. Esta classe deve possuir um método chamado preencheEstoque, que recebe o nome do arquivo de produtos como parâmetro. Neste método, o arquivo de produtos deve ser lido o método deve armazenar todas as informações do arquivo no array do tipo Produto, onde cada posição terá ou um Alimento, ou um Vestuario ou um Eletrodomestico. 

// - Na classe Principal (no método main), solicite via teclado o nome do arquivo que contém as informações dos produtos e preencha o estoque. Crie um arquivo chamado info.txt com as seguintes informações:

// a) o alimento mais caro

// b) o eletrodoméstico mais barato

// c) o nome e a quantidade em estoque de todos os produtos de vestuário 

package Arquivos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Principal {
    
    public static void main(String[] args) {
        Estoque e = new Estoque("arquivoProdutos.txt");

		String gravaArquivo = "";
		
		Produto[] produtos = e.getProdutos();
		
		gravaArquivo += "Informações do alimento mais caro:\n";
		int posicaoAlimentoMaisCaro = -1;

		for(int i=0; i<produtos.length; i++)
			if(produtos[i] instanceof Alimento){
				posicaoAlimentoMaisCaro = i;
				break;
			}

            if(posicaoAlimentoMaisCaro == -1)
                gravaArquivo += "[Não existem alimentos no estoque]\n";
            else{
                for(int i=posicaoAlimentoMaisCaro+1; i<produtos.length; i++)
                    if(produtos[i] instanceof Alimento)
                        if(produtos[i].getPreco() > produtos[posicaoAlimentoMaisCaro].getPreco())
                            posicaoAlimentoMaisCaro = i;
                gravaArquivo += produtos[posicaoAlimentoMaisCaro]+"\n";
            }


            gravaArquivo += "\nInformações do eletrodoméstico mais barato:\n";
            int posicaoEletrodomesticoMaisBarato = -1;


            for(int i=0; i<produtos.length; i++)
                if(produtos[i] instanceof Eletrodomestico){
                    posicaoEletrodomesticoMaisBarato = i;
                    break;
                }


            if(posicaoEletrodomesticoMaisBarato == -1)
                gravaArquivo += "[Não existem eletrodomésticos no estoque]\n";
            else{
                for(int i=posicaoEletrodomesticoMaisBarato+1; i<produtos.length; i++)
                    if(produtos[i] instanceof Eletrodomestico)
                        if(produtos[i].getPreco() < produtos[posicaoEletrodomesticoMaisBarato].getPreco())
                            posicaoEletrodomesticoMaisBarato = i;
                gravaArquivo += produtos[posicaoEletrodomesticoMaisBarato]+"\n";
            }
		

            gravaArquivo += "\nNome e quantidade em estoque de todos os produtos de vestuário:\n";
            for(int i=0; i<produtos.length; i++)
                if(produtos[i] instanceof Vestuario)
                    gravaArquivo += produtos[i].getNome()+" | Quantidade em estoque: "+((Vestuario)produtos[i]).getQuantidadeEstoque()+"\n";
            
            FileWriter fw = null;
            PrintWriter pw = null;
		
		try {
			 fw = new FileWriter("info.txt");
			 pw = new PrintWriter(fw);
			 
			 pw.write(gravaArquivo);
			 
		} catch (IOException e1) {
			e1.printStackTrace();
		}finally{
			pw.close();
		}
    }
}
