package pratica_1;

public class Programa {
	public static void main(String[] args) throws Exception {
		Universidade universidade = new Universidade();

		universidade.setNome("UNA");
		universidade.setCnpj("05.648.257/0001-78");
		universidade.setEndereco("R. dos Aimorés, 1451 - Lourdes, Belo Horizonte - MG");
		universidade.setQtdeDeSalas(250);

		System.out.println("Universidade: " + universidade.getNome());
		System.out.println("Endereço: " + universidade.getEndereco());
		System.out.println("CNPJ: " + universidade.getCnpj());
		System.out.println("Quantidade de salas: " + universidade.getQtdeDeSalas());
	}
}