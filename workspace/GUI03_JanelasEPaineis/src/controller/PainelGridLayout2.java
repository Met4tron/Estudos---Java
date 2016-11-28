package controller;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelGridLayout2 extends JFrame{

	public PainelGridLayout2(){
		super("Painel Gridlayout");
		
		ImageIcon icone1 = new ImageIcon("img/vagalume.jpg");
		ImageIcon icone2 = new ImageIcon("img/suporte.jpg");
		ImageIcon icone3 = new ImageIcon("img/facebook.png");
		
		JLabel label1 = new JLabel(icone1);
		JLabel label2 = new JLabel(icone2);
		JLabel label3 = new JLabel(icone3);
		
		JLabel labelTexto = new JLabel("Exemplo de texto e imagem no painel");
		
		JPanel painelIcones = new JPanel();
		painelIcones.add(label1);
		painelIcones.add(label2);
		painelIcones.add(label3);
		
		JPanel painelPrincipal = new JPanel();
		painelPrincipal.setLayout(new GridLayout(2,1));
		painelPrincipal.add(labelTexto);
		painelPrincipal.add(painelIcones);

		
		add(painelPrincipal);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PainelGridLayout2();
	}

}
