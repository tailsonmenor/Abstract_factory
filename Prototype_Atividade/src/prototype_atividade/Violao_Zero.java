
package prototype_atividade;


public class Violao_Zero extends Fabrica_violao{
     protected Violao_Zero(Violao_Zero mazero){
        this.marca = mazero.getmarca();
    }
    public Violao_Zero(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fabrica_violao clonar() {
        return new Violao_Zero(this);
    }
}
