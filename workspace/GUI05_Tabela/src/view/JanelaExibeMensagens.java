package view;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import util.ContatoTableModel;
import model.Contato;

public class JanelaExibeMensagens extends JFrame{

	public JanelaExibeMensagens(List<Contato> contatos) {
		super("Lista de Mensagens:");
		
		JTable tabela = new JTable();
		ContatoTableModel tableModel = new ContatoTableModel(contatos);
		tabela.setModel(tableModel);
		
		JScrollPane scroll = new JScrollPane();
		scroll.getViewport().add(tabela);
		scroll.setSize(100, 200);
		
		getContentPane().add(scroll);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);
		setAlwaysOnTop(true);
	}

}
