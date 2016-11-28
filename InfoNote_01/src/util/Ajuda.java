package util;

import java.io.BufferedReader;
import java.io.FileReader;

public class Ajuda {
	private String texto;
	public Ajuda(String arquivoAjuda) throws Exception{
		BufferedReader in = new BufferedReader(new FileReader(arquivoAjuda));
		String linha ="";
		do{
			linha = in.readLine();
			if(linha != null){
				texto += linha +"\n";
			}
			
		}while(linha!=null);
	}
	
	public String getTexto(){
		return texto;
	}
}
