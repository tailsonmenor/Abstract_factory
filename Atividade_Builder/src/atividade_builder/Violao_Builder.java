package atividade_builder;

public abstract class Violao_Builder {

    protected Violao violao = new Violao();

    public abstract void buildPreco();

    public abstract void buildCor();

    public abstract void buildTipoCorda();

    public abstract void buildTamanhoDoBarço();

    public abstract void TipoDeTarraxa();

    public abstract void TipoMaterialCorpo();

    public Violao getviolao() {
        return violao;
    }
;
}
