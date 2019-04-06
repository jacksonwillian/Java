
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackson Willian Silva Agostinho
 */

// Classe
public abstract class Questao {
    int pontos;
    int operador1;
    int operador2;
    int resposta;
    
    public abstract boolean verificarResposta();
    
    public void exibirResposta(){
        if(this.verificarResposta()){
            JOptionPane.showMessageDialog(null, "Você acerto!");
        }else{
            JOptionPane.showMessageDialog(null, "Você errou!");
        }
    }  
}
