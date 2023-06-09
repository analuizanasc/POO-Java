import java.util.Random;


public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria() == l2.getCategoria() && l1 != l2) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			System.out.println("A luta não pode acontecer!");
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.getAprovada()) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);
			System.out.println("");
			System.out.println("====== RESULTADO =====");
			switch (vencedor) {
			case 0: // empate
				System.out.println("E a luta deu.... Empate!");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break; // tem de ter break no switch
			case 1: // desafiado vence
				System.out.println(this.desafiado.getNome() + " ganhou!");
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();
				break;
			case 2: // desafiante vence
				System.out.println(this.desafiante.getNome() + " ganhou!");
				this.desafiado.perderLuta();
				this.desafiante.ganharLuta();
				break;
			}
			System.out.println("=======================");
		}		
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean getAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
