package edu.br.pr.ifpr;

import java.util.Scanner;

public class SoftwareParaCálculoDoImc {
	public static void main(String[] args) {
		double kg;
		double altura;
		double soma;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nos diga seu peso: ");
		kg = scanner.nextDouble();
		System.out.println("Nos diga sua altura:" );
		altura = scanner.nextDouble();
		
		soma = kg/(altura*altura);
		System.out.println("Seu IMC é: " + soma);
		
		
		
		
	}

}
