/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackson
 */

public class Jogo {
    
    Pontuacao pontos = new Pontuacao();
    
    public void iniciarJogo(){
    
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
                pontos.verificarQuestao(qstSoma);
            }else if (operacao == 1){
                qstSubtracao.criarPergunta();
                qstSubtracao.exibirResposta(); 
                pontos.verificarQuestao(qstSubtracao);
            }else if (operacao == 2){
                qstMultiplicacao.criarPergunta();
                qstMultiplicacao.exibirResposta();
                pontos.verificarQuestao(qstMultiplicacao);
            }
            
            pontos.exibirPontuacao();
            
            flag = JOptionPane.showInputDialog("Continuar? S | N");
            
            if (flag.equals("N") || flag.equals("n") )
            {
                break;
            }
            
        }

      
            
    }
    
    
    
    
    
    
}
