package coletaInteligente;
import javax.swing.JOptionPane;

/**
 * @author Jackson Willian Silva Agostinho
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String codigoColetor = JOptionPane.showInputDialog("Codigo do Coletor: ");
        String placa = JOptionPane.showInputDialog("Placa: ");
        String latitude = JOptionPane.showInputDialog("Latitude: ");
        String longitude = JOptionPane.showInputDialog("Longitude: ");
        String capacidade = JOptionPane.showInputDialog("Capacidade: ");
        String marca = JOptionPane.showInputDialog("Marca: ");
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        String ano = JOptionPane.showInputDialog("Ano: "); 
        
       Coletor coletor = new Coletor(codigoColetor, placa, marca, modelo, ano, latitude, longitude, capacidade ); 
       PersistenciaArquivo arquivo = new PersistenciaArquivo();
       arquivo.salvaColetor(coletor);
        
    }
    
}
