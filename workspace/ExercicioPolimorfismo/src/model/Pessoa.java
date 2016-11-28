package model;

public class Pessoa {
	private String nome;
	private String nasc;
	private int avaliacao;
	private double salario;
	private Endereco endereco;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, String nasc, int avaliacao, double salario) {
		super();
		this.nome = nome;
		this.nasc = nasc;
		this.setAvaliacao(avaliacao);
		this.setSalario(salario);
	}
	
	public Pessoa(String nome, String nasc, int avaliacao, double salario,
			Endereco endereco) {
		super();
		this.nome = nome;
		this.nasc = nasc;
		this.setAvaliacao(avaliacao);
		this.setSalario(salario);
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNasc() {
		return nasc;
	}

	public void setNasc(String nasc) {
		this.nasc = nasc;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		if(avaliacao<0){
			this.avaliacao=0;
		}else if(avaliacao>10){
			this.avaliacao=10;
		}else{
			this.avaliacao = avaliacao;
		}
		
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario<788){
			this.salario=788;
		}else{
			this.salario = salario;
		}
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public double calculaSal(){
		return this.getSalario();
	}
	
	public void mostrar(){
		System.out.println("Nome: "+this.nome);
		System.out.println("Nascimento: "+this.nasc);
		System.out.println("Avaliação: "+this.avaliacao);
		System.out.println("Salário: "+this.salario);
		this.endereco.mostrar();
	}
}








