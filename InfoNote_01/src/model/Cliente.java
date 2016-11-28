package model;

import java.util.Arrays;

public class Cliente extends Usuario implements IUsuario {
	private String codigoCliente;
	private String telefone;
	private String email;
	private String nome;
	private Endereco[] enderecos = new Endereco[10];
	private Pedido pedidos[] = new Pedido[10];

	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cliente(String login, String senha, int tipo, String matricula,String codigoCliente,String telefone,String email,String nome, Endereco endereco) {
		super(login, senha, tipo, matricula);
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.codigoCliente = codigoCliente;
		inseriEndereco(endereco);
	}

	private boolean inseriEndereco(Endereco end) {
		for (int i = 0; i < enderecos.length; i++) {
			if(enderecos[i] == null){
				enderecos[i] = end;
				return true;
			}
		}
		return false;
	}
	
	public boolean inserirPedido(Pedido pedido){
		for (int i = 0; i < pedidos.length; i++) {
			if (pedidos[i] == null) {
				pedidos[i] = pedido;
				return true;
			}
		}
		return false;
		
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco[] getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(Endereco[] enderecos) {
		this.enderecos = enderecos;
	}

	public Pedido[] getPedidos() {
		return pedidos;
	}

	public void setPedidos(Pedido[] pedidos) {
		this.pedidos = pedidos;
	}

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", telefone=" + telefone + ", email=" + email + ", nome="
				+ nome + ", enderecos=" + Arrays.toString(enderecos) + ", pedidos=" + Arrays.toString(pedidos) + "]";
	}
	
	public boolean validaLogin(String senha, String login){
		if(this.getSenha().equals(senha) && this.getLogin().equals(login)){
			return true;
		}
		return false;
	}
	
	
	
	
}
