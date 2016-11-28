package controller;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JanelasDeConfirmacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao1 = JOptionPane.showConfirmDialog(null, "Janela de confirma��o 1");
		
		switch (opcao1) {
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em Cancelar.");
			break;
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em Sim.");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em N�o.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Voc� fechou a janela.");
			break;
		}
		
		int opcao2 = JOptionPane.showConfirmDialog(null, "Janela de confirma��o 2","T�tulo da janela de confirma��o 2",JOptionPane.OK_CANCEL_OPTION);
		
		switch (opcao2) {
		case JOptionPane.OK_OPTION:
			System.out.println("Voc� clicou em OK");
			JOptionPane.showMessageDialog(null, "Voc� clicou em OK");
			break;
		case JOptionPane.CANCEL_OPTION:
			System.out.println("Voc� clicou em Cancelar");
			JOptionPane.showMessageDialog(null, "Voc� clicou em Cancelar");
			break;
		default:
			System.out.println("Voc� fechou a janela");
			JOptionPane.showMessageDialog(null, "Voc� fechou a janela");
			break;
		}
		
		int opcao3 = JOptionPane.showConfirmDialog(null, "Janela de confirma��o 3","T�tulo da mensagem 3",JOptionPane.YES_NO_OPTION,JOptionPane.ERROR_MESSAGE);
		switch (opcao3) {
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em Sim");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em N�o");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Voc� fechou a janela");
			break;
		}
		
		ImageIcon icone = new ImageIcon("img/bioquimica.png");
		int opcao4 = JOptionPane.showConfirmDialog(null, "Janela de confirma��o 4","T�tulo da janela de confirma��o 4",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE,icone);
		switch (opcao4) {
		case JOptionPane.CANCEL_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em Cancelar.");
			break;
		case JOptionPane.YES_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em Sim.");
			break;
		case JOptionPane.NO_OPTION:
			JOptionPane.showMessageDialog(null, "Voc� clicou em N�o.");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Voc� fechou a janela.");
			break;
		}
		
	}

}







