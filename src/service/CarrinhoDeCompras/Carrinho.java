package service.CarrinhoDeCompras;

import java.util.List;
import java.util.ArrayList;

public class Carrinho {
    List<Produto> carrinhoDeCompras;

    public Carrinho() {

        this.carrinhoDeCompras = new ArrayList<>();

    }

    public void adicionarProduto(String nome, double preco, int quantidade) {

        carrinhoDeCompras.add(new Produto(nome, preco, quantidade));

    }

    public void removerProduto(String nome) {

        List<Produto> produtosRemovidos = new ArrayList<>();

        for(Produto element : carrinhoDeCompras) {
            if (element.getNome().equalsIgnoreCase(nome)) {
                produtosRemovidos.add(element);
            }
        }

        carrinhoDeCompras.removeAll(produtosRemovidos);

    }

    public void exibirProdutos() {
        System.out.println(carrinhoDeCompras);
    }

    public double calcularValorTotal() {
        double total = 0;
        for(Produto elemento : carrinhoDeCompras) {
            total += elemento.getPreco();
        }

        return total;

    }
}
