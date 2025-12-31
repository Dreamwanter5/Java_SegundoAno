package aula.repeticao;

import java.util.Scanner;

public class Exercicio05Eleição {

	public static void main(String[] args) {

		int voto;
		int[] vototaylor = new int[6];
		int[] votopatrick = new int[6];
		int[] vototyler = new int[6];
		int resultado1 = 0;
		int resultado2 = 0;
		int resultado3 = 0;

		Scanner scanner = new Scanner(System.in);

		for (int cont = 1; cont < 6; cont++) {
			System.out.println("Candidato 1: Taylor Swift, 313");
			System.out.println("Candidato 2: Tyler, the Creator, 453");
			System.out.println("Candidato 3: Patrick, 184");

			System.out.println("Para quem você vai votar?");
			voto = scanner.nextInt();
			if (voto == 313) {
				System.out.println(
						"-----------------------------------------------------" + "\nVocê votou em Taylor Swift.");
				vototaylor[cont] = 1;

			} else if (voto == 453) {
				System.out.println("-----------------------------------------------------"
						+ "\nVocê votou em Tyler, the creator.");
				vototyler[cont] = 1;
			} else {
				System.out
						.println("-----------------------------------------------------" + "\nVocê votou em Patrick.");
				votopatrick[cont] = 1;
			}
			System.out.println("-------------------------------------------------------");
		}
		for (int cont = 1; cont < 6; cont++) {
			resultado1 = resultado1 + vototaylor[cont];
			resultado2 = resultado2 + vototyler[cont];
			resultado3 = resultado3 + votopatrick[cont];
		}
		if (resultado1 > resultado2 && resultado1 > resultado3) {
			System.out.println("Taylor Swift venceu as eleições!\nCom "+resultado1+" votos!");
		} else if (resultado2 > resultado1 && resultado2 > resultado3) {
			System.out.println("Tyler, The Creator venceu as eleições!\nCom "+resultado2+" votos!");

		} else {
			System.out.println("Patrick venceu as eleições!\nCom "+resultado3+" votos!");
		}

	}

}
