package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComTratamentoDeErroGeneralizado {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		int val1 = obtemNumero("primeiro");
		int val2 = obtemNumero("segundo");
		
		System.out.println("Números lidos: "+val1+" e "+val2);
	}

	private static int obtemNumero(String string)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Digite o "+string+" número:");
		return lerNumero();
	}

	private static int lerNumero()throws IOException {
		// TODO Auto-generated method stub
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(teclado.readLine());
		return x;
	}

}
