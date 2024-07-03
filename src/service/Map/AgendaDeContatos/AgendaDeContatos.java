package service.Map.AgendaDeContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaDeContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if(!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer valorDeRetorno = null;
        if(!agendaContatoMap.isEmpty()){
            valorDeRetorno = agendaContatoMap.get(nome);
        }

        return valorDeRetorno;
    }

    public static void main(String[] args) {
        AgendaDeContatos agenda = new AgendaDeContatos();

        agenda.adicionarContato("Oswald", 658742);
        agenda.adicionarContato("Andrade", 9985742);

        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Oswald"));
        agenda.removerContato("Andrade");
        agenda.exibirContatos();



    }
}
