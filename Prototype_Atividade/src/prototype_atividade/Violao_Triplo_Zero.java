
package prototype_atividade;


public class Violao_Triplo_Zero extends Fabrica_violao{
     protected Violao_Triplo_Zero(Violao_Triplo_Zero maTriplo_Zero){
        this.marca = maTriplo_Zero.getmarca();
    }
    public Violao_Triplo_Zero(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fabrica_violao clonar() {
        return new Violao_Triplo_Zero(this);
    }
}
