package exercicios;

import java.util.Scanner;

public class Atividade06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Digite um número: ");
		n = scanner.nextInt();
		if (n % 7 == 0) {
			System.out.println("O número é divisivel por 7.");
		} else {
			System.out.println("O número não é divisivel por 7.");
			
		}
	}
}
