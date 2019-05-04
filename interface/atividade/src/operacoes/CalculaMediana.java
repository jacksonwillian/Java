
package operacoes;

import java.util.List;

public class CalculaMediana implements ICalcula {        
    
    public double calcula(List<Integer> lista){             
         double mediana = 0 ;
         if(lista.size() % 2 == 0){//par         
            mediana = (lista.get((lista.size()/2)-1) + lista.get((lista.size()/2)))/2;  
         }else{//impar
            mediana = (double) lista.get( lista.size()/2);
         }
        return mediana;    
    }
}
