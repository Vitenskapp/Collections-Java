package service.Set.AgendaDeContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosParaExibir = new HashSet<>();

        for(Contato elemento : contatoSet) {
            if(elemento.getNome().startsWith(nome)) {
                contatosParaExibir.add(elemento);
            }
        }

        return contatosParaExibir;
    }

    public Contato atualizarNumeroDeContato(String nome, int numero) {
        Contato contatoAtualizado = null;

        for(Contato elemento : contatoSet) {
            if(elemento.getNome().equalsIgnoreCase(nome)){
                elemento.setNumero(numero);
                contatoAtualizado = elemento;
                break;
            }
        }

        return contatoAtualizado;
    }

}
