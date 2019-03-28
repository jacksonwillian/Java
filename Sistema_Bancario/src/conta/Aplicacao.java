
package conta;

import javax.swing.JOptionPane; // Importa a biblioteca

/**
 *
 * @author Jackson Willian Silva Agostinho
 */

public class Aplicacao {
    
    
    public static void main(String[] args){
    
        String opcao = JOptionPane.showInputDialog("Digite 1 para criar conta Poupanca\nDigite 2 para cirar conta Corrente:  ");
                
        if("1".equals(opcao)){
        
            String numConta = JOptionPane.showInputDialog("Digite o número da conta: ");
            String numAgencia = JOptionPane.showInputDialog("Digite a agência da conta: ");
            String nomeCliente = JOptionPane.showInputDialog("Digite o nome do Cliente: ");
            String limite = JOptionPane.showInputDialog("Digite o limete Inicial: ");
            String saldo = JOptionPane.showInputDialog("Digite o Saldo Inicial: ");   

            ContaCorrente contaCliente = new  ContaCorrente(numConta,nomeCliente,saldo,limite,numAgencia);
            contaCliente.imprimirSaldo();

            PersistenciaArquivo  salva = new PersistenciaArquivo();
            salva.salvarContaCorrente(contaCliente);        
            
        }
        else if ("2".equals(opcao)){

        
            String numConta = JOptionPane.showInputDialog("Digite o número da conta: ");
            String numAgencia = JOptionPane.showInputDialog("Digite a agência da conta: ");
            String nomeCliente = JOptionPane.showInputDialog("Digite o nome do Cliente: ");
            String saldo = JOptionPane.showInputDialog("Digite o Saldo Inicial: ");   

            ContaPoupanca contaCliente = new  ContaPoupanca(numConta,nomeCliente,saldo,numAgencia);
            contaCliente.imprimirSaldo();

            PersistenciaArquivo  salva = new PersistenciaArquivo();
            salva.salvarContaPoupanca(contaCliente);
           
        }
    }
    
}
