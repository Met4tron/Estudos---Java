package model;

public class Contato {
	public int id;
	public String nome;
	public String email;
	public String mensagem;
	
	public Contato() {
		super();
	}

	public Contato(int id, String nome, String email, String mensagem) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}

	public Contato(String nome, String email, String mensagem) {
		super();
		this.nome = nome;
		this.email = email;
		this.mensagem = mensagem;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
	@Override
	public String toString(){
		final String ENTER = "\n";
		
		String retorno = "Mensagem:"+ENTER+
				"Nome: "+this.nome+ENTER+
				"E-mail: "+this.email+ENTER+
				"Mensagem: "+this.mensagem;
		
		return retorno;
	}
	
}








