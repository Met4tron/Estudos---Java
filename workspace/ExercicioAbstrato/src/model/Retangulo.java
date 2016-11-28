package model;

public class Retangulo extends Figura {
	private double altura;
	private double largura;
	
	public Retangulo() {
		super();
	}

	public Retangulo(String cor, int posX, int posY, double altura,
			double largura) {
		super(cor, posX, posY);
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public String quemSou() {
		String retorno = "Retângulo:\n"+
				"Cor: "+this.getCor()+"\n"+
				"PosX: "+this.getPosX()+"\n"+
				"PosY: "+this.getPosY()+"\n"+
				"Altura: "+this.altura+"\n"+
				"Largura: "+this.largura;
		
		return retorno;
	}

	@Override
	public double area() {
		return this.altura*this.largura;
	}

	@Override
	public double perimetro() {
		return 2*(this.altura+this.largura);
	}

}
