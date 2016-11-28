package model;

public class Professor extends Usuario implements IUsuario{
	private int matriculaProfessor;
	private String nome;
	private String especialidade;

	public Professor() {
		super();
	}

	public Professor(String login, String senha, int tipo,
			int matriculaProfessor, String nome, String especialidade) {
		super(login, senha, tipo);
		this.matriculaProfessor = matriculaProfessor;
		this.nome = nome;
		this.especialidade = especialidade;
	}

	public int getMatriculaProfessor() {
		return matriculaProfessor;
	}

	public void setMatriculaProfessor(int matriculaProfessor) {
		this.matriculaProfessor = matriculaProfessor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Informações do Professor:");
		System.out.println("Login:"+this.getLogin());
		System.out.println("Senha:"+this.getSenha());
		System.out.println("Tipo:"+this.getTipo());
		System.out.println("Matrícula professor:"+this.matriculaProfessor);
		System.out.println("Nome:"+this.nome);
		System.out.println("Especialidade:"+this.especialidade);
	
	}
	
	@Override
	public boolean validarLogin(String login, String senha) {
		if(this.getLogin().equals(login) && this.getSenha().equals(senha)){
			return true;
		}
		return false;
	}

}
