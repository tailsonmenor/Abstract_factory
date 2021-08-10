
package atividade_decorator;

public class Atividade_Decorator {

    
    public static void main(String[] args) {
        System.out.println("Assinaturas contratadas pelo usuario");
       
       Assinatura tipoassina1 = new Pacote1(new Assinatura_Basica());
       tipoassina1.assinar();
       
       
       
    }
    
}
