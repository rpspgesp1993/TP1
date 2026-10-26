public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor 1: apenas o nome
    public Produto(String nome) {
        this.nome = nome;
        this.preco = 0.0;
        this.quantidadeEstoque = 0;
    }

    // Construtor 2: nome e preço
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = 0;
    }

    // Construtor 3: nome, preço e quantidade em estoque
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método para exibir as informações do produto
    public void exibirInformacoes() {
        System.out.printf("Produto: %s | Preço: R$ %.2f | Estoque: %d%n",
                nome, preco, quantidadeEstoque);
    }
}