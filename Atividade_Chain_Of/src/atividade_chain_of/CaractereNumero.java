
package atividade_chain_of;


public class CaractereNumero extends Verifica_Login{
     public String senhamin = "taiL5";
    public String senhamai = "TAIL";
    
    public String getsenhamin(){
        return senhamin;
    }
    
    public String getsenhamai(){
        return senhamai;
    }
    public void setsenhamin(String senhamin){
        this.senhamin = senhamin;
    }
    public void setsenhamai(String senhamai){
        this.senhamai = senhamai;
    }
    
     public CaractereNumero(){
        super(TiposCaractere.CaractereNumero);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"taiL5".equals(this.senhamin)){
            System.out.println("Senha com caractere Numero, Senha Cadastrada");
            
        }else if(!"TAIL".equals(this.senhamai)){
            System.out.println("Não é permitido Senha sem caractere numero");
        }
        
    }
}
