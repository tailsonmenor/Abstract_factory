
package atividade_chain_of;


public class CaractereMaisculo extends Verifica_Login{
    public String senhamai = "tail";
    public String senhamin = "Tail";
    
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
    
     public CaractereMaisculo(){
        super(TiposCaractere.CaractereMaisculo);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"tail".equals(this.senhamin)){
            System.out.println("Não é permitido Senha somente com caractere Minusculo");
            
        }else if(!"TAIL".equals(this.senhamai)){
            System.out.println("Senha com caractere Maisculo, senha Cadastrada");
        }
        
    }
}
