
package padrao_adapter_atividade;

public class Padrao_Adapter_Atividade {

   
    public static void main(String[] args) {
        System.out.println("Perfil de Usuario \n 1 Gratuito \n 2 "
                + "Básico \n 3 Ultimate");  
       
           Paradox C = new
                Paradox();
       Conectar_SGBD Nova_conexao = new
                Conectar_SGBD(C);
       Nova_conexao.ConectarSGBDFirebird(); 
      
              Firebird C1 = new
        Firebird();
        Conectar_SGBD Nova_conexao1 = new
         Conectar_SGBD(C1);
        Nova_conexao1.ConectarSGBDParadox();   
         
            
        MySQL C3 = new
                MySQL();
        Conectar_SGBD Nova_conexao3 = new
                Conectar_SGBD(C3);
        Nova_conexao3.ConectarSGBDMySQL(); 
        }
       
   
        }
            

