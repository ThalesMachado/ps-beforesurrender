package br.uff.ps;

import java.util.Date;

public class Voo {
	private String idVoo;
	private int aeronave;
	private String siglaAeroportoOrigem;
	private String siglaAeroportoDestino;
	private Date dataSaida;
	private Date dataChegada;
	private boolean cancelado = false;
	private CompanhiaArea companhia;
	public String getIdVoo() {
		return idVoo;
	}
	public void setIdVoo(String idVoo) {
		this.idVoo = idVoo;
	}
	public int getAeronave() {
		return aeronave;
	}
	public void setAeronave(int aeronave) {
		this.aeronave = aeronave;
	}
	public String getSiglaAeroportoOrigem() {
		return siglaAeroportoOrigem;
	}
	public void setSiglaAeroportoOrigem(String siglaAeroportoOrigem) {
		this.siglaAeroportoOrigem = siglaAeroportoOrigem;
	}
	public String getSiglaAeroportoDestino() {
		return siglaAeroportoDestino;
	}
	public void setSiglaAeroportoDestino(String siglaAeroportoDestino) {
		this.siglaAeroportoDestino = siglaAeroportoDestino;
	}
	public Date getDataSaida() {
		return dataSaida;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	public Date getDataChegada() {
		return dataChegada;
	}
	public void setDataChegada(Date dataChegada) {
		this.dataChegada = dataChegada;
	}
	public boolean isCancelado() {
		return cancelado;
	}
	public void setCancelado(boolean cancelado) {
		this.cancelado = cancelado;
	}
	public CompanhiaArea getCompanhia() {
		return companhia;
	}
	public void setCompanhia(CompanhiaArea companhia) {
		this.companhia = companhia;
	}
	
	
	
}
