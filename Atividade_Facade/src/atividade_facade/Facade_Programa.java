
package atividade_facade;


public class Facade_Programa {
    protected Pagamentos _pagamentos;
    protected Reserva_Hotel _reserva_hotel;
    protected Reserva_Passagem _reserva_passagem;
    protected Aluguel_Carro _aluguel_carro;
   
    public void subsistema(){
        _reserva_passagem = new Reserva_Passagem();
        _reserva_passagem.opção001();
        _reserva_passagem.opção002();
        //____________________
        _pagamentos = new Pagamentos();
        _pagamentos.opção1();
        _pagamentos.opção2();
        //____________________
        _reserva_hotel = new Reserva_Hotel();
        _reserva_hotel.opção01();
        _reserva_hotel.opção02();
        //_____________________
        
        _aluguel_carro = new Aluguel_Carro();
        _aluguel_carro.opção0001();
        _aluguel_carro.opção0002();
        
       
    }
     public void pass(String tipo){
            _reserva_passagem.opção003(tipo);
        }
     public void hot(String tipo){
            _reserva_hotel.opção03(tipo);
        }
     public void pag(String tipo){
            _pagamentos.opção3(tipo);
        }
}
