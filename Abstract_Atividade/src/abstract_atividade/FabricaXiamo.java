
package abstract_atividade;


public class FabricaXiamo implements FabricaDeCelular {
    @Override
    public Software criarSoftware(){
      return new Tela_Simples();  
    }
    @Override
    public  Atualizacao criarAtualizacao(){
        return new Java9();
    }
}
