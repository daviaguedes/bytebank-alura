public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoDavi = new Conta(1111,22222);
		contaDoDavi.deposita(100);
		contaDoDavi.deposita(50);
		System.out.println(contaDoDavi.getSaldo());

		boolean conseguiuRetirar = contaDoDavi.saca(20);
		System.out.println(contaDoDavi.getSaldo());
		System.out.println(conseguiuRetirar);

		Conta contadoKaabii = new Conta(3333,44444);
		contadoKaabii.deposita(1000);

		boolean sucessoTransferencia = contadoKaabii.transfere(300, contaDoDavi);

		if (sucessoTransferencia) {
			System.out.println("transferencia com sucesso");

		} else {
			System.out.println("faltou dinheiro");

		}
		System.out.println(contadoKaabii.getSaldo());
		System.out.println(contaDoDavi.getSaldo());
	}

}