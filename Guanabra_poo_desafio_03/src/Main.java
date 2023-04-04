
public class Main {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula 01 de POO");
		v[1] = new Video("Aula 02 de Java");
		v[2] = new Video("Aula 01 de Python");
		
		System.out.println(v[0].toString());
		
		Gafanhoto g[] = new Gafanhoto[2];
		
		g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
		g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita");
		
		System.out.println(g[0].toString());
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0],v[2]);
		vis[0].avaliar();
		vis[1] = new Visualizacao(g[0],v[1]);
		vis[1].avaliar(87f);
		
		System.out.println(vis[0].toString());
		System.out.println(vis[1].toString());
	}

}
