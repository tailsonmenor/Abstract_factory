
package atividade_builder;


public class Violao_Director_Venda {
     protected Violao_Builder direcaovenda;

    public Violao_Director_Venda(Violao_Builder direcaovenda) {
        this.direcaovenda = direcaovenda;
    }

    public void ViolaoVender() {
        direcaovenda.TipoDeTarraxa();
        direcaovenda.TipoMaterialCorpo();
        direcaovenda.buildCor();
        direcaovenda.buildPreco();
        direcaovenda.buildTamanhoDoBarço();
        direcaovenda.buildTipoCorda();
    }

    public Violao getVilao() {
        return direcaovenda.getviolao();
    }
}
