package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entidade.Contrato;
import model.servicos.BoletoPrestacao;
import model.servicos.Paypal;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("---------Dados do contrato---------\n");
		System.out.print("Numero do contrato: ");
		int numero_Contrato = teclado.nextInt();
		System.out.print("Data do contrato: ");
		teclado.nextLine();
		Date data_contrato = sdf.parse(teclado.nextLine());
		System.out.print("Valor do contrato: ");
		double valor_Contrato = teclado.nextDouble();
		System.out.print("Numero de parcelas do contrato: ");
		int mes = teclado.nextInt();
		System.out.println();
		System.out.println("---Prestações---");
		
		Contrato contrato = new Contrato(numero_Contrato, data_contrato, valor_Contrato);
		
		BoletoPrestacao B = new BoletoPrestacao(new Paypal());
		
		B.processandoContrato(contrato, mes);
		
		contrato.print();
		
	
		

	}

}
