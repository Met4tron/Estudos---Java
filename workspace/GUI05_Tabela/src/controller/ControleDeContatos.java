package controller;

import java.util.List;

import model.Contato;
import model.DAO.ContatoDAO;
import util.Teclado;
import view.JanelaExibeMensagens;

public class ControleDeContatos {
	private static final int CADASTRAR_MENSAGEM = 1;
	private static final int VISUALIZAR_MENSAGEM = 2;
	private static final int APAGAR_MENSAGEM = 3;
	private static final int ATUALIZAR_MENSAGEM = 4;
	private static final int SAIR = 5;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ControleDeContatos cdc = new ControleDeContatos();
		int opcao = SAIR;
		do{
			cdc.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua opção:");
			switch (opcao) {
			case CADASTRAR_MENSAGEM:
				cdc.cadastrarMensagem();
				break;
			case VISUALIZAR_MENSAGEM:
				cdc.buscarMensagens();
				break;
			case APAGAR_MENSAGEM:
				cdc.apagarMensagem();
				break;
			case ATUALIZAR_MENSAGEM:
				cdc.atualizarMensagem();
				break;
			case SAIR:
				System.out.println("Saindo do sistema...");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
			Teclado.lerTexto("Pressione ENTER para continuar...");
			
		}while(opcao != SAIR);
		

	}



	private void atualizarMensagem() {
		// TODO Auto-generated method stub
		System.out.println("==================");
		System.out.println("Atualizar Mensagem");
		System.out.println("==================");
		int id = Teclado.lerInt("ID da mensagem:");
		String mensagem = Teclado.lerTexto("Nova mensagem:");
		
		if(ContatoDAO.atualizar(mensagem, id)){
			System.out.println("Mensagem atualizada com sucesso.");
		}else{
			System.out.println("Erro ao atualizar mensagem.");
		}
	}



	private void apagarMensagem() {
		// TODO Auto-generated method stub
		System.out.println("===============");
		System.out.println("Apagar Mensagem");
		System.out.println("===============");
		int id = Teclado.lerInt("ID da mensagem a apagada:");
		if(ContatoDAO.excluir(id)){
			System.out.println("Mansagem apagada com sucesso.");
		}else{
			System.out.println("Erro ao apagar mensagem.");
		}
	}



	private void buscarMensagens() {
		// TODO Auto-generated method stub
		System.out.println("=====================");
		System.out.println("Visualizar Mensagens:");
		System.out.println("=====================");
		List<Contato> contatos = ContatoDAO.buscarTodos();
		new JanelaExibeMensagens(contatos);
	}



	private void cadastrarMensagem() {
		// TODO Auto-generated method stub
		System.out.println("==========");
		System.out.println("Cadastrar:");
		System.out.println("==========");
		String nome = Teclado.lerTexto("Nome:");
		String email = Teclado.lerTexto("E-mail:");
		String mensagem = Teclado.lerTexto("Mensagem:");
		
		Contato contato = ContatoDAO.inserir(nome, email, mensagem);
		
		if(contato != null){
			System.out.println("Mensagem cadastrada com sucesso:");
			System.out.println(contato);
		}else{
			System.out.println("Erro ao cadastrar mensagem.");
		}
 		
	}



	private void mostrarMenu() {
		// TODO Auto-generated method stub
		System.out.println("===================");
		System.out.println("Sistema de Mensagem");
		System.out.println("===================");
		System.out.println("1-Cadastrar Mensagem");
		System.out.println("2-Mostrar Mensagem");
		System.out.println("3-Apagar Mensagem");
		System.out.println("4-Atualizar Menagem");
		System.out.println("5-Sair");
	}

}



