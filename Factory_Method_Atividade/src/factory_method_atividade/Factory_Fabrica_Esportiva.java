
package factory_method_atividade;


public class Factory_Fabrica_Esportiva {
  
     public Fabrica_Esportiva gerFabrica_Esportiva(String marca, String time){
     
      if(time.equals("BRASIL")){
             return new Nike(marca);
         }else{
             if(time.equals("FLAMENGO")){
                 return new Adidas(marca);
             }else{
                 if(time.equals("BOTAFOGO")){
                     return new Puma(marca);
                    
                 }
                 else{
                     if(time.equals("FLUMINENSE")){
                         return new Umbro(marca);
                     }
                     else return new Kapa(marca);
                         
                     
              }
                 }
     }
      }
     }

