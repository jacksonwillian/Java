
package conta;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jackson Willian Silva Agostinho
 */
public class PersistenciaArquivo {

    public void salvarContaCorrente(ContaCorrente conta) {

        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\Jackson\\contaCorrente.txt", true);    
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append( conta.getNomeCliente() + "," + conta.getNumConta() 
                + ","+ conta.getNumAgencia()+","+ conta.getLimite() +"," + conta.getSaldo()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }

    public void salvarContaPoupanca(ContaPoupanca conta) {

        FileWriter arq;
        try {
            arq = new FileWriter("C:\\Users\\Jackson\\contaPoupanca.txt", true);        
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.append( conta.getNomeCliente() + "," + conta.getNumConta() 
                + ","+ conta.getNumAgencia()+"," + conta.getSaldo()+ "\r\n");        
            arq.close();   
        } catch (IOException ex) {
            Logger.getLogger(PersistenciaArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }    


    
}