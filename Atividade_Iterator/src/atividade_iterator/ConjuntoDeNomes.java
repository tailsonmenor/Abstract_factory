
package atividade_iterator;
import java.util.ArrayList;

public abstract class ConjuntoDeNomes {
     protected ArrayList<Nomes> registros;

    public ConjuntoDeNomes() {
        registros = new ArrayList<Nomes>();
    }

    public int count() {
        return registros.size();
    }

    public IteradorNomes criarIterator() {
        return new IteradorNomes(registros);
    }
}
