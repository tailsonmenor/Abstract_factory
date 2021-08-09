
package atividade_composite;


public class Assinatura_Prata implements LojaDeQuadrinhos{
    @Override
    public void print(){
        System.out.println("Assinatura Prata");
        System.out.println("Itens que acompanham a assinatura");
        System.out.println("Adesivo R$ 1,00");
        System.out.println("Chaveiro R$ 5,00");
        System.out.println("Camisetas 25,00");
        System.out.println("Canetas 3,00");
        System.out.println("Adesivos 1,00");
        System.out.println("Soma dos itens: 35R$");
        
    }
}
