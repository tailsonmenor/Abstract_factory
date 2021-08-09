
package atividade_composite;

import java.util.ArrayList;
import java.util.List;


public class Assinatura_Composite implements LojaDeQuadrinhos{
      private List<LojaDeQuadrinhos> childAssinaturas = new ArrayList<LojaDeQuadrinhos>();


    @Override
    public void print() {
        for (LojaDeQuadrinhos assinatura : childAssinaturas) {
            assinatura.print();
        }
   
}
      
    public void add(LojaDeQuadrinhos assinaturas){
        childAssinaturas.add(assinaturas);
    }


    public void remove(LojaDeQuadrinhos assinaturas){
        childAssinaturas.remove(assinaturas);
    }

}
