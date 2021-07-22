
package singleton_atividade;

import java.util.Scanner;
public class Singleton_Atividade {

    
    public static void main(String[] args) {
        Login cox1 = Login.getlogin();
        System.out.println(cox1);
        Scanner conexao1 = new Scanner(System.in);
        System.out.println(cox1);
        System.out.println("Digite seu usuario");
        String login = conexao1.next();
        System.out.println("Usuario " + login);
        
        Scanner conexao2 = new Scanner(System.in);
        System.out.println(cox1);
        System.out.println("Digite sua senha");
        String Senha = conexao2.next();
        System.out.println("Senha " + Senha);
        
        System.out.println("Login feito com Sucesso");
    }
    
}
