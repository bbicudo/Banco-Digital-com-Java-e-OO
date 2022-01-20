import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	protected List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void listarContas() {
		System.out.println(String.format("=== LISTA DE CONTAS ==="));
		for(Conta conta: contas) {
			
			System.out.println(String.format("Nome do cliente: %s",conta.cliente.getNome()));
			System.out.println(String.format("Numero da Conta: %d",conta.getNumConta()));
			System.out.println(String.format("Nome do cliente: %d",conta.getAgencia()));
			System.out.println("####");
		}
	}
}
