package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Mensagens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Mensagem 1");
		
		
		JOptionPane.showMessageDialog(null, "Mensagem 2",
				"T�tulo da mensagem 2",
				JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem 2",
				"T�tulo da mensagem 2",
				JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem 2",
				"T�tulo da mensagem 2",
				JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem 2",
				"T�tulo da mensagem 2",
				JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Mensagem 2",
				"T�tulo da mensagem 2",
				JOptionPane.PLAIN_MESSAGE);
		
		
		
		
		ImageIcon icone = new ImageIcon("img/suporte.jpg");
		JOptionPane.showMessageDialog(null, "Mensagem 3",
				"T�tulo da mensagem 3",
				JOptionPane.PLAIN_MESSAGE,
				icone);
	}

}
