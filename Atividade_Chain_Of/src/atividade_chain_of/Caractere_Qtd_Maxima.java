
package atividade_chain_of;


public class Caractere_Qtd_Maxima extends Verifica_Login{
     public String senhamin = "Tail49teste";
    public String senhamai = "taiL15@824teste20";
    
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
    
     public Caractere_Qtd_Maxima(){
        super(TiposCaractere.Caractere_Qtd_Maxima);
    }
    
    @Override
    public void efetuarlogin(){
        if(!"Tail49teste".equals(this.senhamin)){
            System.out.println("Senha não possui mais de 16 caracteres, senha Cadastrada ");
            
        }else if(!"taiL15@824teste20".equals(this.senhamai)){
            System.out.println("Senha com mais de 16 caracteres, Cadastre uma senha com até 16");
        }
        
    }
}
