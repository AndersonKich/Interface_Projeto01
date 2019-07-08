package model.entidade;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numero_Contrato;
	private Date data_contrato;
	private Double valor_Contrato;
	
	private List<VencimentoPrestacao>vencimento = new ArrayList<>(); 
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Contrato() {
		
	}
	
	public Contrato(Integer numero_Contrato, Date data_contrato,Double valor_Contrato ) {
		this.numero_Contrato = numero_Contrato;
		this.data_contrato = data_contrato;
		this.valor_Contrato = valor_Contrato;
	}

	public Integer getNumero_Contrato() {
		return numero_Contrato;
	}

	public void setNumero_Contrato(Integer numero_Contrato) {
		this.numero_Contrato = numero_Contrato;
	}

	public Date getData_contrato() {
		return data_contrato;
	}

	public void setData_contrato(Date data_contrato) {
		this.data_contrato = data_contrato;
	}

	public Double getValor_Contrato() {
		return valor_Contrato;
	}

	public void setValor_Contrato(Double valor_Contrato) {
		this.valor_Contrato = valor_Contrato;
	}

	public List<VencimentoPrestacao> getVencimento() {
		return vencimento;
	}

	public void setVencimento(List<VencimentoPrestacao> vencimento) {
		this.vencimento = vencimento;
	}

	public void print() {
		for(VencimentoPrestacao v : vencimento ) {
			
			System.out.println(sdf.format(v.getVencimento())+" - "+String.format("%.2f",v.getValor_prestacao()));
		}
	}

	
	

	
	


	
	
	
	
	
}
