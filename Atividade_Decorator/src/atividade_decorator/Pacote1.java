
package atividade_decorator;


public class Pacote1 extends Serviço_Contratacao{
     public Pacote1(Assinatura assina) {
        super(assina);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Tipo de pacote 1, aqui você assisti"
                + " em diferentes dispositovos por 19,99R$");
     
    }
}
