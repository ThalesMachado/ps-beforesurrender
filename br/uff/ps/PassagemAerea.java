package br.uff.ps;

import java.util.ArrayList;

public class PassagemAerea {
	private String numeroPassagem;
	private String empresArea;
	private int quantidadeBagagem;
	private ArrayList<String> classePassagem;
	private ArrayList<String> assentosReservados;
	private ArrayList<Integer> assentos;
	private int quantidade;
	Voo voo;
	
	
	public void escolherAssentos(ArrayList<String> assentos) {
		for (int i = 0 ; i < quantidade ; i++) {
			this.assentosReservados.add(assentos.get(i));
		}
	}
}
