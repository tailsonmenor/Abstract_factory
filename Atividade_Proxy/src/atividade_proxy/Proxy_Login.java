
package atividade_proxy;


public class Proxy_Login implements Tela{
      private Login loginuse;
        private String nameusu;

    public Proxy_Login(String usuname) {
        this.nameusu = usuname;
    }

    @Override
    public void Login_Tela() {
        if (loginuse == null) {
            loginuse = new Login(nameusu);
        }
        loginuse.Login_Tela();
    }
}
