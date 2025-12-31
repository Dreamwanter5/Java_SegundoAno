package exercicios;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) {
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Diga um número: ");
		n = scanner.nextInt();
		if (n >= 10) {
			System.out.println("O valor é maior que 10.");
		} else {
			System.out.println("O valor é menor do que 10.");

		}

	}
}
