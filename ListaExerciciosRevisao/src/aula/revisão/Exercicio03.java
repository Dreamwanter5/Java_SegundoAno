package aula.revisão;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		int ganhoempresa;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os ganhos de sua empresa: ");
		ganhoempresa = scanner.nextInt();
		if (ganhoempresa <= 200000 ) {
			System.out.println("Sua empresa se categoriza como pequena empresa.");			
		} else if (ganhoempresa >= 200001 && ganhoempresa <= 500000 ) {
			System.out.println("Sua empresa se categoriza como media empresa");
		} else {
			System.out.println("Você possui uma grande empresa");
			
		}
	}
}
