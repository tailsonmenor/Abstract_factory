
package atividade_builder;


public class Violao_Folk extends Violao_Builder{
      @Override
    public void buildPreco() {
       violao.preco = 200.00;
    }

    @Override
    public void buildCor() {
       violao.cor = "vermelho";
    }

    @Override
    public void buildTipoCorda() {
      violao.tipodacorda = "aço";
    }

    @Override
    public void buildTamanhoDoBarço() {
        violao.tamanhodobarço = "35";
    }

    @Override
    public void TipoDeTarraxa() {
       violao.tipodetarraxa = "ss";
    }

    @Override
    public void TipoMaterialCorpo() {
        violao.tipomaterialcorpo = "ee";
    }
}
