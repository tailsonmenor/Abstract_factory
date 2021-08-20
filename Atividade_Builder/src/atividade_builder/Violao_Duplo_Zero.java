
package atividade_builder;


public class Violao_Duplo_Zero extends Violao_Builder{
      @Override
    public void buildPreco() {
        violao.preco = 950.00;
    }

    @Override
    public void buildCor() {
        violao.cor = "branco";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipodacorda = "cordas tipo b";
    }

    @Override
    public void buildTamanhoDoBarço() {
        violao.tamanhodobarço = "77";
    }

    @Override
    public void TipoDeTarraxa() {
        violao.tipodetarraxa = "ff";
    }

    @Override
    public void TipoMaterialCorpo() {
        violao.tipomaterialcorpo = "gg";
    }
}
