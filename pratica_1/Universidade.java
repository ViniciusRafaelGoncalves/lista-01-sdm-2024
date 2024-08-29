package pratica_1;

public class Universidade {
	private String nome;
	private String cnpj;
	private String endereco;
	private int qtdeDeSalas;

	public Universidade() {
	}

	public Universidade(String nome, String cnpj, String endereco, int qtdeDeSalas) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.qtdeDeSalas = qtdeDeSalas;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getQtdeDeSalas() {
		return qtdeDeSalas;
	}

	public void setQtdeDeSalas(int qtdeDeSalas) {
		this.qtdeDeSalas = qtdeDeSalas;
	}

}
