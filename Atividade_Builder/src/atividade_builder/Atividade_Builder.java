package atividade_builder;

public class Atividade_Builder {

    public static void main(String[] args) {
        Violao_Director_Venda vendaviolao = new Violao_Director_Venda(new Violao_Classico());
        vendaviolao.ViolaoVender();
        Violao vio = vendaviolao.getVilao();
        System.out.println("Cor: " + vio.cor + "/" + vio.tamanhodobarço
                + "\nAno: " + vio.tipodacorda + "\nMotor: "
                + vio.tipodetarraxa + "\nValor: " + vio.tipomaterialcorpo + "\nvalor " + vio.preco);
        System.out.println();
        
    }

}
