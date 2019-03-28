
package conta;

/**
 *
 * @author Jackson Willian Silva Agostinho
 */
public class ContaPoupanca {

    //Atributos
    private String nomeCliente;
    private int numConta;
    private double saldo;
    private int numAgencia;
    
    // Construtor VAZIO NÃO INICIA OS ATRIBUTOS
    // Construtor ARGUMENTOS INICIA OS ATRIBUTOS
    public ContaPoupanca(String numConta,String nomeCliente,String saldo, String numAgencia){
        this.numConta = Integer.parseInt(numConta);
        this.nomeCliente = nomeCliente;
        this.saldo = Double.parseDouble(saldo);
        this.numAgencia = Integer.parseInt(numAgencia);
    }
    
    public void depositar (double valor){
        this.saldo += valor;
    }
    
    public void sacar (double valor){
        this.saldo -= valor;
    }
    
    public void imprimirSaldo (){
        System.out.println("Prezado, " + nomeCliente);
        System.out.println("Seu saldo atual é: R$ " + saldo);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }
      
}
