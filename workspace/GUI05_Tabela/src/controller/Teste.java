package controller;

import java.sql.SQLException;
import java.util.List;

import util.Teclado;
import model.Cliente;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente();
		
		try {
			int opcao = Teclado.lerInt("Selecione a opção desejada:\n1-Carregar cliente\n2-Inserir cliente\n3-Excluir Cliente\n4-Atualizar Cliente\n5-Carregar todos");
			int id=0;
			String nome;
			String cpf;
			String email;
			switch (opcao) {
			case 1:
				id = Teclado.lerInt("ID:");
				if(cliente.carregarCliente(id)){
					System.out.println(cliente);
				}else{
					System.out.println("Cliente não encontrado.");
				}
				break;
			case 2:
				nome = Teclado.lerTexto("Nome:");
				cpf = Teclado.lerTexto("CPF:");
				email = Teclado.lerTexto("E-mail:");
				cliente.setNome(nome);
				cliente.setCpf(cpf);
				cliente.setEmail(email);
				if(cliente.inserirCliente()){
					System.out.println("Cliente cadastrado com sucesso.");
				}else{
					System.out.println("Erro ao cadastrar cliente.");
				}
				break;
			case 3:
				id = Teclado.lerInt("ID:");
				cliente.setId(id);
				if(cliente.excluirCliente()){
					System.out.println("Cliente excluido com sucesso.");
				}else{
					System.out.println("Erro ao excluir cliente.");
				}
				break;
			case 4:
				id = Teclado.lerInt("ID:");
				nome = Teclado.lerTexto("Nome:");
				cpf = Teclado.lerTexto("CPF:");
				email = Teclado.lerTexto("E-mail:");
				cliente.setId(id);
				cliente.setNome(nome);
				cliente.setCpf(cpf);
				cliente.setEmail(email);
				if(cliente.atualizarCliente()){
					System.out.println("Cliente atualizado com sucesso.");
				}else{
					System.out.println("Erro ao atualizar cliente.");
				}
				break;
			case 5:
				List<Cliente> lista = null;
				lista=cliente.carregarTodos();
				if(!lista.isEmpty()){
					for(Cliente c : lista){
						System.out.println(c);
					}
				}else{
					System.out.println("Nenhum cliente cadastrado.");
				}
				break;
			default:
				break;
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao carregar o Driver. Classe não encontrada.");
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro ao acessar o Banco de Dados.\nVerifique os parâmetros de conexão e(ou) sua instrução SQL.");
			System.out.println(e.getMessage());
		}
		
	}

}
