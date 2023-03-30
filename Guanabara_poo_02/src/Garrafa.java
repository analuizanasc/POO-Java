
public class Garrafa {
	public String cor;
	public String tamanho;
	private int ml;
	protected boolean cheia;
	protected boolean tampada;
	
	public void status() { 
		System.out.println("Cor da garrafa: " + this.cor);
		System.out.println("Tamanho da garrafa: " + this.tamanho);
		System.out.println("A garrafa tem quantos ml´s? " + this.ml);
		System.out.println("A garrafa está cheia! " + this.cheia);
		System.out.println("A garrafa está tampada! " + this.tampada);
	}
	protected void encher() {
		if (this.cheia == true) {
			System.out.println("ERRO! A garrafa já está cheia!");
		} else {
			System.out.println("Estou enchendo...");
		}
	}
	
	public void tampada() {
		this.tampada = true;
	}
	
	public void destampada() {
		this.tampada = false;
	}
	
	protected void esvaziar() {
		if ( this.cheia == true) {
			System.out.println("Estou esvaziando...");
		} else {
			System.out.println("ERRO! A garrafa já está vazia!");
		}
	}
}
