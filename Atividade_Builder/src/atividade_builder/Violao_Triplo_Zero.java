
package atividade_builder;


public class Violao_Triplo_Zero extends Violao_Builder{
     @Override
    public void buildPreco() {
        violao.preco = 950.00;
    }

    @Override
    public void buildCor() {
        violao.cor = "lilás";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipodacorda = "cordas tipo c";
    }

    @Override
    public void buildTamanhoDoBarço() {
        violao.tamanhodobarço = "88";
    }

    @Override
    public void TipoDeTarraxa() {
        violao.tipodetarraxa = "jj";
    }

    @Override
    public void TipoMaterialCorpo() {
        violao.tipomaterialcorpo = "ii";
    }
}
