import java.util.Scanner;

public class Exercicio03 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = 0;
		System.out.println("Digite um numero: ");
		System.out.println(
				"O número digitado é " + ((new Scanner(System.in).nextInt() > 100) ? "maior " : "menor ") + 100 );
	}
}
