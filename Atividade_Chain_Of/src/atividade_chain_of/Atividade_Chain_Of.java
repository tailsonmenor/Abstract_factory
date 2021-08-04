package atividade_chain_of;

public class Atividade_Chain_Of {

    public static void main(String[] args) {
        Verifica_Login ver = new CadastroLogin();
        ver.setNext(new CaractereEspecial());
        ver.setNext(new CaractereMinusculo());
        ver.setNext(new CaractereMaisculo());

        try {
            ver.efetuarlogin(TiposCaractere.CaractereEspecial);
            ver.efetuarlogin(TiposCaractere.CaractereMinusculo);
            ver.efetuarlogin(TiposCaractere.CaractereMaisculo);
        } catch (Exception e) {

        }
    }

}
