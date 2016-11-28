package model;

public class Gerente extends Pessoa{
	private String projeto;

	public Gerente() {
		super();
	}

	public Gerente(String nome, String nasc, int avaliacao, double salario,
			Endereco endereco, String projeto) {
		super(nome, nasc, avaliacao, salario, endereco);
		this.projeto = projeto;
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}
	
	@Override
	public void mostrar(){
		super.mostrar();
		System.out.println("Projeto: "+this.projeto);
	}
	
	@Override
	public double calculaSal(){
		return super.calculaSal()*1.6*(1+(double)this.getAvaliacao()/100);
	}
}






