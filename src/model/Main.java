package model;
import service.CarrinhoDeCompras.Carrinho;
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


    }
}