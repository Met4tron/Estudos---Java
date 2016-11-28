package controller;

import util.Teclado;
import model.Circulo;
import model.Figura;
import model.Retangulo;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Figura[] figuras = new Figura[5];
		
		int opcao=0;
		for(int i=0;i<figuras.length;i++){
			do
				opcao=Teclado.lerInt("Informe a op��o desejada:\n1-C�rculo\n2-Ret�ngulo");
			while(opcao<1 || opcao>2);
			String cor=Teclado.lerTexto("Cor:");
			int posX = Teclado.lerInt("PosX:");
			int posY=Teclado.lerInt("PosY");
			if(opcao==1){
				double raio=Teclado.lerDouble("Raio:");
				figuras[i]=new Circulo(cor, posX, posY, raio);
			}else{
				double altura = Teclado.lerDouble("Altura:");
				double largura = Teclado.lerDouble("Largura:");
				figuras[i]=new Retangulo(cor, posX, posY, altura, largura);
			}
			
		}
		
		for (int i = 0; i < figuras.length; i++) {
			System.out.println(figuras[i].quemSou());
			System.out.println("�rea: "+figuras[i].area());
			System.out.println("Per�metro: "+figuras[i].perimetro());
			System.out.println();
		}

	}

}
