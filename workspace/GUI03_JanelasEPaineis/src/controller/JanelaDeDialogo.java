package controller;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JanelaDeDialogo extends JDialog{

	JLabel label1 = new JLabel("Seu nome:");
	JTextField texto = new JTextField(20);
	
	public JanelaDeDialogo(JFrame janela){
		super(janela,"Exemplo de JDialog:",true);
		getContentPane().add(label1,BorderLayout.NORTH);
		getContentPane().add(texto,BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabel labelJanela = new JLabel("Label da janela principal.");
		JButton botao = new JButton("Botão");
		
		
		JFrame janela = new JFrame("Janela Principal:");
		janela.getContentPane().add(labelJanela,BorderLayout.CENTER);
		janela.getContentPane().add(botao,BorderLayout.SOUTH);
		
		
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(400, 400);
		janela.setVisible(true);

		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new JanelaDeDialogo(janela);
			}
		});
	}

}
