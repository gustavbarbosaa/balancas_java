package br.edu.catolica.es;

import br.edu.catolica.es.urano.Urano;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> listaProdutos = new ArrayList<>();

        var produto1 = new Produto(184, "P", "QUEIJO GRUYERE KG", 21.90);
        var produto2 = new Produto(288, "P", "QUEIJO PROVOLETE KG", 12.29);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        var urano = new Urano();
        urano.exportar(listaProdutos, "aloo");
    }
}