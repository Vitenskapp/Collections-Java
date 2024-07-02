package service.OrdenarPessoas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    List<Pessoa> listaDePessoas;

    public OrdenacaoPessoas() {
        listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {

        listaDePessoas.add(new Pessoa(nome, idade, altura));

    }

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> listaOrdenada = new ArrayList<>(listaDePessoas);
        Collections.sort(listaOrdenada);

        return listaOrdenada;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> listaOrdenada = new ArrayList<>(listaDePessoas);
        Collections.sort(listaOrdenada, new ComparatorPorAltura());

        return listaOrdenada;
    }

}
