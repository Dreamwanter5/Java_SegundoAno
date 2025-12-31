package ifpr.edu.br;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		String est;
		Scanner sc = new Scanner(System.in);
		System.out.println("Diga uma letra e te direi sua estação. ");
		est = sc.nextLine();
		// Switch 2.0
		switch (est) {
		case "P", "p" -> System.out.println("Primavera");

		case "O", "o" -> System.out.println("Outono");
		case "I", "i" -> System.out.println("Inverno");
		case "V", "v" -> System.out.println("Verão");
		default -> throw new IllegalStateException("Digite uma inicial válida.");

		}

	}
}
