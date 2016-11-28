package controller;

import model.Aluno;
import model.Professor;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno = new Aluno("Rodrigo", "221133-0", "1212-9", "(21)9999-8888", "r@r.com", "887766", "TI");
		
		Professor professor = new Professor("Luana", "778899-0", "1010-1", "(21)2222-1111", "l@l.com", "99881212", "Ortodontia");

		System.out.println("Aluno:");
		System.out.println("Nome: "+aluno.getNome());
		System.out.println("RG: "+aluno.getRg());
		System.out.println("CPF: "+aluno.getCpf());
		System.out.println("Telefone: "+aluno.getTelefone());
		System.out.println("E-mail: "+aluno.getEmail());
		System.out.println("Matrícula: "+aluno.getMatricula());
		System.out.println("Curso: "+aluno.getCurso());
		System.out.println();
		System.out.println("Professor:");
		System.out.println("Nome: "+professor.getNome());
		System.out.println("RG: "+professor.getRg());
		System.out.println("CPF: "+professor.getCpf());
		System.out.println("Telefone: "+professor.getTelefone());
		System.out.println("E-mail: "+professor.getEmail());
		System.out.println("Matrícula: "+professor.getMatricula());
		System.out.println("Segmento: "+professor.getSegmento());
		
		
		
	}

}
