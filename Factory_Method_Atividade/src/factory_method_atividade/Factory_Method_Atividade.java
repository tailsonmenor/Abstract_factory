
package factory_method_atividade;

import javax.swing.JOptionPane;


public class Factory_Method_Atividade {

   
    public static void main(String[] args) {
        
        Factory_Fabrica_Esportiva fac = new Factory_Fabrica_Esportiva();
        String marca ;
        String time ;
        marca = JOptionPane.showInputDialog("Digite a marca");
        time = JOptionPane.showInputDialog("Digite o time");
    }
    
}
