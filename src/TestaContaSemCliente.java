public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoDavi = new Conta(22222,3333333);
		System.out.println(contaDoDavi.getSaldo());

		contaDoDavi.setTitular(new Cliente());
		System.out.println(contaDoDavi.getTitular());

		contaDoDavi.getTitular().setNome("Davi");
		System.out.println(contaDoDavi.getTitular().getNome());

	}
}