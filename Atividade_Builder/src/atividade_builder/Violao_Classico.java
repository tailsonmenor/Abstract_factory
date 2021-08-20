
package atividade_builder;


public class Violao_Classico extends Violao_Builder{

    @Override
    public void buildPreco() {
       violao.preco = 100.00;
    }

    @Override
    public void buildCor() {
       violao.cor = "Roxo";
    }

    @Override
    public void buildTipoCorda() {
      violao.tipodacorda = "nylon";
    }

    @Override
    public void buildTamanhoDoBarço() {
        violao.tamanhodobarço = "25";
    }

    @Override
    public void TipoDeTarraxa() {
       violao.tipodetarraxa = "tt";
    }

    @Override
    public void TipoMaterialCorpo() {
        violao.tipomaterialcorpo = "ddd";
    }
    
}
