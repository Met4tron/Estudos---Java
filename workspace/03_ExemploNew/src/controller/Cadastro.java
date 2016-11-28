package controller;
import model.Usuario;

public class Cadastro {

	public static void main(String[] args) {
		Usuario user = new Usuario();
		user.nome="João";
		user.endereco="Travessa A";
		System.out.println(user.nome);
		System.out.println(user.endereco);

	}

}
