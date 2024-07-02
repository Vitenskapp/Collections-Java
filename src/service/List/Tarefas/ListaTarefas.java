package service.Tarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> ListaDeTarefas;

    public ListaTarefas() {
        this.ListaDeTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {

        ListaDeTarefas.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao) {

        List<Tarefa> tarefasRemovidas = new ArrayList<>();

        for(Tarefa element : ListaDeTarefas) {
            if (element.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasRemovidas.add(element);
            }
        }

        ListaDeTarefas.removeAll(tarefasRemovidas);

    }

    public int obterNumeroDeTarefas() {
        return ListaDeTarefas.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(ListaDeTarefas);
    }

}
