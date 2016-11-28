package controller;

import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class JanelasDeEntrada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto1 = JOptionPane.showInputDialog("Janela de entrada 1");
		JOptionPane.showMessageDialog(null, "Você digitou: "+texto1);
		
		String texto2 = JOptionPane.showInputDialog(null,"Janela de entrada 2");
		JOptionPane.showMessageDialog(null, "Você digitou: "+texto2);
		
		String texto3 = JOptionPane.showInputDialog("Janela de entrada 3","Valor inicial...");
		JOptionPane.showMessageDialog(null, "Você digitou: "+texto3);
		
		String texto4 = JOptionPane.showInputDialog(null,"Janela de entrada 4","Valor inicial...");
		JOptionPane.showMessageDialog(null, "Você digitou: "+texto4);
		
		String texto5 = JOptionPane.showInputDialog(null,"Janela de entrada 5","Título da janela de entrada 5",JOptionPane.ERROR_MESSAGE);
		
		ImageIcon icone = new ImageIcon("img/vagaluma.jpg");
		String[] vetor = {"","Alex","Adriano","Rodrigo","Xicão"};
		Object objeto = JOptionPane.showInputDialog(null, "Janela de entrada 6", "Título da janela de entrada 6", JOptionPane.PLAIN_MESSAGE, icone, vetor, vetor[0]);
		JOptionPane.showMessageDialog(null, "Você selecionou: "+objeto);
		
		
	}

}





