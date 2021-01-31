package usuario;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import mensagem.Mensagem;
import usuario.Usuario;

public class UsuarioSerializado {
	
	String path = "usuario_serializado.ser";
    
	
	public void salvar(Usuario usuario) throws IOException {
		List<Usuario> novo_usuario = new ArrayList<Usuario>();
		novo_usuario.add(usuario);
		this.salvar(novo_usuario);
	}

	public void salvar (List<Usuario> novo_usuarios) throws IOException {
		
		List<Usuario> usuarios;
		
		usuarios = this.recuperar();
		
		if (usuarios != null) {
			
			for(Usuario u: novo_usuarios) {
				if(usuarios.contains(u) == false) {	
					usuarios.add(u);
				} 
			}
		} else {
			usuarios = novo_usuarios;
		}

		
		File f = new File(this.path);
		if(!f.exists()){
		  f.createNewFile();
		} 
		
        FileOutputStream fileSerializado = new FileOutputStream(this.path);                
        ObjectOutputStream outputSerializado = new ObjectOutputStream(fileSerializado);        
        outputSerializado.writeObject(usuarios);
        outputSerializado.close();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<Usuario> recuperar() {
	
		List<Usuario> usuarios = null;
		FileInputStream fileIn;
		ObjectInputStream in = null;
		
		try {
			try {
				
				 fileIn = new FileInputStream(this.path);
				
		         in = new ObjectInputStream(fileIn);
		         
		        usuarios = (List<Usuario>) in.readObject();
		        						
			} catch (IOException | ClassNotFoundException e) {
//				e.printStackTrace();
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
			
        return usuarios;
	}
}

   
