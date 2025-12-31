package aula.repeticao;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] nIdd = new int[11];
		System.out.println("Informe 10 idades: ");
		for (int contador = 1; contador<nIdd.length; contador++) {
			System.out.println("Idade "+contador);
			nIdd[contador] = scanner.nextInt();
		}
		for (int contador = 1; contador<nIdd.length; contador++) {
			if (nIdd[contador]<= 17) {
				System.out.println(nIdd[contador]+ ", Você é menor de idade.");
			} else System.out.println(nIdd[contador]+ ", Você é maior de idade.");
		}
	}
}
