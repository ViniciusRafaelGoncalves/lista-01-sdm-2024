package pratica_2;

public class Programa {
	public static void main(String[] args) {

		Atleta atleta = new Atleta();

		atleta.setNome("Usain Bolt");
		atleta.setQntDeMedalhas(8);
		atleta.setPais("Jamaica");

		atleta.exibirInformacoes();
	}
}