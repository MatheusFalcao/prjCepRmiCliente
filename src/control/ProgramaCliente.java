package control;

import java.rmi.Naming;
import java.util.Scanner;

public class ProgramaCliente {

	private static Scanner input;

	public static void main(String[] args) throws Exception {
		
		input = new Scanner(System.in);

		String url = "rmi://localhost:1099/ConsultarLogradouro";
		ICep servico = (ICep) Naming.lookup(url);
		System.out.println("Digite o CEP que deseja consultar : ");
		Object resposta = servico.consulta(input.nextLine());
		
		System.out.println(" ");
		System.out.println("Resultado : "+resposta.toString());
		
	}

}
