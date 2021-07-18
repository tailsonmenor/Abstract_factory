
package prototype_atividade;


public class Violao_Jumbo extends Fabrica_violao{
     protected Violao_Jumbo(Violao_Jumbo maJumbo){
        this.marca = maJumbo.getmarca();
    }
    public Violao_Jumbo(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fabrica_violao clonar() {
        return new Violao_Jumbo(this);
    }
}
