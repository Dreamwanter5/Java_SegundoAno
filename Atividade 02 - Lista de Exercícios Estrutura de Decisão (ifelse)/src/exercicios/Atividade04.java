package exercicios;

import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double not1, not2, not3, not4, soma;
		System.out.println("Digite suas ultimas 4 notas, e diremos sua média.");
		System.out.println("Nota 1: ");
		not1 = scanner.nextDouble();
		System.out.println("Nota 2: ");
		not2 = scanner.nextDouble();
		System.out.println("Nota 3: ");
		not3 = scanner.nextDouble();
		System.out.println("Nota 4: ");
		not4 = scanner.nextDouble();
		soma = (not1+not2+not3+not4)/4;
		System.out.println("Sua média é: "+ soma);
		if (soma >= 7) {
			System.out.println("Aprovado.");
		} else {
			System.out.println("Reprovado.");
		}
		
		
		
		
		
	
	
		
		
	}
}
