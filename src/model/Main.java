package model;
import service.CarrinhoDeCompras.Carrinho;
import service.CatalogoDeLivros.CatalogoLivros;
import service.OrdenarPessoas.OrdenacaoPessoas;
import service.Tarefas.ListaTarefas;

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


    }
}