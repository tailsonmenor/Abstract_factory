package atividade_builder;

public class Violão_Jumbo extends Violao_Builder {

    @Override
    public void buildPreco() {
        violao.preco = 50.00;
    }

    @Override
    public void buildCor() {
        violao.cor = "azul";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipodacorda = "cordas aço";
    }

    @Override
    public void buildTamanhoDoBarço() {
        violao.tamanhodobarço = "55";
    }

    @Override
    public void TipoDeTarraxa() {
        violao.tipodetarraxa = "rr";
    }

    @Override
    public void TipoMaterialCorpo() {
        violao.tipomaterialcorpo = "uu";
    }
}
