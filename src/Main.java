import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int opt = 6;
		int conta = 0;
		double valor = 0.0;
		
		try (Scanner info = new Scanner(System.in)) {
			
			Cliente cliente = new Cliente();
			
			System.out.println("Informe o nome do cliente: ");
			String cli = info.nextLine();
			cliente.setNome(cli); 
		
			Conta cc = new ContaCorrente(cliente);
			Conta cp = new ContaPoupanca(cliente);
			
			do {
				System.out.println("### SELECIONE A OPERAÇÃO DESEJADA ###");
				System.out.println("1- Imprimir Extrato");
				System.out.println("2- Depósito");
				System.out.println("3- Saque");
				System.out.println("4- Transferência");
				System.out.println("0 - SAIR");
				
				opt = info.nextInt();
				
				switch(opt) {
				
				case 0:
					
					break;
				
					case 1:
						
						cc.imprimeEstrato();
						cp.imprimeEstrato();
						
						break;
						
					case 2:
						
						System.out.println("Deseja depositar em qual conta? 1- Corrente / 2 Poupança");
						conta = info.nextInt();
						System.out.println("Qual o valor a ser depositado?");
						valor = info.nextDouble();
						
						if(conta == 1) {
							cc.depositar(valor);
						} else if(conta ==2) {
							cp.depositar(valor);
						}else {
							System.out.println("Opção Inválida");
						}
						
						break;
						
					case 3:
						
						System.out.println("Deseja sacar de qual conta? 1- Corrente / 2 Poupança");
						conta = info.nextInt();
						System.out.println("Qual o valor a ser sacado?");
						valor = info.nextDouble();
						
						if(conta == 1) {
							cc.sacar(valor);
						} else if(conta ==2) {
							cp.sacar(valor);
						}else {
							System.out.println("Opção Inválida");
						}
						
						break;	
						
					case 4:
						
						System.out.println("De qual conta será transferido o dinheiro? 1- Corrente / 2 Poupança");
						conta = info.nextInt();
						System.out.println("Qual o valor a ser transferido?");
						valor = info.nextDouble();
						
						if(conta == 1) {
							cc.transferir(valor, cp);
						} else if(conta ==2) {
							cp.transferir(valor, cc);
						}else {
							System.out.println("Opção Inválida");
						}
						
						break;	
						
					default:
						
						System.out.println("Opção Inválida");
						
						break;
				
				}
				
			}while(opt != 0);

		}

	}

}
