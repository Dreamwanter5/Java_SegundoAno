package aula.revisão;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		String nome, descricao, categoria;
		double valor;
		boolean multi;
		
		
		System.out.println("Para cadastrar seu jogo na loja, informe detalhes:");
		System.out.println("Nome do Jogo:");
		nome = scanner.nextLine();
		System.out.println("Descrição:");
		descricao = scanner.nextLine();
		System.out.println("Categoria: ");
		categoria = scanner.nextLine();
		System.out.println("O jogo tem multiplayer?");
		multi = scanner.nextBoolean();
		

		
		System.out.println("----------------------------------------");
		System.out.println("Nome do jogo:"+ nome);
		System.out.println("Descrição do:"+ descricao);
		System.out.println("O jogo porta multiplayer?:"+ multi);
		System.out.println("Categoria do jogo:"+ categoria);
		
		

	}

}
