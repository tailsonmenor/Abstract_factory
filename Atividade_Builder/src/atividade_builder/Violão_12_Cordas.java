
package atividade_builder;


public class Violão_12_Cordas extends Violao_Builder{
       @Override
    public void buildPreco() {
        violao.preco = 600.00;
    }

    @Override
    public void buildCor() {
        violao.cor = "cinza";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipodacorda = "dobro";
    }

    @Override
    public void buildTamanhoDoBarço() {
        violao.tamanhodobarço = "95";
    }

    @Override
    public void TipoDeTarraxa() {
        violao.tipodetarraxa = "vv";
    }

    @Override
    public void TipoMaterialCorpo() {
        violao.tipomaterialcorpo = "mm";
    }
}
