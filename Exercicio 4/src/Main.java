public class Main {

    public static void main(String[] args) {

        Pagamento pagamentoGenerico = new Pagamento();
        Pagamento pagamentoCartao   = new PagamentoCartao();
        Pagamento pagamentoBoleto   = new PagamentoBoleto();

        System.out.println("Demonstração de Polimorfismo");
        pagamentoGenerico.processarPagamento();
        pagamentoCartao.processarPagamento();
        pagamentoBoleto.processarPagamento();

        System.out.println("Usando vetor polimórfico");
        Pagamento[] pagamentos = {
            new PagamentoCartao(),
            new PagamentoBoleto(),
            new Pagamento()
        };

        for (Pagamento p : pagamentos) {
            p.processarPagamento();
        }
    }
}