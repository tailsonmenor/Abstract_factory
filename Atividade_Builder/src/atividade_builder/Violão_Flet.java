
package atividade_builder;


public class Violão_Flet extends Violao_Builder{
     @Override
    public void buildPreco() {
       violao.preco = 300.00;
    }

    @Override
    public void buildCor() {
       violao.cor = "preto";
    }

    @Override
    public void buildTipoCorda() {
      violao.tipodacorda = "cordas nylon";
    }

    @Override
    public void buildTamanhoDoBarço() {
        violao.tamanhodobarço = "15";
    }

    @Override
    public void TipoDeTarraxa() {
       violao.tipodetarraxa = "aa";
    }

    @Override
    public void TipoMaterialCorpo() {
        violao.tipomaterialcorpo = "bb";
    }
}
