package controller;

import util.Teclado;
import util.Utilitario;
import model.Aluno;
import model.Professor;
import model.Usuario;

public class Teste {

	public static void main(String[] args) {
		//Usuario usuario = new Usuario("usua","1234",0);
		Usuario[] usuarios = new Usuario[5];
		int opcao=0;
		for (int i = 0; i < usuarios.length; i++) {
			do{
				opcao=Teclado.lerInt("Informe a opção desejada:\n1-Aluno\n2-Professor");
			}while(opcao<1 || opcao>2);
			String login=Teclado.lerTexto("Login:");
			String senha=Teclado.lerTexto("Senha:");
			int tipo=Teclado.lerInt("Tipo:");
			if(opcao==1){
				int matriculaAluno=Teclado.lerInt("Matrícula aluno:");
				String nome=Teclado.lerTexto("Nome:");
				String turno=Teclado.lerTexto("Turno");
				String turma=Teclado.lerTexto("Turma");
				usuarios[i]=new Aluno(login, senha, tipo, matriculaAluno, nome, turno, turma);
			}else if(opcao==2){
				int matriculaProfessor=Teclado.lerInt("Matrícula professor:");
				String nome=Teclado.lerTexto("Nome:");
				String especialidade=Teclado.lerTexto("Especialidade:");
				usuarios[i]=new Professor(login, senha, tipo, matriculaProfessor, nome, especialidade);
			}
		}
		
		System.out.println("Mostrar:");
		for (int i = 0; i < usuarios.length; i++) {
			usuarios[i].mostrar();
			System.out.println();
		}
		
		Utilitario.ordena(usuarios);
		
		System.out.println("Mostrar ordenado:");
		for (int i = 0; i < usuarios.length; i++) {
			usuarios[i].mostrar();
			System.out.println();
		}
		
	}

}
