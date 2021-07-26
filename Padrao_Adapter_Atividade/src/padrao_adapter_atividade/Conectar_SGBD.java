
package padrao_adapter_atividade;


public class Conectar_SGBD extends Paradox{
    private Firebird firebird;
            public Conectar_SGBD(Firebird
        firebird) {
        this.firebird = firebird;
 }
    @Override
            public void ConectarSGBDParadox(){
                firebird.ConectarSGBDFirebird();
            }
        
             private MySQL mysql;
            public Conectar_SGBD(MySQL
        mysql) {
        this.mysql = mysql;
 }
    
            public void ConectarSGBDMySQL(){
                mysql.ConectarSGBDMySQL();
            }
            
                   private Paradox paradox;
            public Conectar_SGBD(Paradox
        paradox) {
        this.paradox = paradox;
 }
            
    public void ConectarSGBDFirebird(){
                paradox.ConectarSGBDParadox();
            }
     
}
