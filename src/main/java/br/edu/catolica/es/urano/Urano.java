package br.edu.catolica.es.urano;

import br.edu.catolica.es.IBalanca;
import br.edu.catolica.es.Produto;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class Urano implements IBalanca<Produto> {

    @Override
    public void exportar(@NotNull List<Produto> produtos, String caminhoParaSalvarArquivo) {

        for (Produto produto : produtos) {
            String codigo = String.format("%06d", Integer.parseInt(String.valueOf(produto.getCodigo())));
            String tipoProduto = produto.getTipo();
            String descricao = String.format("%-20s", produto.getDescricao());
            int valor = (int) (Float.parseFloat(String.valueOf(produto.getValor())) * 1000);
            String valorFormatado = String.format("%09d", valor);
            String validade = (produto.getValidade() != null ? produto.getValidade() : "000") + "0";

            System.out.println(codigo + "*" + tipoProduto + descricao + valorFormatado + validade);
        }
    }
}

