
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoPotter = new Conta();
		System.out.println(contaDoPotter.pegaSaldo());
		
		contaDoPotter.titular = new Cliente();
		System.out.println(contaDoPotter.titular);
		
		contaDoPotter.titular.nome = "Potter";
		System.out.println(contaDoPotter.titular.nome);
	}
}
