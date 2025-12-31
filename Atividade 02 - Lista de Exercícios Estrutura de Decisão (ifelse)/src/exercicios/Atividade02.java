package exercicios;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {
		double n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira um número, diremos se ele é negativo, positivo ou igual a zero.");
		n = scanner.nextDouble();
		if (n > 0 ) {
			System.out.println("O valor é positivo.");}
		else if (n < 0) {
			System.out.println("O valor é negativo.");
		}
		else {
			 System.out.println("O número é igual a 0.");
		 }
		
		
	}	
}
