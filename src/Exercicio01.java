import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = in.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = in.nextInt();
		
		System.out.println("Digite sua cidade de nascimento: ");
		String cidade = in.next();
		
		  System.out.print("Seu nome �  "+nome);
          System.out.print(", � natural de "+cidade);
          System.out.print(",tem  "+idade);
          System.out.print("anos.");
	}
}
