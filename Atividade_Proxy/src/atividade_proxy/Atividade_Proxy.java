
package atividade_proxy;


public class Atividade_Proxy {

  
    public static void main(String[] args) {
          Tela tela = new Proxy_Login("Usuario_Conectado");
//image chama loaded from disk
        
        tela.Login_Tela();
        System.out.println("");
//com o objeto criado nã chama loaded from disk
        
        tela.Login_Tela();
    }
    
}
