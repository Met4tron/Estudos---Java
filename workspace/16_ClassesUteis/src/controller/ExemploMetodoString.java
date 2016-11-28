package controller;

public class ExemploMetodoString {

	public static void main(String[] args) {
		String url = "http://www.senai.rj.br/ctti/turma2014034";
		String email = "aluno@senai.br";
		
		String dominio = url.substring(7, 22);
		System.out.println("Domínio: "+dominio);
		
		String complemento = url.substring(23);
		System.out.println("Complemento: "+complemento);
		
		String nomeUsuario = email.substring(0, email.indexOf('@'));
		System.out.println("Nome usuário: "+nomeUsuario);
		
		String maiuscula,minuscula,palavra1,palavra2;
		palavra1="carro";
		palavra2="CASA";
		maiuscula=palavra1.toUpperCase();
		System.out.println("Maiúscula: "+maiuscula+" - Palavra1: "+palavra1);
		minuscula=palavra2.toLowerCase();
		System.out.println("Minúscula: "+minuscula+" - Palavra2: "+palavra2);

	}

}
