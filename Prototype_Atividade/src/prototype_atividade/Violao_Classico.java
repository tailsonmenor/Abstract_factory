
package prototype_atividade;


public class Violao_Classico extends Fabrica_violao{
    protected Violao_Classico(Violao_Classico maclassico){
        this.marca = maclassico.getmarca();
    }
    public Violao_Classico(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fabrica_violao clonar() {
        return new Violao_Classico(this);
    }
 }
