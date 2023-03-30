
public class desafio {
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		c1.abrirConta("corrente", "Ana Luiza Nascimento");
		c1.relatorio();
		//c1.pagarMensal();
		
		c1.depositar(100);
 
		c1.fecharConta();
		
		Conta c2 = new Conta();
		c2.abrirConta("poupança", "Baia Formosa");
		c2.depositar(500);
		c2.sacar(100);
		c2.relatorio();

	}
}
