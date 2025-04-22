package Pesquisa.atv4;

public class Principal {
    public static void main(String[] args) {
        // Criar alguns produtos perecíveis e não perecíveis
        Data data1 = new Data(10, 12, 2024);
        Data data2 = new Data(15, 6, 2025);
        
        Perecivel p1 = new Perecivel("Leite", "Integral", 5.99, data1, 50);
        Perecivel p2 = new Perecivel("Iogurte", "Natural", 3.99, data2, 30);
        NaoPerecivel np1 = new NaoPerecivel("Arroz", "Tipo 1", 22.90, 100);
        NaoPerecivel np2 = new NaoPerecivel("Feijão", "Preto", 8.50, 80);

        // Criar array de produtos e estoque
        Produto[] produtos = {p1, p2, np1, np2};
        Estoque estoque = new Estoque(produtos);

        // Testar toString dos produtos
        System.out.println("=== Produtos cadastrados ===");
        for (Produto p : produtos) {
            System.out.println(p.toString());
        }

        // Testar ordenação por valor
        System.out.println("\n=== Produtos ordenados por valor ===");
        estoque.ordenaProdutosPorValor();
        for (Produto p : estoque.getArrayProduto()) {
            System.out.println(p.getNome() + " - R$ " + p.getValor());
        }

        // Testar busca de produtos perecíveis
        System.out.println("\n=== Produtos perecíveis ===");
        Perecivel[] pereciveis = estoque.produtosNaoPereciveis();
        for (Perecivel p : pereciveis) {
            System.out.println(p.getNome() + " - Validade: " + p.getValidade());
        }

        // Testar ordenação de perecíveis por quantidade
        System.out.println("\n=== Produtos perecíveis ordenados por quantidade ===");
        Perecivel[] pereciveisOrdenados = estoque.ordenaProdutosPereciveisPorQuantidade(pereciveis);
        for (Perecivel p : pereciveisOrdenados) {
            System.out.println(p.getNome() + " - Quantidade: " + p.getEstoque());
        }
    }
}
