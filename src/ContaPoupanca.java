
public class ContaPoupanca extends Conta {

	@Override
	public void imprimeEstrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirValores();		
	}
	
}
