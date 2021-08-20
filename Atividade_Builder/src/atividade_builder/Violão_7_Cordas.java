
package atividade_builder;

public class Violão_7_Cordas extends Violao_Builder{
      @Override
    public void buildPreco() {
        violao.preco = 500.00;
    }

    @Override
    public void buildCor() {
        violao.cor = "amarelo";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipodacorda = "afinada";
    }

    @Override
    public void buildTamanhoDoBarço() {
        violao.tamanhodobarço = "65";
    }

    @Override
    public void TipoDeTarraxa() {
        violao.tipodetarraxa = "qq";
    }

    @Override
    public void TipoMaterialCorpo() {
        violao.tipomaterialcorpo = "ll";
    }
}
