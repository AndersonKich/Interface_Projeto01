package model.servicos;



public class Paypal implements ServicoDePagamentoOnline{
	
	@Override
	public double taxas(double valor, int mes) {
		
		valor += valor * 0.01 * mes + valor * 0.02;
		return valor;
		
		
	}
}