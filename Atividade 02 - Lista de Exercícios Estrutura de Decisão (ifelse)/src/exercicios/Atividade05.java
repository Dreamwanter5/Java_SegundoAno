package exercicios;

import java.util.Scanner;

public class Atividade05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double num;
		System.out.println("Insira um número: ");
		num = scanner.nextDouble();
		if (num >= 20 && num <= 90) {
			System.out.println("O número digitado esta entre 20 e 90");
		}  else {
			System.out.println("O número não esta entre 20 ou 90.");
		}
		
	
	
		
		
	}
}
