package aula.decisão;

import java.util.Scanner;

public class EscolhaDia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dia;
		System.out.println("Informe um núumero e determine o dia:");
		dia = scanner.nextInt();

		// Switch é uma declaração uma escolha entre múltiplos caminhos.
		// dependendo de qual for a minha escolha, o switch tomará uma ação

		switch (dia) {
		// caso 1, escreva domingo, caso 2 escreva segunda, etc...
		case 1:
			System.out.println("Domingo.");
			break;
			// Caso o caso 1 ja seja atendido, o break serve para finalizar o código
		case 2:
			System.out.println("Segunda.");
			break;
		case 3:
			System.out.println("Terça-Feira.");
			break;
		case 4:
			System.out.println("Quarta-Feira.");
			break;
		case 5:
			System.out.println("Quinta-Feira.");
			break;
		case 6:
			System.out.println("Sexta-Feira.");
			break;
		case 7:
			System.out.println("Sábado.");
			break;
		default:
			System.out.println("Escolha inválida.");
			break;
			
		}

	}

}
