public class Fatorial {
	public static void main(String[] args) {
		
		int respostaFatorial = 1;

		for (int i = 1; i <= 10; i++) {
			respostaFatorial  = respostaFatorial * i;
			System.out.println("Fatorial de " + i + ": " + respostaFatorial);

		}
	}
}