package service.Set.ConjuntoDeConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoDeConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigo(int codigoDeConvite) {
        Convidado convidadoRemovido = null;
        for(Convidado elemento : convidadosSet) {
            if (elemento.getCodigoConvite() == codigoDeConvite) {
                convidadoRemovido = elemento;
                break;
            }
        }

        convidadosSet.remove(convidadoRemovido);

    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }


}
