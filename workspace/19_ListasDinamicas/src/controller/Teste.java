package controller;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class Teste {

	List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public Teste(){
		usuarios.add(new Usuario("rodrigo", "1234"));
		usuarios.add(new Usuario("luana", "4321"));
		usuarios.add(new Usuario("joao", "9876"));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teste teste = new Teste();
		
		System.out.println(teste.usuarios.get(2));
		System.out.println();
		System.out.println(teste.usuarios);
		teste.usuarios.remove(1);
		System.out.println(teste.usuarios);
		System.out.println(teste.usuarios.get(1));
		System.out.println();
		for(Usuario u : teste.usuarios){
			System.out.println(u);
		}
		
		System.out.println();
		for(int i=0;i<teste.usuarios.size();i++){
			System.out.println(teste.usuarios.get(i));
		}
		
		if(!teste.usuarios.isEmpty()){
			System.out.println("Existe(m) elemento(s) na lista.");
		}else{
			System.out.println("Sem elementos na lisa.");
		}
	}

}



