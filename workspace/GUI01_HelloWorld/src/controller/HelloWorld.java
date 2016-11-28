package controller;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame tela = new JFrame("Programação Desktop");
		JLabel texto = new JLabel("Alô, mundo!!!");
		
		tela.setLayout(null);
		tela.getContentPane().add(texto);
		
		texto.setBounds(30,20,210,20);
		
		tela.setSize(400, 100);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setVisible(true);
	}

}
