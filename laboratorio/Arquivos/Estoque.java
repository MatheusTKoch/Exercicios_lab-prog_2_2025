// Considere as seguintes informações: 

// - você deve criar uma classe abstrata chamada Produto. Os tipos de produto são Alimento, Vestuário e Eletrodomésticos. Cada tipo de produto possui 3 informações iguais (nome, descrição, preço), e cada um deles possui uma informação extra: alimentos possuem uma data de validade; produtos de vestuário possuem uma quantidade em estoque; eletrodomésticos possuem um valor adicional de IPI.

// - crie uma classe Estoque, que tem um array de Produto como atributo. Esta classe deve possuir um método chamado preencheEstoque, que recebe o nome do arquivo de produtos como parâmetro. Neste método, o arquivo de produtos deve ser lido o método deve armazenar todas as informações do arquivo no array do tipo Produto, onde cada posição terá ou um Alimento, ou um Vestuario ou um Eletrodomestico. 

// - Na classe Principal (no método main), solicite via teclado o nome do arquivo que contém as informações dos produtos e preencha o estoque. Crie um arquivo chamado info.txt com as seguintes informações:

// a) o alimento mais caro

// b) o eletrodoméstico mais barato

// c) o nome e a quantidade em estoque de todos os produtos de vestuário 

package Arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException; 

public class Estoque {
    private Produto[] produtos;
    private BufferedReader br;

    public Estoque(String nomeArquivoEstoque) {
        preencheEstoque(nomeArquivoEstoque);
    }

    public void preencheEstoque(String nomeArquivo) {
        try {
            FileReader fileName = new FileReader(nomeArquivo);
            br = new BufferedReader(fileName);
            fileName = new FileReader(nomeArquivo);
            br = new BufferedReader(fileName);

            int quantProdutos = 0;

			String line = br.readLine();
			while(line != null) {
				quantProdutos++;
				line = br.readLine();
			}
			
			System.out.println("QUANT PRODUTOS: "+quantProdutos);

			br.close();

			produtos = new Produto[quantProdutos-1];

			System.out.println("Quantidade de produtos no arquivo: "+produtos.length);

			fileName = new FileReader(nomeArquivo);
			br = new BufferedReader(fileName);

			br.readLine(); 

			for(int i=0; i<produtos.length; i++) {
				line = br.readLine();
				String[] separada = line.split("\\s\\*\\s");
				String tipo = separada[0];
				String descricao = separada[1];
				double preco = Double.parseDouble(separada[2]);
				if(separada[3].equalsIgnoreCase("Alimento")) {
					String dataValidade = separada[4];
					produtos[i] = new Alimento(preco, descricao, tipo, dataValidade);
				}else if(separada[3].equalsIgnoreCase("Vestuario")) {
					int quantidadeEstoque = Integer.parseInt(separada[4]);
					produtos[i] = new Vestuario(preco, descricao, tipo, quantidadeEstoque);
				}else if(separada[3].equalsIgnoreCase("Eletrodomestico")) {
					double ipi = Double.parseDouble(separada[4]);
					produtos[i] = new Eletrodomestico(preco, descricao, tipo, ipi);
				}
			}
			br.close();

            
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public void imprimeEstoque() throws IllegalArgumentException{
		if(produtos == null)
			throw new IllegalArgumentException();
		for(Produto p: produtos)
			System.out.println(p);
	} 
}

