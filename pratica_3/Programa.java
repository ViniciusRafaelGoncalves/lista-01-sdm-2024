package pratica_3;

public class Programa {
	public static void main(String[] args) throws Exception {

		Livro livro = new Livro();
		livro.setAutor(" Antoine de Saint-Exupéry");
		livro.setEditora("Editora Garnier");
		livro.setNome("O Pequeno Príncipe");
		livro.setPaginas(96);

		livro.infLivro();
	}
}
