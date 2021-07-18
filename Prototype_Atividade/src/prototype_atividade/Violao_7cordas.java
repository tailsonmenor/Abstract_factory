
package prototype_atividade;


public class Violao_7cordas extends Fabrica_violao{
     protected Violao_7cordas(Violao_7cordas ma7cordas){
        this.marca = ma7cordas.getmarca();
    }
    public Violao_7cordas(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fabrica_violao clonar() {
        return new Violao_7cordas(this);
    }
}
