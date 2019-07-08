package model.servicos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import model.entidade.Contrato;
import model.entidade.VencimentoPrestacao;

public class BoletoPrestacao {


	public BoletoPrestacao(ServicoDePagamentoOnline pagamentoOnline) {
		PagamentoOnline = pagamentoOnline;
	}

	private ServicoDePagamentoOnline PagamentoOnline;

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public ServicoDePagamentoOnline getPagamentoOnline() {
		return PagamentoOnline;
	}
	
	public void setPagamentoOnline(ServicoDePagamentoOnline pagamentoOnline) {
		PagamentoOnline = pagamentoOnline;
	}

	public void processandoContrato(Contrato contrato, int mes) {

		double valor = contrato.getValor_Contrato();
		 valor /= mes;

		Calendar call = Calendar.getInstance();
		Date dataInicio = contrato.getData_contrato();
		call.setTime(dataInicio);
		for (int i = 1; i <= mes; i++) {
			call.add(Calendar.MONTH, 1);
			dataInicio = call.getTime();
			Date vencimento = dataInicio;

			double valor_prestacao = PagamentoOnline.taxas(valor, i);

			contrato.getVencimento().add(new VencimentoPrestacao(vencimento, valor_prestacao));
		}
	}
}
