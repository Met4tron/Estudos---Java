package model;

public class Circulo extends Figura{
	private double raio;

	public Circulo() {
		super();
	}

	public Circulo(String cor, int posX, int posY, double raio) {
		super(cor, posX, posY);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String quemSou() {
		// TODO Auto-generated method stub
		String retorno = "Círculo:\n"+
						"Cor: "+this.getCor()+"\n"+
						"PosX: "+this.getPosX()+"\n"+
						"PosY: "+this.getPosY()+"\n"+
						"Raio: "+this.raio;
		return retorno;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(this.raio, 2);
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return Math.PI*this.raio*2;
	}

}
