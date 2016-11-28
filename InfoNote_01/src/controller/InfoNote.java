package controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import model.*;
import util.*;

public class InfoNote {
	
	Usuario user;
	Notebook notebooks[] = new Notebook[10];
	Pedido pedido;
	Configurador config;
	Ajuda ajuda;
	boolean logado = false;
	Cliente cliente;
	private static final int LOGIN =1;
	private static final int CADASTRAR_USUARIO = 2;
	private static final int BUSCAR_NOTEBOOK = 3;
	private static final int INSERIR_NOTEBOOK = 4;
	private static final int REMOVER_NOTEBOOK =5;
	private static final int VER_CARRINHO =  6;
	private static final int EFETUAR_COMPRA = 7;
	private static final int AJUDA =8;
	private static final int SAIR =9;
	public InfoNote() throws Exception{
		config = new Configurador();
		Locale.setDefault(new Locale(config.getIdioma(), config.getRegiao()));
		ajuda = new Ajuda(config.getArquivoAjuda());
		notebooks[0] = new Notebook(1,"Negativo N22BR","CPU Intel Core 2 Duo, Memoria 2GB, HD 250 GB", 6, 1200.00, "img\\m22br.jpg","19/05/2011");
		notebooks[1] = new Notebook(1,"Bell B55BR","CPU INTEL I3",3,1800.00,"aa","17/09/2019");
		
	
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		InfoNote info = new InfoNote();
		
		int opcao = 8;
		do{
			info.mostrarMenu();
			opcao = Teclado.lerInt("Digite sua Opcao");
			
			switch(opcao){
			case LOGIN:
				info.efetuarLogin();
				break;
			case CADASTRAR_USUARIO: 
				info.cadastrarUsuario();
				break;
			case BUSCAR_NOTEBOOK:
				info.buscarNotebook();
				break;
			case INSERIR_NOTEBOOK:
				info.manterCarrinho();
				break;
			case REMOVER_NOTEBOOK:
				info.manterCarrinho();
			case EFETUAR_COMPRA:
				if(!info.logado){
					System.out.println("Efetue login para Continuar");
					break;
				}else{
					info.efetuarCompra();
					break;
				}
			case AJUDA:
				info.ajuda();
				break;
			case VER_CARRINHO:
				info.manterCarrinho();
				break;
			case SAIR:
				System.out.println("Saida");
				break;
			default:
				System.out.println("Opção Invalida");
			}
			Teclado.lerTexto("Pressione uma tecla...");
		}while(opcao !=8);
		
	}
	
	public void mostrarMenu(){
		System.out.println(DateFormat.getDateInstance().format(new Date()) + " " + DateFormat.getTimeInstance().format(new Date()));
		if(logado == true){ System.out.println("Cliente: "+cliente.getNome());}
		System.out.println("1 - Login");
		System.out.println("2 - Cadastrar Cliente");
		System.out.println("3 - Buscar Notebook");
		System.out.println("4 - Inserir Notebook no Carrinho");
		System.out.println("5 - Remover Notebook do Carrinho");
		System.out.println("6 - Ver Carrinho");
		System.out.println("7 - Efetuar Compra");
		System.out.println("8 - Ajuda");
		System.out.println("9 - Sair");
	}
	
	public void efetuarLogin(){
		String login,senha;
		login = Teclado.lerTexto("Digite o Login");
		senha = Teclado.lerTexto("Digite a Senha");
		
		if(cliente != null){
			logado = cliente.validaLogin(senha,login);
			if (logado) {
				System.out.println("Cliente Logado com Sucesso");
			}else{
				System.out.println("Usuário ou Senha Inválidos");
			}
		}
	}
	
	public void cadastrarUsuario(){
		String codigoCliente = Teclado.lerTexto("Codigo Cliente: ");
		String matricula = Teclado.lerTexto("Matricula :");
		int tipo = Teclado.lerInt("Tipo: ");
		String login = Teclado.lerTexto("Login: ");
		String senha = Teclado.lerTexto("Senha: ");
		String nome = Teclado.lerTexto("Nome: ");
		String email = Teclado.lerTexto("E-mails: ");
		String telefone = Teclado.lerTexto("Telefone: ");
		String logradouro = Teclado.lerTexto("Logradouro: ");
		String numero = Teclado.lerTexto("Numero ");
		String complemento = Teclado.lerTexto("Complemento: ");
		String bairro = Teclado.lerTexto("Bairro: ");
		String cidade = Teclado.lerTexto("Cidade: ");
		String estado = Teclado.lerTexto("Estado: ");
		String cep = Teclado.lerTexto("Cep: ");
		if(senha.equals("") || senha == null){
			senha = GerarSenha.gerarSenha();
			System.out.println("Senha Gerada: "+senha);
		}
		Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);
		user = new Cliente(login, senha, tipo, matricula, codigoCliente, telefone, email, nome, endereco);
		System.out.println("Cadastro Realizado");
		System.out.println(user);
	}
	
	public void buscarNotebook(){
		for (int i = 0; i < notebooks.length; i++) {
			if(notebooks[i] != null){
				System.out.println(notebooks[i].getNumeroNote()+"-----"+ notebooks[i].getModelo());
			}
			
		}
	}
	
	public void inserirNotebook(){
		String numeroNote = Teclado.lerTexto("Informe o Número do Notebook"+ "para Compra:");
		
		if(pedido == null){
			pedido = new Pedido();
		}
		Notebook aux = null;
		for (int i = 0; i < notebooks.length; i++) {
			if(notebooks[i]!=null && numeroNote.equals(notebooks[i].getNumeroNote())){
				aux = notebooks[i];
			}
		}
		
		if(aux == null){
			return;
		}
		
		ItemDePedido item = new ItemDePedido(1,aux.getPrecoUnitario(),aux);
		pedido.inserirItem(item);
	}
	public void manterCarrinho(){
		System.out.println("manter carrinho - const");
	}
	public void efetuarCompra(){
		System.out.println("efetuarCompra - const");
		
	}
	public void ajuda(){
		System.out.println(ajuda.getTexto());
	}

}
