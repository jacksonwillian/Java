package operacoes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) { 
        
        CalculaMedia operacaoMedia = new CalculaMedia();
        CalculaMediana operacaoMediana = new CalculaMediana();        
        double valor;
        
        // método calcula a média        
        valor = calcula(operacaoMedia);    
        System.out.printf("A média é %.2f\n", valor);
        
        // método calcula a mediana        
        valor = calcula(operacaoMediana);
        System.out.printf("A mediana é %.2f\n", valor);
    }    
    
    public static double calcula(ICalcula  operacao){        
      List<Integer> lista = new ArrayList();        
      lista.add(1);
      lista.add(2); 
      lista.add(3); 
      lista.add(4); 
      lista.add(5); 
      lista.add(6);
      return operacao.calcula(lista);              
    }
}
