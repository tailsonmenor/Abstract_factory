
package prototype_atividade;


import java.util.Scanner;

public class Prototype_Atividade {

    
    public static void main(String[] args) {
       Violao_12cordas toque1 = new Violao_12cordas();
        Fabrica_violao escolha1 = toque1.clonar();
        Scanner tipvi = new Scanner(System.in);
        System.out.println(escolha1.exibirInfo());
        System.out.println("Digite qual tipo de violão deseja usar");
        String Marca = tipvi.next();
        System.out.println("tipo de marca escolhida pelo usuario " +Marca);
        
    }
    
}
