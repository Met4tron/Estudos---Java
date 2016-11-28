package controller;

import model.ContaCorrente;
import model.ContaEspecial;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente("Rodrigo", "123-4", "98765-0", 1000);
		
		ContaEspecial ce = new ContaEspecial("Luana", "543-2", "1234567-0", 500, 2000);
		
		System.out.println("Conta corrente:");
		System.out.println("Titular: "+cc.getTitular());
		System.out.println("Agência: "+cc.getAgencia());
		System.out.println("Número conta: "+cc.getNumeroConta());
		System.out.println("Saldo: "+cc.calcularSaldo());
		
		System.out.println();
		System.out.println("Conta especial:");
		System.out.println("Titular: "+ce.getTitular());
		System.out.println("Agência: "+ce.getAgencia());
		System.out.println("Número conta: "+ce.getNumeroConta());
		System.out.println("Limite: "+ce.getLimite());
		System.out.println("Saldo: "+ce.calcularSaldo());
		
		System.out.println();
		System.out.println(cc.calcularSaldo());
		cc=ce;
		System.out.println();
		System.out.println(cc.calcularSaldo());
		
	
	}

}
