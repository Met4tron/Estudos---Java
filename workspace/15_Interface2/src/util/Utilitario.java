package util;

import model.Usuario;

public class Utilitario {
	public static void ordena(Usuario[] usuarios){
		for (int i = 0; i < usuarios.length-1; i++) {
			for (int j = i+1; j < usuarios.length; j++) {
				if(usuarios[i].getLogin().compareTo(usuarios[j].getLogin())>0){
					Usuario aux = usuarios[i];
					usuarios[i]=usuarios[j];
					usuarios[j]=aux;
				}
			}
		}
	}
}
