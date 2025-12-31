package ifpr.edu.br;

import java.util.Scanner;

public class ExercicioYield {
	public static void main(String[] args) {
		double n1, n2, res;
		int op;

		Scanner scanner = new Scanner(System.in);

		System.out.println("insira dois valores:");
		n1 = scanner.nextDouble();
		n2 = scanner.nextDouble();
		System.out.println("Qual operação deseja fazer?" + "\n1 - Soma dos números" + "\n2 - Subtração dos números"
				+ "\n3 - Multiplicação dos números" + "\n4 - Divisão dos números");
		op = scanner.nextInt();

		switch (op) {
		case 1 -> System.out.println("Soma " + (n1 + n2));
		case 2 -> System.out.println("Subtração " + (n1 - n2));
		case 3 -> System.out.println("Multiplicação " + (n1 * n2));
		case 4 -> System.out.println("Divisão " + (n1 / n2));
		default -> throw new IllegalStateException("Insira um número válido");

		}

	}
}