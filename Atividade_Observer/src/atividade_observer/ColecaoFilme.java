package atividade_observer;

public class ColecaoFilme implements Notificação {

    @Override
    public void update(Object obj) {
        System.out.println("novo filme adicionado");
    }
}
