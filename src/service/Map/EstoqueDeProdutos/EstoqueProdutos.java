package service.Map.EstoqueDeProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos() {
        this.estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade) {
        estoqueProdutos.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirTodosOsProdutos() {
        System.out.println(estoqueProdutos);
    }

    public double calcularValorTotalDoEstoque() {
        double valorTotal = 0d;

        if(!estoqueProdutos.isEmpty()) {
            for(Produto elemento : estoqueProdutos.values()) {
                valorTotal += elemento.getQuantidade() * elemento.getPreco();
            }
        }

        return valorTotal;

    }

    public double obterValorMaisCaro() {
        double maiorValor = 0d;

        if(!estoqueProdutos.isEmpty()) {
            for(Produto elemento : estoqueProdutos.values()) {
                if(elemento.getPreco() > maiorValor) {
                    maiorValor = elemento.getPreco();
                }
            }
        }

        return maiorValor;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(99524L, "Bala", 89.98, 59);
        estoque.adicionarProduto(4324L, "Sopa", 25.98, 45);
        estoque.adicionarProduto(43524L, "Brinquedo", 62.98, 95);
        estoque.adicionarProduto(31424L, "Casca", 154.98, 23);

        estoque.exibirTodosOsProdutos();
        System.out.println(estoque.obterValorMaisCaro());
        System.out.println(estoque.calcularValorTotalDoEstoque());



    }
}
