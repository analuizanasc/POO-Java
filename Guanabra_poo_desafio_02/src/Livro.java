
public class Livro implements Publicacao {

	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	

	public String detalhes() {
		return "Livros: \n Título = " + titulo + "\n Autor = " + autor + "\n Total de Paginas = " + totPaginas + "\n Página Atual = " + pagAtual
				+ "\n Aberto = " + aberto + "\n Leitor = " + leitor.getNome() + "\n Idade = " + leitor.getIdade() + "\n Sexo = " + leitor.getSexo();
	}



	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.aberto = false;
		this.pagAtual = 0;
		this.leitor = leitor;
	}



	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean isAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}

	@Override
	public void abrir() {
		this.aberto = true;
		
	}

	@Override
	public void fechar() {
		this.aberto = false;
		
	}

	@Override
	public void folhear( int p) {
		if (p > this.totPaginas) {
			this.pagAtual = 0;
			System.out.println("O livro tem menos páginas!");
		} else {
			this.pagAtual = p;
		}
		
	}
	
	@Override
	public void avancarPag() {
		this.pagAtual ++; 
		
	}

	@Override
	public void voltarPag() {
		this.pagAtual --;
		
	}
}
