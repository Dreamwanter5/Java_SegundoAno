package exercicios;

import java.util.Scanner;

public class Atividade09 {
	public static void main(String[] args) {
		String nom1, nom2;
		double vida1, vida2, forca1, forca2, defesa1, defesa2, agi1, agi2;
		int batalha;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Para uma batalha de cartas."+"\n"+"\nInforme o nome de sua primeira carta:");
		nom1 = scanner.next();
		System.out.println("\n"+"   Atributos de: "+nom1+"\n --------------------------");

		System.out.println("Vida: ");
		vida1 = scanner.nextDouble();
		System.out.println("Força: ");
		forca1 = scanner.nextDouble();
		System.out.println("Defesa: ");
		defesa1 = scanner.nextDouble();
		System.out.println("Agilidade: ");
		agi1 = scanner.nextDouble();
		System.out.println("\n");

		System.out.println("Agora informe os detalhes da carta 2"+"\n");
		System.out.println("Nome da carta 2: ");
		nom2 = scanner.next();
		System.out.println("\n"+"   Atributos de: "+nom2+"\n --------------------------");

		System.out.println("Vida: ");
		vida2 = scanner.nextDouble();
		System.out.println("Força: ");
		forca2 = scanner.nextDouble();
		System.out.println("Defesa: ");
		defesa2 = scanner.nextDouble();
		System.out.println("Agilidade: ");
		agi2 = scanner.nextDouble();
		System.out.println("\n");

		System.out.println("AS CARTAS CRIADAS FORAM: ");
		System.out.println("CARTA 1:" + "\n NOME: " + nom1 + "\n VIDA:" + vida1 + "\n FORÇA:" + forca1 + "\n DEFESA:"
				+ defesa1 + "\n AGILIDADE:" + agi1+"\n");

		System.out.println("CARTA 2" + "\n NOME: " + nom1 + "\n VIDA:" + vida1 + "\n FORÇA:" + forca1 + "\n DEFESA:"
				+ defesa1 + "\n AGILIDADE:" + agi1+"\n");

		System.out.println("Como as cartas lutarão?" + "\n 1. Batalha de pontos de vida"
				+ "\n 2. Batalha de pontos de força." + "\n 3. Batalha de pontos de agilidade."
				+ "\n 4. Batalha de pontos de Defesa.");
		batalha = scanner.nextInt();
		if (batalha == 1) {
			if (vida1 >= vida2) {
				System.out.println(nom1 + " com " + vida1 + " Pontos de vida vence!");
			} else {
				System.out.println(nom2 + " com " + vida2 + " Pontos de vida vence!");
			}
		}
		if (batalha == 2) {
			if (forca1 >= forca2) {
				System.out.println(nom1 + " com " + forca1 + " Pontos de força vence!");
			} else {
				System.out.println(nom2 + " com " + forca2 + " Pontos de força vence!");
			}
		}
		if (batalha == 3) {
			if (agi1 >= agi2) {
				System.out.println(nom1 + ", com " + agi1 + " Pontos de agilidade vence!");
			} else {
				System.out.println(nom2 + ", com " + agi2 + " Pontos de agilidade vence!");
			}
		}
		if (batalha == 1) {
			if (defesa1 >= defesa2) {
				System.out.println(nom1 + " com " + defesa1 + " Pontos de defesa vence!");
			} else {
				System.out.println(nom2 + " com " + defesa2 + " Pontos de defesa vence!");
			}
		}

	}
}
