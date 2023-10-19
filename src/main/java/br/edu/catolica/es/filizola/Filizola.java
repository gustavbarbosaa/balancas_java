package br.edu.catolica.es.filizola;

import br.edu.catolica.es.IBalanca;
import br.edu.catolica.es.Produto;

import java.util.ArrayList;
import java.util.List;

public class Filizola implements IBalanca<Produto> {
    @Override
    public void exportar(List<Produto> produtos, String caminhoParaSalvarArquivo) {

        System.out.println(produtos);
    }
}
