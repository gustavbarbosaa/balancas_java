package br.edu.catolica.es.urano;

import br.edu.catolica.es.IBalanca;
import br.edu.catolica.es.Produto;

import java.util.List;

public class Urano implements IBalanca<Produto> {

    String codigo, tipoProduto, descricao, valorFormatado, validade;
    @Override
    public String exportar(List<Produto> produtos, String caminhoParaSalvarArquivo) {
        produtos.forEach(produto -> {
           codigo = String.format("%06d", Integer.parseInt(String.valueOf(produto.getCodigo())));
           tipoProduto = produto.getTipo();
           descricao = String.format("%-20s", produto.getDescricao());
           int valor = (int) (Float.parseFloat(String.valueOf(produto.getValor())) * 1000);
           valorFormatado = String.format("%09d", valor);
           validade = (produto.getValidade() != null ? produto.getValidade() : "000") + "0";
        });
        return codigo + "*" + tipoProduto + descricao + valorFormatado + validade;
    }
}

