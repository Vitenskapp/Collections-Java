package service.Set.CadastroProdutos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private final Set<Produto> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(int codigo, String nome, double preco, int quantidade) {
        produtosSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosOrganizadosNome = new TreeSet<>(produtosSet);

        return produtosOrganizadosNome;

    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosOrganizadosPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosOrganizadosPreco.addAll(produtosSet);

        return produtosOrganizadosPreco;
    }

    public void exibirProdutos() {
        System.out.println(produtosSet);
    }




}
