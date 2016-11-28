package controller;

import util.Teclado;

public class ExemploEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome;
		nome = Teclado.lerTexto("Digite Seu Nome: ");
		
		int idade;
		idade = Teclado.lerInt("Digite sua Idade: ");
		
		double salario;
		
		salario = Teclado.lerDouble("Digite Seu Salário: ");
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Salário: "+salario);
	}

}
