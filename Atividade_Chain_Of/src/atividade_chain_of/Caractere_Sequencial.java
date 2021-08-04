
package atividade_chain_of;


public class Caractere_Sequencial extends Verifica_Login{
      public String senhamin = "Tail4";
    public String senhamai = "taiL567";
    
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
    
     public Caractere_Sequencial(){
        super(TiposCaractere.Caracter_Sequencial);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"Tail4".equals(this.senhamin)){
            System.out.println("Senha não possui sequencia, Senha Cadastrada");
            
        }else if(!"taiL567".equals(this.senhamai)){
            System.out.println("Não é permitido Senha com ordem sequencial");
        }
        
    }
}
