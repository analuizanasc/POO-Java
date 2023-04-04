
public class Main {

	public static void main(String[] args) {

		Mamifero mamifero = new Mamifero();
		Lobo lobo = new Lobo();
		Cachorro c = new Cachorro();
		
		mamifero.emitirSom();
		lobo.emitirSom();
		
		c.reagir("Olá");
		c.reagir("Vá apanhar");
		c.reagir(11, 45);
		c.reagir(21, 00);
		c.reagir(true);
		c.reagir(false);
		c.reagir(2, 12.5f);
		c.reagir(17, 4.5f);
	
	}

}
