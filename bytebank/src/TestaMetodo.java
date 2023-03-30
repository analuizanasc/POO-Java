
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDaAna = new Conta();
		contaDaAna.saldo = 100;
		contaDaAna.deposita(50);
		
		System.out.println(contaDaAna.saldo);
		
		boolean conseguiuRetirar = contaDaAna.saca(20);
		System.out.println(contaDaAna.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDoPotter = new Conta();
		contaDoPotter.saldo = 1000;
		
		boolean sucessoTransferencia = contaDoPotter.transfere(300, contaDaAna);
		
		if (sucessoTransferencia) {
			System.out.println("transferência com sucesso");
		} else {
			System.out.println("faltou dinheiro ");
		}
		
		System.out.println(contaDoPotter.saldo);
		System.out.println(contaDaAna.saldo);
		
	}
}
