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
		String[] resposta = servico.consulta(input.nextLine());
		
		System.out.println(" ");
		System.out.println("Cep : "+resposta[0]);
		System.out.println("Estado : "+resposta[1]);
		System.out.println("Rua : "+resposta[2]);
		System.out.println("Tipo de Logradouro : "+resposta[3]);
		
	}

}
