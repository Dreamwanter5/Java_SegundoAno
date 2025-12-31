package ifpr.edu.br.pr;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String resp;
		System.out.println("Informe uma leta ou número para seu signo:");
		System.out.println("A ou 1 para Áries"+"\nT ou 2 para Touro"+"\nG ou 3 para Gêmeos"+"\nC ou 4 para Câncer.");
		resp = scanner.next();
		switch (resp) {
		case "A","a","1" -> System.out.println("Para você, ÁRIES, o universo lhe reserva muitas batalhas.");
		case "T", "t","2" -> System.out.println("Para você TOURO, o universo lhe reserva um descanso ");
		case "G", "g","3" -> System.out.println("Para você GÊMOS, o universo lhe reserva muitas pessoas complicadas no seu caminho");
		case "C", "c","4" -> System.out.println("Para você CÂNCER, o universo lhe reserva uma pessoa que vai mudar sua vida.");
		}
		
	}
}
