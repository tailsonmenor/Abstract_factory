
package prototype_atividade;


public class Violao_Flet extends Fabrica_violao{
     protected Violao_Flet(Violao_Flet maFlet){
        this.marca = maFlet.getmarca();
    }
    public Violao_Flet(){
        marca = "";
    }
    
    @Override
    public String exibirInfo() {
        return "Marca: "+ getmarca();
    }

    @Override
    public Fabrica_violao clonar() {
        return new Violao_Flet(this);
    }
}
