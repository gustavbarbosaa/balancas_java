package br.edu.catolica.es;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public interface IBalanca<T> {
     void exportar(List<T> produtos, String caminhoParaSalvarArquivo) throws IOException;
}
