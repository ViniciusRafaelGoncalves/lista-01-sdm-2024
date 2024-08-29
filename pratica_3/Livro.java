package pratica_3;

public class Livro {
	private String nome;
	private String autor;
	private String editora;
	private int paginas;

	public Livro() {
	}

	public Livro(String nome, String autor, String editora, int paginas) {
		this.nome = nome;
		this.autor = autor;
		this.editora = editora;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public void infLivro() {
		System.out.println("Nome: " + nome + "\nAutor: " + autor + "\nEditora: " + editora + "\nPÃ¡ginas: " + paginas);
	}

}