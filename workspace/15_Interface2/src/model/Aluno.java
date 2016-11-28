package model;

public class Aluno extends Usuario implements IUsuario{
	private int matriculaAluno;
	private String nome;
	private String turno;
	private String turma;

	public Aluno() {
		super();
	}

	public Aluno(String login, String senha, int tipo, int matriculaAluno,
			String nome, String turno, String turma) {
		super(login, senha, tipo);
		this.matriculaAluno = matriculaAluno;
		this.nome = nome;
		this.turno = turno;
		this.turma = turma;
	}



	public int getMatriculaAluno() {
		return matriculaAluno;
	}

	public void setMatriculaAluno(int matriculaAluno) {
		this.matriculaAluno = matriculaAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Informações do Aluno:");
		System.out.println("Login:"+this.getLogin());
		System.out.println("Senha:"+this.getSenha());
		System.out.println("Tipo:"+this.getTipo());
		System.out.println("Matrícula aluno:"+this.matriculaAluno);
		System.out.println("Nome:"+this.nome);
		System.out.println("Turno:"+this.turno);
		System.out.println("Turma:"+this.turma);
	
	}

	@Override
	public boolean validarLogin(String login, String senha) {
		if(this.getLogin().equals(login) && this.getSenha().equals(senha)){
			return true;
		}
		return false;
	}

}
