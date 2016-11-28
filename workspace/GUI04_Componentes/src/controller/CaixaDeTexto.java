package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaixaDeTexto extends JFrame{
	
	JTextField caixaDeTexto = new JTextField(20);
	
	public CaixaDeTexto(){
		super("Caixa de Texto");
		
		caixaDeTexto.setText("Digite aqui...");
		caixaDeTexto.setToolTipText("Digita seu ovo!!!");
		
		caixaDeTexto.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				caixaDeTexto.setText(caixaDeTexto.getText().toUpperCase());
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JButton botao= new JButton("Botão");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "Você digitou:"+caixaDeTexto.getText());
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(caixaDeTexto);
		painel.add(botao);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CaixaDeTexto();
	}

}
