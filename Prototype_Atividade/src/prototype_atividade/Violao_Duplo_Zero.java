
package prototype_atividade;

public class Violao_Duplo_Zero extends Fabrica_violao{
     protected Violao_Duplo_Zero(Violao_Duplo_Zero maDuplo_Zero){
        this.marca = maDuplo_Zero.getmarca();
    }
    public Violao_Duplo_Zero(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fabrica_violao clonar() {
        return new Violao_Duplo_Zero(this);
    }
}
