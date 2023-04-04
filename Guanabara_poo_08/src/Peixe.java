
public class Peixe extends Animal {

	private String CorEscama;
	
	public void SoltarBolha() {
		System.out.println("Soltando bolhas");
	}

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substâncias");
	}

	@Override
	public void emitirSom() {
		System.out.println("Peixe não faz som");
	}
	
	public String getCorEscama() {
		return CorEscama;
	}


	public void setCorEscama(String corEscama) {
		CorEscama = corEscama;
	}
	
}
