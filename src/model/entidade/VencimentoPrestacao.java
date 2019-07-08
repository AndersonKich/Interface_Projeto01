package model.entidade;

import java.util.Date;

public class VencimentoPrestacao {

	private Date vencimento;
	private Double valor_prestacao;

	
	public VencimentoPrestacao(Date vencimento, Double valor_prestacao) {
		this.vencimento = vencimento;
		this.valor_prestacao = valor_prestacao;
	}


	public Date getVencimento() {
		return vencimento;
	}


	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}


	public Double getValor_prestacao() {
		return valor_prestacao;
	}


	public void setValor_prestacao(Double valor_prestacao) {
		this.valor_prestacao = valor_prestacao;
	}
	

	
	
	
}
