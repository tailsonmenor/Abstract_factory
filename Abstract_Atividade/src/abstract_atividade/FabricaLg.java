
package abstract_atividade;


public class FabricaLg implements FabricaDeCelular {
     @Override
    public Software criarSoftware(){
      return new Tela_Especial();  
    }
    @Override
    public  Atualizacao criarAtualizacao(){
        return new Java8();
    }
}
