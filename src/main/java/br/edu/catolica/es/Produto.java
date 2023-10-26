package br.edu.catolica.es;

import lombok.Data;

@Data
public class Produto {
    private int codigo;
    private String descricao, tipo, validade;
    private double valor;
}
