package model;

import java.text.NumberFormat;

public class Pedido {
	private int numero;
	private String dataEmissao;
	private String formaDePagamento;
	private double valorTotal;
	private String situacao;
	private Endereco enderecoEntrega;
	private ItemDePedido itens[] = new ItemDePedido[10];

	
	public Pedido(){
		super();
	}
	public Pedido (int numero, String dataEmissao, String formaDePagamento, double valorTotal, String situacao, Endereco enderecoEntrega){
	
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.formaDePagamento = formaDePagamento;
		this.valorTotal = valorTotal;
		this.situacao = situacao;
		this.enderecoEntrega = enderecoEntrega;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(String dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public String getFormaDePagamento() {
		return formaDePagamento;
	}
	public void setFormaDePagamento(String formaDePagamento) {
		this.formaDePagamento = formaDePagamento;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public Endereco getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(Endereco enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	public ItemDePedido[] getItens() {
		return itens;
	}
	public void setItens(ItemDePedido[] itens) {
		this.itens = itens;
	}
	/*public void mostrarPedido(){
		System.out.println("------------------------------------");
		System.out.println("Pedido");
		System.out.println("------------------------------------");
		System.out.println("Número do Pedido: " + this.numero);
		System.out.println("Forma de Pagamento: " + this.formaDePagamento);
		System.out.println("Valor Total: " + this.valorTotal);
		System.out.println("Situação: " + this.situacao);
		System.out.println("Itens de Pedido: ");*/
	@Override
	public String toString(){
		final String ENTER = "\n";
		String retValue = "";
		retValue = "Informações Sobre o Pedido:"+ENTER+"Número do Pedido"+numero+ENTER+"Forma de Pagamento"+formaDePagamento+ENTER+"Valor Total: "+NumberFormat.getCurrencyInstance().format(valorTotal)+ENTER+"Situação"+situacao+ENTER+"Endereco da Entrega"+enderecoEntrega+ENTER+"Itens: ";
		
		for(int i = 0; i<itens.length; i++){
			retValue += itens[i]+ENTER;
		}
		return retValue;
	}
	public boolean inserirItem (ItemDePedido item){
		for(int i = 0; i< itens.length; ++i){
			if(itens[i] == null){
				itens[i] = item;
				return true;
			}
		}
		return false;
	}
	
}

