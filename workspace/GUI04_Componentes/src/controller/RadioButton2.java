package controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton2 extends JFrame{

	ImageIcon iconeContato = new ImageIcon("img/contato.png");
	//ImageIcon iconeContato = new ImageIcon(getClass().getResource("/img/contato.png"));
	ImageIcon iconeFacebook = new ImageIcon("img/facebook.png");
	ImageIcon iconeGoogle = new ImageIcon("img/google.png");
	JLabel label = new JLabel(iconeContato);
	JRadioButton radioContato = new JRadioButton("Contato");
	JRadioButton radioFacebook = new JRadioButton("Facebook");
	JRadioButton radioGoogle = new JRadioButton("Google");
	ButtonGroup group = new ButtonGroup();
	
	public RadioButton2(){
		super("RadioButton");
		
		label.setPreferredSize(new Dimension(65, 65));
		
		radioContato.setActionCommand("contato");
		radioContato.setMnemonic(KeyEvent.VK_C);
		radioContato.setSelected(true);
		
		radioFacebook.setActionCommand("facebook");
		radioFacebook.setMnemonic(KeyEvent.VK_F);
		
		radioGoogle.setActionCommand("google");
		radioGoogle.setMnemonic(KeyEvent.VK_G);
		
		
		group.add(radioContato);
		group.add(radioFacebook);
		group.add(radioGoogle);
		
		radioContato.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setIcon(iconeContato);
			}
		});
		
		radioFacebook.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setIcon(iconeFacebook);
			}
		});
		
		radioGoogle.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				label.setIcon(iconeGoogle);
			}
		});
		
		JButton botao = new JButton("Ok");
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), group.getSelection().getActionCommand(),"Exemplo RadioButton2",JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		JPanel painel = new JPanel(new GridLayout(3,1));
		painel.add(radioContato);
		painel.add(radioFacebook);
		painel.add(radioGoogle);
		
		
		getContentPane().add(painel,BorderLayout.WEST);
		getContentPane().add(label,BorderLayout.CENTER);
		getContentPane().add(botao,BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButton2();
	}

}
