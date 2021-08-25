package atividade_observer;

public interface Notifica {

    public void registerObserver(Notifica observer);

    public void removeObserver(Notifica observer);

    public void notifyObservers();
}
