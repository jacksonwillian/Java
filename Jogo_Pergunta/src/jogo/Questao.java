
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackson Willian Silva Agostinho
 */

// Classe
public class Questao {
    
    // Construtor
    public Questao() {
    
    }
    
    // Método
    public void criaPergunta (){
    
        
        
        int operacao = ThreadLocalRandom.current().nextInt(0,3);
        
        if (operacao == 0){
            int operador1 = ThreadLocalRandom.current().nextInt(0,100);
            int operador2 = ThreadLocalRandom.current().nextInt(0,20);
            String resposta = JOptionPane.showInputDialog("Quanto é " + operador1 + " + " + operador2 + " : " );
            int respostaInt = Integer.parseInt(resposta);

            if (operador1 + operador2 == respostaInt)
                JOptionPane.showMessageDialog(null, "Você acertou!");
            else
                JOptionPane.showMessageDialog(null, "Você errou!");       
        
        } else if (operacao == 1) {
            
            int operador1 = ThreadLocalRandom.current().nextInt(0,100);
            int operador2 = ThreadLocalRandom.current().nextInt(0,20);
            String resposta = JOptionPane.showInputDialog("Quanto é " + operador1 + " - " + operador2 + " : " );
            int respostaInt = Integer.parseInt(resposta);

            if (operador1 - operador2 == respostaInt)
                JOptionPane.showMessageDialog(null, "Você acertou!");
            else
                JOptionPane.showMessageDialog(null, "Você errou!");       

        } else {
        
            int operador1 = ThreadLocalRandom.current().nextInt(0,100);
            int operador2 = ThreadLocalRandom.current().nextInt(0,10);
            String resposta = JOptionPane.showInputDialog("Quanto é " + operador1 + " * " + operador2 + " : " );
            int respostaInt = Integer.parseInt(resposta);

            if (operador1 * operador2 == respostaInt)
                JOptionPane.showMessageDialog(null, "Você acertou!");
            else
                JOptionPane.showMessageDialog(null, "Você errou!");       
        }

    }
  
}
