
public abstract class Conta {

	private int numero;
	private int agencia;
	private Cliente titular;
	private static int total = 0;
	
	public Conta(int numero, int agencia) {
		Conta.total++;
		this.numero = numero;
		this.agencia = agencia;
	}
	
	public abstract void depositar(double valor);
	public abstract void sacar(double valor);
	public abstract void saldo();
	
	
	
}
