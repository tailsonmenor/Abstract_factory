
package atividade_chain_of;


public class CaractereEspecial extends Verifica_Login{
     public String senhacesp = "tail@";
    public String senhasemesp = "Tail";
    
    public String getsenhasemesp(){
        return senhasemesp;
    }
    
    public String getsenhacesp(){
        return senhacesp;
    }
    public void setsenhasemesp(String senhasemesp){
        this.senhasemesp = senhasemesp;
    }
    public void setsenhacesp(String senhacesp){
        this.senhacesp = senhacesp;
    }
    
     public CaractereEspecial(){
        super(TiposCaractere.CaractereEspecial);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"tail".equals(this.senhasemesp)){
            System.out.println("Não é permitido Senha sem caractere especial");
            
        }else if(!"tail@".equals(this.senhacesp)){
            System.out.println("Senha com caractere especial, senha Cadastrada");
        }
        
    }
}
