
package singleton_atividade;


public class Login {
    private static Login login = null;
    private String Usuario;
    private String Senha;
    private Login(){}
    static Login getlogin(){
        if(login == null){
            login = new Login();
        }
         return login;
    }
    public String getUsuario(){
        return Usuario;
    }
     public void setUsuario(String Usuario){
        this.Usuario = Usuario;
         
}
      public String setSenha(){
        return Senha;
    }
     public void setSenha(String Senha){
        this.Senha = Senha;
        
}
     
}
    
