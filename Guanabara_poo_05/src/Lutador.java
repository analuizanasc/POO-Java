
public class Lutador implements Menu {
	
	//atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//metodos
	
	public Lutador(String no, String na, int ida, double alt, double pe, int vit, int der, int emp ) {
		this.setNome(no);
		this.setNacionalidade(na);
		this.setIdade(ida);
		this.setAltura(alt);
		this.setPeso(pe);
		this.setVitorias(vit);
		this.setDerrotas(der);
		this.setEmpates(emp);
	}
	

	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	private String getNacionalidade() {
		return nacionalidade;
	}
	
	private void setIdade(int idade) {
		this.idade = idade;
	}
	
	private int getIdade() {
		return idade;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(peso < 52.2) {
			this.categoria = "Inválido";
		} else if (peso <= 70.3) {
			this.categoria = "Leve";
		} else if (peso <= 83.9) {
			this.categoria = "Médio";
		} else if (peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public void apresentar() {
		System.out.println("Com vocês... " + this.getNome());
	}
	
	public void status() {
		System.out.println("-------------------------");
		System.out.println("Nacionalidade: " + this.nacionalidade);
		System.out.println("Idade: " + this.getIdade());
		System.out.println("Altura: " + this.getAltura() + " m");
		System.out.println("Peso: " + this.peso + " kg");
		System.out.println("Categoria: " + this.categoria);
		System.out.println("Vitórias: " + this.vitorias);
		System.out.println("Derrotas: " + this.derrotas);
		System.out.println("Empates: " + this.empates);
		System.out.println("-------------------------");	
	}
	
	public void ganharLuta() {
		this.setVitorias(getVitorias() + 1); 
	}
	
	public void perderLuta() {
		this.setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		this.setEmpates(getEmpates() + 1);
		
	}
	
	
}
