
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackson Willian Silva Agostinho
 */
public class QuestaoMultiplicacao extends Questao {
    
    public QuestaoMultiplicacao (){
        this.pontos = 2;
    }
    
    @Override
    public boolean verificarResposta() {
        return (this.operador1 * this.operador2) == this.resposta;
    }
    
    public void criarPergunta(){
        this.operador1 = ThreadLocalRandom.current().nextInt(0,100);
        this.operador2 = ThreadLocalRandom.current().nextInt(0,10);
        String resp  = JOptionPane.showInputDialog(this.operador1 + " * " + this.operador2 + " = ");
        this.resposta = Integer.parseInt(resp);
    }
}
