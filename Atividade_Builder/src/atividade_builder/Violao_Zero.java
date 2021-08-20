
package atividade_builder;


public class Violao_Zero extends Violao_Builder{
     @Override
    public void buildPreco() {
        violao.preco = 450.00;
    }

    @Override
    public void buildCor() {
        violao.cor = "verde";
    }

    @Override
    public void buildTipoCorda() {
        violao.tipodacorda = "cordas tipo";
    }

    @Override
    public void buildTamanhoDoBarço() {
        violao.tamanhodobarço = "66";
    }

    @Override
    public void TipoDeTarraxa() {
        violao.tipodetarraxa = "cc";
    }

    @Override
    public void TipoMaterialCorpo() {
        violao.tipomaterialcorpo = "kk";
    }
}
