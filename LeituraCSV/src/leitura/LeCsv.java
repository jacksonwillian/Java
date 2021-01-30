
package leitura;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class LeCsv {
        
     public LinkedList<Cliente> leCsvClientes() throws IOException{         
    	
    	String pathFileCSV = "//src//arquivo.csv";
        LinkedList<Cliente> clientes = new LinkedList<Cliente>();             
        String current = new java.io.File( "." ).getCanonicalPath();        
        File inputFile = new File(current + pathFileCSV);                
        FileReader in = new FileReader(inputFile);
        int c = in.read();
        String linha = "";
        boolean removeuCabecalho = false;
        while (c != -1) {
        	c = in.read(); 
        	linha += (char) c;
			if (linha.contains("\n")) {
				if (removeuCabecalho) {
					String coluna[] = linha.strip().split(";");
					Cliente cliente = new Cliente();
					cliente.setId(coluna[0]);
					cliente.setNome(coluna[1]);
					cliente.setEmail(coluna[2]);
					cliente.setTelefone(coluna[4]);
					cliente.setTotalCompras(Double.parseDouble(coluna[5]));
					clientes.add(cliente);
				} else {
					removeuCabecalho = true;
				}
				linha = "";
			}
			
        }       
        in.close(); 
        
        return clientes;
     }
}
