package br.edu.catolica.es.toledo;

import br.edu.catolica.es.IBalanca;
import br.edu.catolica.es.Produto;

import java.util.List;

public class Toledo implements IBalanca<Produto> {
    @Override
    public String exportar(List<Produto> produtos, String caminhoParaSalvarArquivo) {

        return caminhoParaSalvarArquivo;
    }
}
