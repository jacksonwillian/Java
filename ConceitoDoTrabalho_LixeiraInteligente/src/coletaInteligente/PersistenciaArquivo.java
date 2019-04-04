package coletaInteligente;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Jackson Willian Silva Agostinho
 */

public class PersistenciaArquivo {
       
    public void salvaColetor(Coletor coletor) {
        
        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\Jackson\\Documents\\Coletor.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append(coletor.getCodigo() + "," + coletor.getPlaca() + ","+ coletor.getMarca() + "," + coletor.getModelo() + "," + coletor.getAno() + "," + coletor.getCapacidade() + "," + coletor.getLatitude() + "," + coletor.getLongitude() + "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    
    
}
