package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class CaixaDeSenha extends JFrame{

	public CaixaDeSenha(){
		super("Caixa de Senha");
		
		JPasswordField caixaDeSenha = new JPasswordField(20);
		JLabel label = new JLabel("Digite sua senha:");
		caixaDeSenha.setToolTipText("Senha");
		
		JButton botao = new JButton("Botão");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, new String(caixaDeSenha.getPassword()));
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(label);
		painel.add(caixaDeSenha);
		painel.add(botao);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CaixaDeSenha();
	}

}
