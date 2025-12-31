package aula.revisão;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		String signo;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o equivalente de seu signo:");
		System.out.println("A ou 1 = Áries");
		System.out.println("T ou 2 = Touro");
		System.out.println("G ou 3 = Gemeos");
		System.out.println("C ou 4 = Cancer");
		signo = scanner.nextLine();
		switch (signo) {
		case "A","1" -> System.out.println("Áries");
		case "T","2" -> System.out.println("Touro");
		case "G","3" -> System.out.println("Gemeos");
		case "C","4" -> System.out.println("Cancer");
		
		}
		
	}
}
