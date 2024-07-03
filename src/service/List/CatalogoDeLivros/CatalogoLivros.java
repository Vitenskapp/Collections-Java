package service.List.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    List<Livro> catalogoDeLivros = new ArrayList<>();

    public void adicionarLivro(String titulo, String autor, int anoDePublicacao) {

        catalogoDeLivros.add(new Livro(titulo, autor, anoDePublicacao));

    }

    public void pesquisarPorAutor(String autor) {
        List<Livro> livrosParaExibir = new ArrayList<>();

        for(Livro elemento : catalogoDeLivros) {
            if(elemento.getAutor().equalsIgnoreCase(autor)) {
                livrosParaExibir.add(elemento);
            }
        }

        System.out.println(livrosParaExibir);
    }

    public void pesquisarPorIntervalo(int anoInicial, int anoFinal) {
        List<Livro> livrosParaExibir = new ArrayList<>();

        for(Livro elemento : catalogoDeLivros) {
            if(elemento.getAnoDePublicacao() > anoInicial && elemento.getAnoDePublicacao() < anoFinal) {
                livrosParaExibir.add(elemento);
            }
        }

        System.out.println(livrosParaExibir);

    }

    public void pesquisarPorTitulo(String titulo) {
        List<Livro> livrosParaExibir = new ArrayList<>();

        for(Livro elemento : catalogoDeLivros) {
            if(elemento.getTitulo().equalsIgnoreCase(titulo)) {
                livrosParaExibir.add(elemento);
            }
        }

        System.out.println(livrosParaExibir);

    }

}
