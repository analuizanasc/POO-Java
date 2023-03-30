
public class Garrafa {
	String cor;
	String tamanho;
	int ml;
	boolean cheia;
	boolean tampada;
	
	void status() { 
		System.out.println("Cor da garrafa:" + this.cor);
		System.out.println("Tamanho da garrafa:" + this.tamanho);
		System.out.println("A garrafa tem quantos ml´s?" + this.ml);
		System.out.println("A garrafa está cheia!" + this.cheia);
		System.out.println("A garrafa está tampada!" + this.tampada);
	}
	void encher() {
		if (this.cheia == true) {
			System.out.println("ERRO! A garrafa já está cheia!");
		} else {
			System.out.println("Estou enchendo...");
		}
	}
	
	void tampada() {
		this.tampada = true;
	}
	
	void destampada() {
		this.tampada = false;
	}
	
	void esvaziar() {
		if ( this.cheia == true) {
			System.out.println("Estou esvaziando...");
		} else {
			System.out.println("ERRO! A garrafa já está vazia!");
		}
	}
}
