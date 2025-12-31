package aula.repeticao;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Infome a quantidade de vezes que a mensagem será repitida:");
		int c = scanner.nextInt();
		
		
		for (int i = 1;i < c+1; i++) {
			
			System.out.println("Bem vindo ao IFPR campus Jacarezinho!");
			
		}

	}

}
