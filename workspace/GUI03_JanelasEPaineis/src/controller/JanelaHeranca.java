package controller;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class JanelaHeranca extends JFrame{

	public JanelaHeranca(){
		super("T�tulo da janela com heran�a");
				
		setSize(500, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icone = new ImageIcon("img/google.png");
		setIconImage(icone.getImage());
		
		setLocationRelativeTo(null);
		//setLocation(100, 200);
		
		setVisible(true);
	}
	
	public JanelaHeranca(int largura,int altura){
		super("T�tulo da janela com heran�a");
				
		setSize(largura, altura);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icone = new ImageIcon("img/google.png");
		setIconImage(icone.getImage());
		
		setLocationRelativeTo(null);
		//setLocation(100, 200);
		
		setVisible(true);
	}
	
	public JanelaHeranca(int largura,int altura,String titulo){
		super(titulo);
				
		setSize(largura, altura);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icone = new ImageIcon("img/google.png");
		setIconImage(icone.getImage());
		
		setLocationRelativeTo(null);
		//setLocation(100, 200);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JanelaHeranca();
		new JanelaHeranca(200, 200);
		new JanelaHeranca(600, 50, "Janela ovo");
	}

}
