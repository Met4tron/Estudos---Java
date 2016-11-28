package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelGridLayout1 extends JFrame{

	public PainelGridLayout1(){
		super("Painel Gridlayout");
		
		ImageIcon icone1 = new ImageIcon("img/vagalume.jpg");
		ImageIcon icone2 = new ImageIcon("img/suporte.jpg");
		ImageIcon icone3 = new ImageIcon("img/facebook.png");
		
		JLabel label1 = new JLabel(icone1);
		JLabel label2 = new JLabel(icone2);
		JLabel label3 = new JLabel(icone3);
		
		JLabel labelTexto = new JLabel("Exemplo de texto e imagem no painel");
		
		JPanel painel = new JPanel();
		painel.setLayout(new GridLayout(2,2));
		painel.add(labelTexto);
		painel.add(label1);
		painel.add(label2);
		painel.add(label3);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PainelGridLayout1();
	}

}
