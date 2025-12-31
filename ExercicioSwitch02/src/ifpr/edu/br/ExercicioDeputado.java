package ifpr.edu.br;

import java.util.Scanner;

public class ExercicioDeputado {
	public static void main(String[] args) {
		int cand;
		Scanner scanner = new Scanner(System.in);
		System.out.println("ESCOLHA SEU CANDIDATO:");
		System.out.println("143 PARA GABRIEL SOARES DOS SANTOS");
		System.out.println("278 PARA GABRIEL MESQUITA ALMEIDA");
		System.out.println("187 PARA GABRIEL DA SILVA");
		cand = scanner.nextInt();
		switch (cand) {
		case 143 -> System.out.println("VOCÊ VOTOU EM GABRIEL SOARES DOS SANTOS");
		case 278-> System.out.println("VOCÊ VOTOU EM GABRIEL MESQUITA ALMEIDA");
		case 187 -> System.out.println("VOCÊ VOTOU EM GABRIEL DA SILVA");
		}

	}
}
