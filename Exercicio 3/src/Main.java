public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Caneta");
        Produto p2 = new Produto("Caderno", 25.90);
        Produto p3 = new Produto("Mochila", 149.99, 15);

        System.out.println("Produtos cadastrados");
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        p3.exibirInformacoes();
    }
}