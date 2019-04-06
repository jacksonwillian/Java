/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackson
 */
public class Pontuacao {
    int pontos;
    int qntAcertos;
    int qntErros;
    
    public void verificarQuestao (Questao qst){
        if(qst.verificarResposta()){
            pontos += qst.pontos;
            qntAcertos += 1;
        } else{
            qntErros += 1;
        }
    }
    
    public void exibirPontuacao(){
        JOptionPane.showMessageDialog(null, "Pontuação " + pontos + "\nAcertos  " + qntAcertos + "\nErros  " + qntErros);
    }
}


