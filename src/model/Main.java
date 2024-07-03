package model;
import service.List.CarrinhoDeCompras.Carrinho;
import service.List.CatalogoDeLivros.CatalogoLivros;
import service.List.OrdenarPessoas.OrdenacaoPessoas;
import service.List.Tarefas.ListaTarefas;
import service.Set.AgendaDeContatos.AgendaContatos;
import service.Set.CadastroProdutos.CadastroProdutos;
import service.Set.ConjuntoDeConvidados.ConjuntoDeConvidados;

public class Main {
    public static void main(String[] args) {

        // Lista de tarefas teste
        ListaTarefas lista = new ListaTarefas();

        lista.adicionarTarefa("Comer terra");
        lista.adicionarTarefa("Comer terra");
        lista.adicionarTarefa("Comer pedra");
        lista.adicionarTarefa("Comer tijolo");

        System.out.println(lista.obterNumeroDeTarefas());
        lista.obterDescricoesTarefas();

        lista.removerTarefa("Comer terra");

        System.out.println(lista.obterNumeroDeTarefas());
        lista.obterDescricoesTarefas();


        //Carrinho de compras teste
        Carrinho carrinhoDeCompras = new Carrinho();

        carrinhoDeCompras.adicionarProduto("Alfredo", 99.10, 10);
        carrinhoDeCompras.adicionarProduto("Alfredo", 99.10, 10);
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        carrinhoDeCompras.exibirProdutos();


        //Catalogo de livros teste
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Ás margens do Rio Seco", "Everaldo", 2014);
        catalogo.adicionarLivro("Memórias póstumas", "Everaldo", 2010);
        catalogo.adicionarLivro("O cume dói", "Antônio", 2020);

        catalogo.pesquisarPorAutor("Everaldo");
        catalogo.pesquisarPorIntervalo(2010, 2020);
        catalogo.pesquisarPorTitulo("O cume dói");


        //OrdenarPessoas teste
        OrdenacaoPessoas ordenacao = new OrdenacaoPessoas();

        ordenacao.adicionarPessoa("Fabricio", 25, 1.75);
        ordenacao.adicionarPessoa("Almeida", 15, 1.90);
        ordenacao.adicionarPessoa("Júlio", 15, 2.75);
        ordenacao.adicionarPessoa("Angelica", 35, 1.55);

        System.out.println(ordenacao.ordenarPorAltura());
        System.out.println(ordenacao.ordernarPorIdade());


        //Set conjunto de convidados teste
        ConjuntoDeConvidados convidados = new ConjuntoDeConvidados();

        convidados.adicionarConvidado("Heitor", 4002);
        convidados.adicionarConvidado("Marcos", 8922);

        System.out.println(convidados.contarConvidados());
        convidados.exibirConvidados();

        convidados.removerConvidadoPorCodigo(4002);

        System.out.println(convidados.contarConvidados());
        convidados.exibirConvidados();


        //Set agenda de contatos teste
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Heitor", 40028922);
        agenda.adicionarContato("Fabircio", 19965428);

        agenda.exibirContato();
        System.out.println(agenda.pesquisarPorNome("Heitor"));
        agenda.atualizarNumeroDeContato("Heitor", 25);
        agenda.exibirContato();



        //Set cadastro produtos teste
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(999, "Pote de mel", 3.55, 90);
        cadastro.adicionarProduto(854, "Coisa de coisas", 55.87, 8);
        cadastro.adicionarProduto(523, "Licença de mel", 12.55, 30);
        cadastro.adicionarProduto(478, "Slk de coisas", 32.87, 8);

        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println(cadastro.exibirProdutosPorPreco());
        cadastro.exibirProdutos();







    }
}