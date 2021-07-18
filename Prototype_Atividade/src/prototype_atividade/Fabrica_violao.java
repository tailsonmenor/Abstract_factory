
package prototype_atividade;


public abstract class Fabrica_violao {
    protected String marca;
        public abstract String exibirInfo();
        public abstract Fabrica_violao clonar();
        public String getmarca(){
    return marca;
}
         public void setmarca(String Marca){
             this.marca = Marca;
         }
}
