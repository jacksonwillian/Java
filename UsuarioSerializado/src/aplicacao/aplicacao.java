package aplicacao;

import java.io.IOException;
import java.util.List;

import mensagem.Mensagem;
import mensagem.MensagemSerializado;
import usuario.Usuario;
import usuario.UsuarioSerializado;

public class aplicacao {

	public static void main(String[] args) throws IOException {
		
		
		Mensagem mensagem1 = new Mensagem();
		Mensagem mensagem2 = new Mensagem();
		
		Usuario usuarioRemetente = new Usuario();
		Usuario usuarioDestinatario = new Usuario();
		
		usuarioRemetente.setNome("Lucas");
		usuarioDestinatario.setNome("João");
		
		
		mensagem1.setRemetente(usuarioRemetente);
		mensagem1.setDestinatario(usuarioDestinatario);
		mensagem1.setTexto("Olá, João");
		
		
		mensagem2.setRemetente(usuarioDestinatario);
		mensagem2.setDestinatario(usuarioRemetente);
		mensagem2.setTexto("Eai, Lucas");
		
		mensagem1.responderMensagem(mensagem2);
	
		
		
		usuarioRemetente.setMensagem(mensagem1);
		usuarioDestinatario.setMensagem(mensagem1);
	

		MensagemSerializado mensagemSerializado = new MensagemSerializado();
		UsuarioSerializado usuarioSerializado = new UsuarioSerializado();

		mensagemSerializado.salvar(mensagem1);

		usuarioSerializado.salvar(usuarioRemetente);
		usuarioSerializado.salvar(usuarioDestinatario);
		
		List<Usuario> list_usuario = usuarioSerializado.recuperar();

		for(Usuario u: list_usuario) {
			System.out.println(u);
			System.out.println("Mensagens recebidas");
			List<Mensagem> list_msg1 = u.getMensagemRecebidas();
			for(Mensagem m: list_msg1) {
				System.out.println(m);
			}
			System.out.println("--\n");
			System.out.println("Mensagens envidas");
			List<Mensagem> list_msg2 = u.getMensagemEnviadas();
			for(Mensagem m: list_msg2) {
				System.out.println(m);
			}
			System.out.println("--\n");
		}
		
		
		List<Mensagem> list_mensagem = mensagemSerializado.recuperar();
		System.out.println("Todas as mensagens");
		for(Mensagem m: list_mensagem) {
			System.out.println(m);
		}	

	}

}
