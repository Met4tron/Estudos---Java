package controller;

import util.Teclado;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = Teclado.lerTexto("Nome: ");
		double n1,n2,n3,n4,resultado;
		
		
		n1 = Teclado.lerDouble("Nota 1");
		n2 = Teclado.lerDouble("Nota 2");
		n3 = Teclado.lerDouble("Nota 3");
		n4 = Teclado.lerDouble("Nota 4");
		
		resultado = (n1+n2+n3+n4)/4;
		System.out.println(resultado);
	}

}
