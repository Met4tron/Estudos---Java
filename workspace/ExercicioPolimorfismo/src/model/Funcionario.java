package model;

public class Funcionario extends Pessoa{
	private String setor;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, String nasc, int avaliacao, double salario,
			Endereco endereco, String setor) {
		super(nome, nasc, avaliacao, salario, endereco);
		this.setor = setor;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	@Override
	public void mostrar(){
		super.mostrar();
		System.out.println("Setor: "+this.setor);
	}
	
	@Override
	public double calculaSal(){
		return super.calculaSal()*(1+(double)this.getAvaliacao()/2/100);
	}
	
	
}




