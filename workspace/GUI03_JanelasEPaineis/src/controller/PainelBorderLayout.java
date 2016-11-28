package controller;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelBorderLayout extends JFrame{

	public PainelBorderLayout(){
		super("Painel Gridlayout");
		
		ImageIcon icone1 = new ImageIcon("img/vagalume.jpg");
		ImageIcon icone2 = new ImageIcon("img/suporte.jpg");
		ImageIcon icone3 = new ImageIcon("img/facebook.png");
		
		JLabel label1 = new JLabel(icone1);
		JLabel label2 = new JLabel(icone2);
		JLabel label3 = new JLabel(icone3);
		
		JLabel labelTexto2 = new JLabel("Tudo o que merece ser feito, merece ser bem feito");
		
		JLabel labelTexto = new JLabel("Exemplo de texto e imagem no painel");
		JPanel painelTexto = new JPanel();
		painelTexto.add(labelTexto);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new BorderLayout());
		painelPrincipal.add(painelTexto,BorderLayout.NORTH);
		painelPrincipal.add(label1,BorderLayout.EAST);
		painelPrincipal.add(label2,BorderLayout.WEST);
		painelPrincipal.add(label3,BorderLayout.CENTER);
		painelPrincipal.add(labelTexto2,BorderLayout.SOUTH);

		
		add(painelPrincipal);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PainelBorderLayout();
	}

}
