
package atividade_chain_of;


public class CaractereMinusculo extends Verifica_Login{
    public String senhamin = "taiL";
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
    
     public CaractereMinusculo(){
        super(TiposCaractere.CaractereMinusculo);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"taiL".equals(this.senhamin)){
            System.out.println("Senha com caractere Minusculo, Senha Cadastrado");
            
        }else if(!"TAIL".equals(this.senhamai)){
            System.out.println("Não é permitido Senha somente com caractere Maisculo");
        }
        
    }
}
