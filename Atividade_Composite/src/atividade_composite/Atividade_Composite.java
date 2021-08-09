
package atividade_composite;


public class Atividade_Composite {

   
    public static void main(String[] args) {
      Assinatura_Ouro assinaouro = new Assinatura_Ouro();
      Assinatura_Bronze assbronze = new Assinatura_Bronze();
      Assinatura_Platina assplatina = new Assinatura_Platina();
      Assinatura_Prata assoprata = new Assinatura_Prata();
      
      Assinatura_Composite lojaouro = new Assinatura_Composite();
      Assinatura_Composite lojabronze = new Assinatura_Composite();
      Assinatura_Composite lojaplatina = new Assinatura_Composite();
      Assinatura_Composite lojaprata = new Assinatura_Composite();
      
      lojaouro.add(assinaouro);
      lojabronze.add(assbronze);
      lojaplatina.add(assplatina);
      lojaprata.add(assoprata);
      
      lojaouro.print();
      lojabronze.print();
      lojaplatina.print();
      lojaprata.print();
    }
    
}
