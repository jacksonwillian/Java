package usuario;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import mensagem.Mensagem;


public class Usuario implements Serializable {

    String nome;
    List<Mensagem> mensagem = new ArrayList<Mensagem>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    public void setMensagem(Mensagem mensagem) {
    	this.mensagem.add(mensagem);
    }
    
    public List<Mensagem> getMensagens() {
    	return this.mensagem;
    }
    
    public List<Mensagem> getMensagemEnviadas(){
    	List<Mensagem> mensagensEnviadas = new ArrayList<Mensagem>();
    	for(Mensagem m: this.mensagem) {
			if (!mensagensEnviadas.contains(m)) {
	    		if (this.equals(m.getRemetente())) {
	    			mensagensEnviadas.add(m);
	    		}	
			}
    		
    		List<Mensagem> aux = m.getResposta();
    		for (Mensagem k : aux) {
    			if (!mensagensEnviadas.contains(k)) {
    	    		if (this.equals(k.getRemetente())) {
    	    			mensagensEnviadas.add(k);
    	    		}	
    			}
    		}
    		
    	}
    	return mensagensEnviadas;
    }
    
    public List<Mensagem> getMensagemRecebidas() {
    	List<Mensagem> mensagensRecebidas = new ArrayList<Mensagem>();
    	for(Mensagem m: this.mensagem) {
			if (!mensagensRecebidas.contains(m)) {
				
	    		if (this.equals(m.getDestinatario())) {
	    			mensagensRecebidas.add(m);
	    		}
			}
    		
    		List<Mensagem> aux = m.getResposta();
    		for (Mensagem k : aux) {
    			if (!mensagensRecebidas.contains(k)) {
    				
    	    		if (this.equals(k.getDestinatario())) {
    	    			mensagensRecebidas.add(k);
    	    		}
    			}
    		}
    	}
    	return mensagensRecebidas;    	
    }
    
    
    @Override
    public boolean equals(Object object) {
    	
    	
        if (object != null && object instanceof Usuario) {
        	Usuario usuario = (Usuario) object;
        	
        	boolean is_false = false;
        	if (this.nome == null) {
        		is_false = !(usuario.nome == null);
        	}
        	else {
        		is_false = !(nome.equals(usuario.nome));
        	}
        	
        	if (is_false == true) {
        		return false;
        	}
        	
        }
        
        return true;
    }  
    
    @Override
    public String toString() {
		return nome;
    }
      
}
