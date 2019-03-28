
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
        
        int operador1 = ThreadLocalRandom.current().nextInt(0,100);
        int operador2 = ThreadLocalRandom.current().nextInt(0,20);
        String resposta = JOptionPane.showInputDialog("Quanto é " + operador1 + " + " + operador2 + " : " );
        int respostaInt = Integer.parseInt(resposta);
        
        if (operador1 + operador2 == respostaInt)
            JOptionPane.showMessageDialog(null, "Você acertou!");
        else
            JOptionPane.showMessageDialog(null, "Você errou!");
    }
  
}
