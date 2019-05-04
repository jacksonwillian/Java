
package operacoes;

import java.util.List;

public class CalculaMedia implements ICalcula {        

    public double calcula(List<Integer> lista){        
        int total=0;
        for(Integer item : lista){
            total+= item;
        }        
        return (double) total/lista.size();       
    }
}
