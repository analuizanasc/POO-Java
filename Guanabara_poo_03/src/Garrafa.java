
public class Garrafa {
	public String cor;
	public String tamanho;
	private int ml;
	protected boolean cheia;
	protected boolean tampada;
	
	public Garrafa(String c, String t, int ml, boolean cheia, boolean tampada) {
		this.setCor(c);
		this.tamanho = t; //pode ser assim também se for público
		this.ml = ml;
		this.cheia = cheia;
		this.tampada = tampada;
	}
	
	
	public void status() { 
		System.out.println("----------------------------------");
		System.out.println("Dados da garrafa: ");
		System.out.println("Cor da garrafa: " + this.getCor());
		System.out.println("Tamanho da garrafa: " + this.getTamanho());
		System.out.println("Ml´s: " + this.ml);
		System.out.println("Cheia: " + this.cheia);
		System.out.println("Tampada: " + this.tampada);
	}
	
	public String getTamanho() {
		return this.tamanho;
	}
	
	public void setTamanho(String t) {
		this.tamanho = t;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public int getMl() {
		return this.ml;
	}
	
	public void setMl(int m) {
		this.ml = m;
	}
	
	public boolean getCheia() {
		return this.cheia;
	}
	
	public void setCheia(boolean cheia) {
		this.cheia = cheia;
	}
	
	public boolean getTampada() {
		return this.tampada;
	}
	
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public void tampar() {
		this.tampada = true;
	}
	
	public void destampar() {
		this.tampada = false;
	}
	
	protected void encher() {
		if ( this.cheia == true) {
			System.out.println("");
			System.out.println("ERRO! A garrafa já está cheia!");
			

		} else {
			System.out.println("");
			System.out.println("Estou enchendo...");
			System.out.println("");
		}
	}
	
	protected void esvaziar() {
		if ( this.cheia == true) {
			System.out.println("");
			System.out.println("Estou esvaziando...");
			System.out.println("");
		} else {
			System.out.println("");
			System.out.println("ERRO! A garrafa já está vazia!");
			System.out.println("");
		}
	}
}
