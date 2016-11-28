package model;

public abstract class Figura implements IComparador{
	private String cor;
	private int posX;
	private int posY;
	
	@Override
	public int comparadoCom(IComparador c){
		Figura f = (Figura)c;
		if(this.area()>f.area()){
			return IComparador.MAIOR;
		}else if(this.area()<f.area()){
			return MENOR;
		}
		return IGUAL;
	}
	
	public Figura() {
		super();
	}

	public Figura(String cor, int posX, int posY) {
		super();
		this.cor = cor;
		this.posX = posX;
		this.posY = posY;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public abstract String quemSou();
	
	public abstract double area();
	
	public abstract double perimetro();
}

