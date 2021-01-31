package mensagem;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import usuario.Usuario;


public class Mensagem implements Serializable {

	String texto;
	Usuario sender;
	Usuario receiver;
	List<Mensagem> replies = new ArrayList<Mensagem>();
	
	public void setTexto (String texto) {
		this.texto = texto;
	}
	
	public String getTexto () {
		return this.texto;
	}
	
	public void responderMensagem (Mensagem mensagem) {
		this.replies.add(mensagem);
	}
	
	public List<Mensagem> getResposta() {
		return this.replies;
	}
	
	public void setRemetente (Usuario remetente) {
		this.sender = remetente;
	}
	
	public Usuario getRemetente () {
		return this.sender;
	}
	
	public void setDestinatario (Usuario destinatario) {
		this.receiver = destinatario;
	}
	
	public Usuario getDestinatario () {
		return this.receiver;
	}
	
    @Override
    public boolean equals(Object object) {
    	
    	
        if (object != null && object instanceof Mensagem) {
        	Mensagem mensagem = (Mensagem) object;
        	
        	boolean is_false = false;
        	if (this.texto == null) {
        		is_false = !(mensagem.texto == null);
        	}
        	else {
        		is_false = !(texto.equals(mensagem.texto));
        	}

        	if (is_false == true) {
        		return false;
        	}
        	
        	if (this.sender == null) {
        		is_false = !(mensagem.sender == null);
        	}
        	else {
        		is_false = !(sender.equals(mensagem.sender));
        	}
        	
        	if (is_false == true) {
        		return false;
        	}
        	
        	
        	if (this.receiver == null) {
        		is_false = !(mensagem.receiver == null);
        	}
        	else {
        		is_false = !(receiver.equals(mensagem.receiver));
        	}
        	
        	if (is_false == true) {
        		return false;
        	}
        	            
        }

        return true;
    }  
	
    @Override
    public String toString() {
    	String conteudo;
    	conteudo = "De: " + sender + ", Para: " + receiver + ", Texto: " + texto + ", Resposta: [";
    	for (Mensagem m: this.replies) {
    		conteudo += "\n" + m;
    	}
    	conteudo += "]";
    	return conteudo;
    }
	
}
