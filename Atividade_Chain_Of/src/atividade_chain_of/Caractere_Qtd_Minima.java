
package atividade_chain_of;


public class Caractere_Qtd_Minima extends Verifica_Login{
     public String senhamin = "Tail4";
    public String senhamai = "taiL15@8";
    
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
    
     public Caractere_Qtd_Minima(){
        super(TiposCaractere.Caractere_Qtd_Minima);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"Tail4".equals(this.senhamin)){
            System.out.println("Senha não possui 8 caracteres, Cadastre uma senha com no minimo 8 caracteres");
            
        }else if(!"taiL15@8".equals(this.senhamai)){
            System.out.println("Senha com 8 caracteres, Senha Cadastrada");
        }
        
    }
}
