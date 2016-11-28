package controller;

import java.util.Random;

import util.Teclado;

public class ExemploClasseMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<10){
			//int x=Teclado.lerInt("Informe um número:");
			int x=50;
			double num=Math.random();
			System.out.println(num+"% de "+x+" = "+(num*x));
			i++;
		}
		
		System.out.println();
		double valorSorteado = Math.random();
		int resultado = 50 + (int)(valorSorteado*30);
		System.out.println("Valor sorteado entre 50 e 80: "+resultado);
		
		System.out.println();
		System.out.println("Números sena:");
		for (i = 0; i < 6; i++) {
			double numeroSena = Math.random();
			int numeroSorteado = (int)(numeroSena*60);
			System.out.println((i+1)+"º número: "+numeroSorteado);
		}
		
		System.out.println();
		System.out.println("Classe Random:");
		Random random = new Random();
		for (int j = 0; j < 6; j++) {
			int numeroSena = random.nextInt(60);
			System.out.println((j+1)+"º número: "+numeroSena);
		}
		
		int maior = Math.max(resultado, 65);
		int menor = Math.min(resultado, 65);
		System.out.println("Entre "+resultado+" e 65:");
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
		
		System.out.println();
		double area = Math.pow(5, 2) * Math.PI;
		System.out.println("Área de um círculo de raio 5:"+area);
		
		double sen,cos,tan;
		double a=60;
		sen=Math.sin(Math.toRadians(a));
		cos=Math.cos(Math.toRadians(a));
		tan=Math.tan(Math.toRadians(a));
		
		System.out.println("Seno: "+sen);
		System.out.println("Cosseno: "+cos);
		System.out.println("Tangente: "+tan);
		
		double raiz = Math.sqrt(81);
		System.out.println("Raiz de 81: "+raiz);
		
		char c=90;
		System.out.println(c);
	}

}
