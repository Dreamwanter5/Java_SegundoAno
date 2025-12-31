package exercicios;

import java.util.Scanner;

public class Ativididade08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double lado1, lado2, lado3;
		System.out.println("Digite os lados de um triângulo.");
		System.out.println("Lado 1: ");
		lado1 = scanner.nextDouble();
		System.out.println("Lado 2: ");
		lado2 = scanner.nextDouble();
		System.out.println("lado 3: ");
		lado3 = scanner.nextDouble();
		if (lado1 == lado2 && lado1 == lado3){
			System.out.println("Equilatéro");
		} 
		else if (lado1 == lado2 || lado1 == lado3) {
			System.out.println("Isósceles.");
		} else {
			System.out.println("Escaleno");
		}

	}

}
