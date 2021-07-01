
package abstract_atividade;

public class Abstract_Atividade {

    
    public static void main(String[] args) {
         
         FabricaDeCelular fab_lg = new FabricaLg();
         Software fab1 = fab_lg.criarSoftware();
         fab1.exibirInfoSotware();
         Atualizacao fab2 = fab_lg.criarAtualizacao();
         fab2.exibirInfoAtualizacao();
         
         FabricaDeCelular fab_xia = new FabricaXiamo();
         Atualizacao fab3 = fab_xia.criarAtualizacao();
         fab3.exibirInfoAtualizacao();
         Software fab4 = fab_xia.criarSoftware();
         fab4.exibirInfoSotware();
    }
    
}
