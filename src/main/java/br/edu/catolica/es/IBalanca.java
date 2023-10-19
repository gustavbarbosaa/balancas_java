package br.edu.catolica.es;

import java.util.List;

public interface IBalanca<T> {
     String exportar(List<T> produtos, String caminhoParaSalvarArquivo);
}
