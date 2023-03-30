
public class Aula03 {

	public static void main(String[] args) {
		Garrafa g1 = new Garrafa("verde", "pequeno", 100, false, true);
		g1.cor = "branco";
		g1.tamanho = "grande";
		//g1.ml = 100;
		g1.cheia = false;
		g1.status();
		g1.encher();
		
		Garrafa g2 = new Garrafa("azul", "médio", 1, true, false);
		//g2.setCor("preto");
		//g2.setTamanho("pequeno");
		g2.status();
		g2.encher();
		
	}
}
