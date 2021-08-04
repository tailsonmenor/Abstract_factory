
package atividade_chain_of;


public abstract class Verifica_Login {
     protected Verifica_Login next;
    protected TiposCaractere identificadorCaractere;

    public Verifica_Login(TiposCaractere Tip) {
        next = null;
        identificadorCaractere = Tip;
    }

    public void setNext(Verifica_Login ver) {
        if (next == null) {
            next = ver;
        } else {
            next.setNext(ver);
        }
    }

    public void efetuarlogin(TiposCaractere Tip) throws Exception {
        if (podeEfetuarlogin(Tip)) {
            efetuarlogin();
        } else {
            if (next == null) {
                throw new Exception("Login Não Efetuado, Realize um cadastro!!!");
            }
            next.efetuarlogin(Tip);
        }
    }

    private boolean podeEfetuarlogin(TiposCaractere Tip) {
        if (identificadorCaractere == Tip) {
            return true;
        }
        return false;
    }
    protected abstract void efetuarlogin();
}
