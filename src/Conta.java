
public abstract class Conta implements IfConta{

	private static int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numConta;
	protected double saldo;
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numConta = SEQUENCIAL++;
		this.saldo = 0;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void imprimirValores() {
		System.out.println(String.format("Nome Cliente: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.numConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
