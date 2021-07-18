
package prototype_atividade;


public class Violao_Folk extends Fabrica_violao{
     protected Violao_Folk(Violao_Folk maFolk){
        this.marca = maFolk.getmarca();
    }
    public Violao_Folk(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fabrica_violao clonar() {
        return new Violao_Folk(this);
    }
}
