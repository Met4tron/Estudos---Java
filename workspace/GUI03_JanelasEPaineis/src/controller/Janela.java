package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Janela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame janela = new JFrame();
		
		janela.setTitle("Título da janela");
		janela.setSize(500, 300);
		janela.setResizable(false);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icone = new ImageIcon("img/google.png");
		janela.setIconImage(icone.getImage());
		
		janela.setLocationRelativeTo(null);
		//janela.setLocation(100, 200);
		
		janela.setVisible(true);
	}

}
