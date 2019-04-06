
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackson Willian Silva Agostinho
 */

public class Aplicacao {

    
    public static void main(String[] args) {
       
        int operacao;
        String flag;
        
        QuestaoSoma qstSoma = new QuestaoSoma();
        QuestaoSubtracao qstSubtracao = new QuestaoSubtracao();
        QuestaoMultiplicacao qstMultiplicacao = new QuestaoMultiplicacao();
        
        for (;;){
            operacao = ThreadLocalRandom.current().nextInt(0,3);
            if(operacao == 0){
                qstSoma.criarPergunta();
                qstSoma.exibirResposta();
            }else if (operacao == 1){
                qstSubtracao.criarPergunta();
                qstSubtracao.exibirResposta();           
            }else if (operacao == 2){
                qstMultiplicacao.criarPergunta();
                qstMultiplicacao.exibirResposta();           
            }
            
            flag = JOptionPane.showInputDialog("Continuar? S | N");
            
            if (flag.equals("N") || flag.equals("n") )
            {
                break;
            }
        }

      
    }
}
