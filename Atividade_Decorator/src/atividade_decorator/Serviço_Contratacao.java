
package atividade_decorator;


public class Serviço_Contratacao implements Assinatura{
    public Assinatura assina;

    public Serviço_Contratacao(Assinatura assina) {
        this.assina = assina;
    }

    @Override
    public void assinar() {
        this.assina.assinar();
    }
}
