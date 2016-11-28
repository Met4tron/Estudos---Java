package controller;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Abas extends JFrame{

	JTabbedPane abas = new JTabbedPane();
	
	JLabel label1 = new JLabel("Painel 1");
	JLabel label2 = new JLabel("Painel 2");
	JLabel label3 = new JLabel("Painel 3");
	
	JPanel painel1 = new JPanel();
	JPanel painel2 = new JPanel();
	JPanel painel3 = new JPanel();
	
	ImageIcon iconeExcluir = new ImageIcon("img/excluir20x20.gif");
	ImageIcon iconeImpressora = new ImageIcon("img/impressora20x20.gif");
	ImageIcon iconeLupa = new ImageIcon("img/lupa20x20.png");
		
	public Abas(){
		super("Exemplo abas");
		
		painel1.add(label1);
		painel2.add(label2);
		painel3.add(label3);
		
		abas.addTab("Excluir", iconeExcluir, painel1,"Primeiro painel");
		abas.addTab("Impressora", iconeImpressora, painel2,"Segundo painel");
		abas.addTab("Lupa", iconeLupa, painel3, "Terceiro painel");
		
		Container container = getContentPane();
		container.add(abas);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Abas();
	}

}
