
package prototype_atividade;


public class Violao_12cordas extends Fabrica_violao{
     protected Violao_12cordas(Violao_12cordas ma12cordas){
        this.marca = ma12cordas.getmarca();
    }
    public Violao_12cordas(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fabrica_violao clonar() {
        return new Violao_12cordas(this);
    }
}
