package controller;

import model.Aluno;
import model.Professor;
import model.Usuario;

public class Teste {

	public static void main(String[] args) {
		//Usuario usuario = new Usuario("usua","1234",0);
		
		Aluno aluno = new Aluno("alu","111",1,1098,"João","Noite","2014034");
		aluno.mostrar();
		
		Professor professor = new Professor("prof", "222", 2, 333, "Xicão", "C#");
		professor.mostrar();
		
		Usuario usuario=professor;
		usuario.mostrar();
	}

}
