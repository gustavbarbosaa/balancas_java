package br.edu.catolica.es.urano;

import br.edu.catolica.es.IBalanca;
import br.edu.catolica.es.Produto;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Urano implements IBalanca<Produto> {
    private String codigo, tipoProduto, descricao, valorFormatado, validade;

    @Override
    public void exportar(@NotNull List<Produto> produtos, String caminhoParaSalvarArquivo) {

        for (Produto produto : produtos) {
            this.codigo = String.format("%06d", Integer.parseInt(String.valueOf(produto.getCodigo())));
            this.tipoProduto = produto.getTipo();
            this.descricao = String.format("%-20s", produto.getDescricao());
            int valor = (int) (Float.parseFloat(String.valueOf(produto.getValor())) * 1000);
            this.valorFormatado = String.format("%09d", valor);
            this.validade = (produto.getValidade() != null ? produto.getValidade() : "000") + "0";

            System.out.println(this.codigo + "*" + this.tipoProduto + this.descricao + this.valorFormatado + this.validade);
        }
    }
}

