
package atividade_decorator;


public class Pacote4 extends Serviço_Contratacao{
    public Pacote4(Assinatura assina) {
        super(assina);
    }

    @Override
    public void assinar() {
        super.assinar();
        System.out.println("Tipo de pacote 4, aqui você tem"
   + " Cartão de crédito Platinum por 49,99R$");

    }
}
