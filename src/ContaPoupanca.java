
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimeEstrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirValores();		
	}
	
}
