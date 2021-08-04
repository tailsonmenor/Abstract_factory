
package atividade_chain_of;


public class CadastroLogin extends Verifica_Login{
    public String Cliente = "Tailson";
    
    public String getCliente(){
        return Cliente;
    }
    
    public void setCliente(String Cliente){
        this.Cliente = Cliente;
    }
    
    public CadastroLogin(){
        super(TiposCaractere.CadastroLogin);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"Tailson".equals(this.Cliente)){
            System.out.println("Usuario já cadastrado");
        }
        System.out.println("Cliente Cadastrado!!!");
    }
}
