package controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame{

	ImageIcon iconeContato = new ImageIcon("img/contato.png");
	ImageIcon iconeFacebook = new ImageIcon("img/facebook.png");
	ImageIcon iconeGoogle = new ImageIcon("img/google.png");
	JLabel label = new JLabel(iconeContato);
	
	public RadioButton(){
		super("RadioButton");
		
		label.setPreferredSize(new Dimension(65, 65));
		
		JRadioButton radioContato = new JRadioButton("Contato");
		radioContato.setMnemonic(KeyEvent.VK_C);
		radioContato.setSelected(true);
		
		JRadioButton radioFacebook = new JRadioButton("Facebook");
		radioFacebook.setMnemonic(KeyEvent.VK_F);
		
		JRadioButton radioGoogle = new JRadioButton("Google");
		radioGoogle.setMnemonic(KeyEvent.VK_G);
		
		ButtonGroup group = new ButtonGroup();
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
		
		JPanel painel = new JPanel(new GridLayout(3,1));
		painel.add(radioContato);
		painel.add(radioFacebook);
		painel.add(radioGoogle);
		
		
		getContentPane().add(painel,BorderLayout.WEST);
		getContentPane().add(label,BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButton();
	}

}
