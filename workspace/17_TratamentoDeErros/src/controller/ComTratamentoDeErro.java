package controller;

import util.Teclado;

public class ComTratamentoDeErro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean ok=false;
		do{
			try{
				int a = Teclado.lerInt("Informe o numerador:");
				int b = Teclado.lerInt("Informe o denominador:");

				int c=a/b;
				System.out.println("Resultado: "+c);
				ok=true;
			}catch(ArithmeticException ae){
				System.out.println("Não pode dividir por zero seu OVO.");
				System.out.println(ae.getMessage());
			}catch(NumberFormatException nfe){
				System.out.println("Caracter inválido.");
				System.out.println(nfe.getMessage());
			}
		}while(!ok);
	}

}
