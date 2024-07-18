package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número do usuário: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o número da Agência! ");
		String agencia = sc.nextLine();
		
		
		System.out.println("Digite o nome do cliente: ");
		String nomeCliente = sc.nextLine();
		
		System.out.println("Insira o valor do depósito: ");
		double saldo = sc.nextDouble();
		
		ContaTerminal conta = new ContaTerminal(numero, agencia, nomeCliente, saldo);
		
		System.out.println(conta.toString());
		
		sc.close();

	}

}
