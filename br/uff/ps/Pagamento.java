package br.uff.ps
public class Pagamento {
	private int idFormaPagamento;
	private int numeroParcelas;
	private Estorno estorno = null;
	private Pagamento tipoPagamento;
	
	public Pagamento(int numeroParcelas) {
		this.idFormaPagamento += 1;
		this.numeroParcelas = numeroParcelas;
	}
	
	public void adicionaFormaPagamento(int idFormaPagamento, Paypal formaPagamento) {
		this.tipoPagamento = formaPagamento;
	}
	
	public void adicionaFormaPagamento(int idFormaPagamento, CartaoCredito formaPagamento) {
		this.tipoPagamento = formaPagamento;
	}
	
	public void processarTransacao(int idFormaPagamento, int, numeroPercelas) {
		//codigo
		
	}
	
	public int formaParcelamento(int idFormaPagamento) {
		
	}
	
	public Compra solicitarInformacoesCompra(int idCompra) {
		
	}
}
