package util;

import model.IComparador;


public class Utilitario {
	/*public static void ordena(Usuario[] usuarios){
		for (int i = 0; i < usuarios.length-1; i++) {
			for (int j = i+1; j < usuarios.length; j++) {
				if(usuarios[i].getLogin().compareTo(usuarios[j].getLogin())>0){
					Usuario aux = usuarios[i];
					usuarios[i]=usuarios[j];
					usuarios[j]=aux;
				}
			}
		}
	}*/
	public static void ordena(IComparador[] c){
		for (int i = 0; i < c.length-1; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i].comparadoCom(c[j])==IComparador.MAIOR){
					IComparador aux=c[i];
					c[i]=c[j];
					c[j]=aux;
				}
			}
		}
	}
	
}








