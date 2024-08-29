package pratica_2;

public class Atleta {
	private String nome;
	private int qntDeMedalhas;
	private String pais;

	public Atleta() {
	}

	public Atleta(String nome, int qntDeMedalhas, String pais) {
		this.nome = nome;
		this.qntDeMedalhas = qntDeMedalhas;
		this.pais = pais;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQntDeMedalhas() {
		return qntDeMedalhas;
	}

	public void setQntDeMedalhas(int qntDeMedalhas) {
		this.qntDeMedalhas = qntDeMedalhas;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public void exibirInformacoes() {
		System.out.println("Nome: " + nome);
		System.out.println("PaÃs: " + pais);
		System.out.println("Quantidade de medalhas: " + qntDeMedalhas);
	}

}