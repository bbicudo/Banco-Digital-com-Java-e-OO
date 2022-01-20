
public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		cc.imprimeEstrato();
		cp.imprimeEstrato();

	}

}
