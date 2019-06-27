package br.uff.ps;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;

public class Servico {
	
	private Date dataInicio;
	private Date dataFim;
	private BigInteger codigoServico;
	private int vinculadosAoServico;
	private Double valor;
	private int tipoServico;
	private ArrayList<PassagemAerea> passagemAereas;
	private ArrayList<Hospedagem> hospedagens;
	private ArrayList<PasseioTuristico> passeioTuristicos;
	
	public Servico(Date dataInicio, Date dataFim, BigInteger codigoServico, Double valor, int tipoServico, int vinculadosAoServico) {
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.codigoServico = codigoServico;
		this.vinculadosAoServico = vinculadosAoServico;
		this.valor = valor;
		this.tipoServico = tipoServico;
	}
	
	public void criarPasseioTuristico() {
		PasseioTuristico passeio = new PasseioTuristico();
		passeioTuristicos.add(passeio);
	}
	
	public void criarPassagemAerea() {
		PassagemAerea passagem = new PassagemAerea();
		passagemAereas.add(passagem);
	}
	
	public void criarHospedagens() {
		Hospedagem hospedagem = new Hospedagem();
		hospedagens.add(hospedagem);
	}
	

	public ArrayList<PassagemAerea> getPassagemAereas() {
		return passagemAereas;
	}

	public void setPassagemAereas(ArrayList<PassagemAerea> passagemAereas) {
		this.passagemAereas = passagemAereas;
	}

	public ArrayList<Hospedagem> getHospedagens() {
		return hospedagens;
	}

	public void setHospedagens(ArrayList<Hospedagem> hospedagens) {
		this.hospedagens = hospedagens;
	}

	public ArrayList<PasseioTuristico> getPasseioTuristicos() {
		return passeioTuristicos;
	}

	public void setPasseioTuristicos(ArrayList<PasseioTuristico> passeioTuristicos) {
		this.passeioTuristicos = passeioTuristicos;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public BigInteger getCodigoServico() {
		return codigoServico;
	}

	public void setCodigoServico(BigInteger codigoServico) {
		this.codigoServico = codigoServico;
	}

	public int getVinculadosAoServico() {
		return vinculadosAoServico;
	}

	public void setVinculadosAoServico(int vinculadosAoServico) {
		this.vinculadosAoServico = vinculadosAoServico;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public int getTipoServico() {
		return tipoServico;
	}

	public void setTipoServico(int tipoServico) {
		this.tipoServico = tipoServico;
	}
	
	
	
	
}
