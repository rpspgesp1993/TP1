package br.edu.fatec.exerrcicio2;

public class Main {

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        conta1.numeroConta = "";
        conta1.saldoAtual = 1024;
        conta1.titular = "Vladmir";
        conta1.agencia = "0001";

        ContaBancaria conta2 = new ContaBancaria();
        conta2.numeroConta = "67890";
        conta2.saldoAtual = 1048;
        conta2.titular = "Josefa";
        conta2.agencia = "0002";

        System.out.println("Conta 1: " + conta1.titular);
        conta1.depositar(500);

        System.out.println("Conta 2: " + conta2.titular);
        conta2.sacar(300);


        Produto produto1 = new Produto();
        produto1.codigoSKU = "SKU001";
        produto1.nome = "Notebook";
        produto1.preco = 3500;
        produto1.quantidadeEstoque = 10;

        Produto produto2 = new Produto();
        produto2.codigoSKU = "SKU002";
        produto2.nome = "Mouse";
        produto2.preco = 100;
        produto2.quantidadeEstoque = 30;

        System.out.println("Produto 1: " + produto1.nome);
        produto1.cadastrar();

        System.out.println("Produto 2: " + produto2.nome);
        produto2.atualizar();

        Pedido pedido1 = new Pedido();
        pedido1.numeroIdentificacao = 1001;
        pedido1.dataCriacao = "13/09/2026";
        pedido1.valorTotal = 500;
        pedido1.status = "Novo";

        Pedido pedido2 = new Pedido();
        pedido2.numeroIdentificacao = 1002;
        pedido2.dataCriacao = "13/09/2026";
        pedido2.valorTotal = 800;
        pedido2.status = "Novo";

        System.out.println("Pedido 1: " + pedido1.numeroIdentificacao);
        pedido1.solicitar();

        System.out.println("Pedido 2: " + pedido2.numeroIdentificacao);
        pedido2.pagar();

        Cliente cliente1 = new Cliente();
        cliente1.nomeCompleto = "José da Rocha";
        cliente1.cpfCnpj = "111.111.111-11";
        cliente1.endereco = "Rua Dos Bobos,numero 0";
        cliente1.email = "jose_rocha@email.com";

        Cliente cliente2 = new Cliente();
        cliente2.nomeCompleto = "Maria Souza";
        cliente2.cpfCnpj = "222.222.222-22";
        cliente2.endereco = "Rua B";
        cliente2.email = "maria@email.com";

        System.out.println("Cliente 1: " + cliente1.nomeCompleto);
        cliente1.cadastrar();

        System.out.println("Cliente 2: " + cliente2.nomeCompleto);
        cliente2.comprar();

        Usuario usuario1 = new Usuario();
        usuario1.login = "joao123";
        usuario1.senha = "abc123";
        usuario1.nivelPermissao = "Administrador";
        usuario1.statusAtivo = true;

        Usuario usuario2 = new Usuario();
        usuario2.login = "maria456";
        usuario2.senha = "xyz456";
        usuario2.nivelPermissao = "Usuário";
        usuario2.statusAtivo = true;

        System.out.println("Usuário 1: " + usuario1.login);
        usuario1.autenticar();

        System.out.println("Usuário 2: " + usuario2.login);
        usuario2.deslogar();

        Aplicativo aplicativo1 = new Aplicativo();
        aplicativo1.nome = "WhatsApp";
        aplicativo1.versao = "2.0";
        aplicativo1.desenvolvedor = "Meta";
        aplicativo1.tamanho = 150;

        Aplicativo aplicativo2 = new Aplicativo();
        aplicativo2.nome = "Spotify";
        aplicativo2.versao = "5.0";
        aplicativo2.desenvolvedor = "Spotify";
        aplicativo2.tamanho = 200;

        System.out.println("Aplicativo 1: " + aplicativo1.nome);
        aplicativo1.executar();

        System.out.println("Aplicativo 2: " + aplicativo2.nome);
        aplicativo2.fechar();


        Site site1 = new Site();
        site1.url = "https://www.sbt.com";
        site1.dominio = "sbt.com";
        site1.hospedagem = "Hostgate";
        site1.layout = "Responsivo";

        Site site2 = new Site();
        site2.url = "https://www.tvsergipe.globo.com";
        site2.dominio = "globo.com";
        site2.hospedagem = "globo";
        site2.layout = "Institucional";

        System.out.println("Site 1: " + site1.url);
        site1.navegar();

        System.out.println("Site 2: " + site2.url);
        site2.carregar();



        BancoDeDados banco1 = new BancoDeDados();
        banco1.nomeServidor = "Servidor01";
        banco1.quantidadeTabelas = 10;
        banco1.capacidade = 500;
        banco1.SGBD = "MySQL";

        BancoDeDados banco2 = new BancoDeDados();
        banco2.nomeServidor = "Servidor02";
        banco2.quantidadeTabelas = 20;
        banco2.capacidade = 1000;
        banco2.SGBD = "PostgreSQL";

        System.out.println("Banco 1: " + banco1.nomeServidor);
        banco1.consultar();

        System.out.println("Banco 2: " + banco2.nomeServidor);
        banco2.inserir();


        Senha senha1 = new Senha();
        senha1.caracteresAlfanumericos = "abc123";
        senha1.nivelForca = "Forte";
        senha1.criptografia = "AES";
        senha1.dataAlteracao = "13/09/2026";

        Senha senha2 = new Senha();
        senha2.caracteresAlfanumericos = "xyz789";
        senha2.nivelForca = "Média";
        senha2.criptografia = "SHA-256";
        senha2.dataAlteracao = "12/09/2026";

        System.out.println("Senha 1: " + senha1.nivelForca);
        senha1.validar();

        System.out.println("Senha 2: " + senha2.nivelForca);
        senha2.redefinir();
    }
}