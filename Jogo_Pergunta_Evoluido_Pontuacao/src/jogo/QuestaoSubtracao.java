
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackson Willian Silva Agostinho
 */
public class QuestaoSubtracao extends Questao {
    
    public QuestaoSubtracao(){
        this.pontos = 1;
    }
    
    @Override
    public boolean verificarResposta() {
        return (this.operador1 - this.operador2) == this.resposta;
    }
    
    public void criarPergunta(){
        this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
        this.operador2 = ThreadLocalRandom.current().nextInt(0,20);
        String resp  = JOptionPane.showInputDialog(this.operador1 + " - " + this.operador2 + " = ");
        this.resposta = Integer.parseInt(resp);
    }
}
