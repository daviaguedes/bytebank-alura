public class TesteSacaNeagivo {
	public static void main(String[] args) {
		Conta conta = new Conta(0000,2222222);
		System.out.println(conta.saca(101));

		conta.saca(101);

		System.out.println(conta.getSaldo());

	}
}