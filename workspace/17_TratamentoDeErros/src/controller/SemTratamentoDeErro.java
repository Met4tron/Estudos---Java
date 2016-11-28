package controller;

import util.Teclado;

public class SemTratamentoDeErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Teclado.lerInt("Informe o numerador:");
		int b = Teclado.lerInt("Informe o denominador:");
		
		int c=a/b;
		System.out.println("Resultado: "+c);
	}

}
