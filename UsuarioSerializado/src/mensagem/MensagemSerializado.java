package mensagem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import mensagem.Mensagem;
import usuario.Usuario;

public class MensagemSerializado {
	
	String path = "mensagem_serializado.ser";
	
	public void salvar(Mensagem mensagem) throws IOException {
		List<Mensagem> nova_mensagem = new ArrayList<Mensagem>();
		nova_mensagem.add(mensagem);
		this.salvar(nova_mensagem);
	}
	
	
	public void salvar (List<Mensagem> nova_mensagens) throws IOException {
		List<Mensagem> mensagens;
			
			mensagens = this.recuperar();
			
			if (mensagens != null) {
				
				for(Mensagem m : nova_mensagens) {
					if(mensagens.contains(m) == false) {
						mensagens.add(m);
					}
				}				
			} else {
				mensagens = nova_mensagens;
			}
		
		
		File f = new File(this.path);
		if(!f.exists()){
		  f.createNewFile();
		}
		
        FileOutputStream fileSerializado = new FileOutputStream(this.path);         

        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);   

        outputSerializado.writeObject(mensagens);

        outputSerializado.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Mensagem> recuperar() {
	
		List<Mensagem> mensagens = null;
		FileInputStream fileIn;
		ObjectInputStream in = null;
		
		try {
			try {
				
				 fileIn = new FileInputStream(this.path);
				
		         in = new ObjectInputStream(fileIn);
		         
		         mensagens = (List<Mensagem>) in.readObject();
		        						
			} catch (IOException  e) {
//				e.printStackTrace();
				throw new Exception( e.toString() );
			} catch ( ClassNotFoundException e) {
				throw new Exception( e.toString() );
			} finally {
				try {
					in.close();
				} catch (IOException e) {
//					e.printStackTrace();
					throw new Exception( e.toString() );
				}
			}	
		} catch (Exception e) {
			System.out.println("Não foi possivel ler o arquivo, devido ao erro: " + e.toString());
		}			
			
        return mensagens;
	}
}
