package model;

public class Funcionario extends Usuario implements IUsuario{
	
	String matricula;
	
	public Funcionario (){
		super();
	}
	public Funcionario (String login, String senha, int tipo,String matricula){
		super(login,senha,tipo,matricula);
		this.matricula = matricula;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public boolean validaLogin(String senha, String login) {
		if(this.getSenha().equals(senha) && this.getLogin().equals(login)){
			return true;
		}
		return false;
	}
	
	
}
