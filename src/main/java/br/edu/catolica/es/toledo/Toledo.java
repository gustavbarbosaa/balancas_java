package br.edu.catolica.es.toledo;

import br.edu.catolica.es.IBalanca;
import br.edu.catolica.es.Produto;

import java.util.ArrayList;
import java.util.List;

public class Toledo implements IBalanca<Produto> {
    private String codigo, tipoProduto, descricao, valorFormatado, validade;
    @Override
    public void exportar(List<Produto> produtos, String caminhoParaSalvarArquivo) {

        System.out.println(produtos);
    }
}
