package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBox extends JFrame{
	
	JLabel label = new JLabel();
	
	public ComboBox(){
		super("ComboBox");
		
		
		String[] vetor = {"um","dois","três"};
		JComboBox comboBox = new JComboBox(vetor);
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JComboBox cb =  (JComboBox)e.getSource();
				String conteudo = (String)cb.getSelectedItem();
				label.setText(conteudo);
			}
		});
		
		JPanel painel = new JPanel();
		painel.add(comboBox);
		painel.add(label);
		
		add(painel);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBox();
	}

}
