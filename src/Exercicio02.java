import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite o seu login: ");
		String login = in.nextLine();

		System.out.println("Digite sua senha: ");
		String senha = in.nextLine();

		if (login.equals("leonardo") && senha.equals("123")) {
			System.out.println("Logado");
		} else {
			System.out.println("Usuario ou senha incorreta.");

		}
	}
}
