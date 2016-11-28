package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import util.ActionBotao;

public class Botao extends JFrame{

	public Botao(){
		super("Botão");
		
		JButton botao = new JButton("Botão 1");
		botao.setToolTipText("Clica em mim!!!");
		
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				new Abas();
			}
		});
		
		
		JPanel painel = new JPanel();
		painel.add(botao);
		
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Botao();
	}

}
