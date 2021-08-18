package atividade_iterator;

import java.util.ArrayList;

public class IteradorNomes {

    ArrayList<Nomes> lista;
    int contador;

    protected IteradorNomes(ArrayList<Nomes> lista) {
        this.lista = lista;
        contador = 0;
    }

    public void first() {
        contador = 0;
    }

    public void proximoNome() {
        contador++;
    }

    public void voltarNome() {
        contador--;
    }

    public boolean isDone() {
        return contador == lista.size();
    }

    private Nomes currentNomes() {
        if (isDone()) {
            contador = lista.size() - 1;
        } else if (contador < 0) {
            contador = 0;
        }
        return lista.get(contador);
    }

    public String getNome() {
        return currentNomes().registros;
    }
}
