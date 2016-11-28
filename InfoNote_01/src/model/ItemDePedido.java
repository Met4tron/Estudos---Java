package model;

import java.text.NumberFormat;

public class ItemDePedido {
	private int qtde;
	private double subtotal;
	private Notebook notebook;



	public ItemDePedido(){
		super();
	}
	
	public ItemDePedido (int qtde, double subtotal){
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
	}
	
	public ItemDePedido (int qtde, double subtotal, Notebook notebook){
		super();
		this.qtde = qtde;
		this.subtotal = subtotal;
		this.notebook = notebook;
	}
	
	public int getQtde() {
		return qtde;
	}
	
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	public double getSubtotal() {
		return subtotal;
	}
	
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
		
	public Notebook getNotebook() {
		return notebook;
	}

	public void setNotebook(Notebook notebook) {
		this.notebook = notebook;
	}

	public void mostarItem(){
		System.out.println("------------------------------------");
		System.out.println("Item de Pedido 1");
		System.out.println("------------------------------------");
		System.out.println("Quantidade: " + this.qtde);
		System.out.println("Subtotal: " + NumberFormat.getCurrencyInstance().format(this.subtotal));
		System.out.println();
	}
}



