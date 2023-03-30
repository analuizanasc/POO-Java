
public class Conta {
	
	public int numero;
	protected String tipo;
	private String cliente;
	private float saldo;
	private boolean status;
	
	public void Conta() {
		this.numero = 000;
		this.status = false;
	}
	
	public void relatorio() {
		System.out.println("Informações da conta:");
		System.out.println("-----------------------------------");
		System.out.println("Tipo:" + this.getTipo());
		System.out.println("Número:" + this.getNumero());
		System.out.println("Cliente:" + this.getCliente());
		System.out.println("Saldo:" + this.getSaldo());
		System.out.println("Status:" + this.getStatus());
		System.out.println("-----------------------------------");
	}
	
	public void abrirConta(String tipo, String cliente) {
		this.setTipo(tipo);
		this.setCliente(cliente);
		this.setNumero(this.getNumero()+1);
		this.setStatus(true);
		if (tipo == "corrente") {
			this.setSaldo(50); 
		} else {
			this.setSaldo(150);;
		}
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Você precisa sacar seu dinheiro primeiro.");
			System.out.println("Seu saldo atual é " + this.getSaldo());
		} else if (this.getSaldo() < 0) {
			System.out.println("Você está devendo ao banco. Precisa quitar sua dívida primeiro!");
			System.out.println("Seu saldo atual é " + this.getSaldo());
		} else {
			this.setStatus(false);
			System.out.println("Sua conta foi fechada com sucesso! Volte sempre!");
		}

	}
	
	public void pagarMensal() {
		int mensal = 0;
		if (this.getTipo() == "corrente") {
			mensal = 12;
				
		}else {
			mensal = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() > 0) {
				saldo = this.getSaldo() - mensal;
				this.setSaldo(saldo);
				System.out.println("Saldo suficiente. Mensalidade descontada!");
				System.out.println("Seu saldo atual é "+ this.getSaldo());
			} else {
				System.out.println("Saldo insuficiente!");
			}
		}else {
			saldo = this.getSaldo();
			saldo -= mensal;
		}

	}
	
	public void depositar(float valor) {
		if (this.getStatus()) {
			saldo = this.getSaldo() + valor;
			this.setSaldo(saldo);
			System.out.println("Depósito realizado com sucesso na conta de " + this.getCliente());
			System.out.println("Seu saldo é " + this.getSaldo());
			System.out.println("-----------------------------------");
		} else {
			System.out.println("Essa conta não existe! Verifique novamente o número");
		}

	}
	
	public void sacar(float valor) {
		if (this.getStatus()) {
			if(this.getSaldo() >= valor) {
				saldo = this.getSaldo() - valor;
				this.setSaldo(saldo);
				System.out.println("Saque realizado com sucesso!");
				System.out.println("Seu saldo é " + saldo);
				System.out.println("-----------------------------------");
			} else {
				System.out.println("Seu saldo é insuficiente!");
			}
		} else {
			System.out.println("Não foi possível realizar o saque. Essa conta não existe!");
		}

	}	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero ++;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	


}

