package br.uff.ps;

public enum TipoServico {
		PassagemArea (1),
		Hospedagem (2),
		PasseioTuristico (3);
	
		private final int idTipo;
		
		private TipoServico(int idTipo) {
			this.idTipo = idTipo;
		}
		
		public int getidTipo() {
			return idTipo;
		}
}
